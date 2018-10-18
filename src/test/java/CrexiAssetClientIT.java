import client.CrexiAssetClient;
import docgenerator.EmailGenerator;
import docgenerator.ExcelGenerator;
import dto.crexi.AssetArrayDTO;
import dto.crexi.PropertyDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xyzer on 9/23/2018.
 */
public class CrexiAssetClientIT {

    @Test
    public void crexiAssetTest() throws IOException{

        CrexiAssetClient client = new CrexiAssetClient();

        HashMap<String,String> queryparams = new HashMap<>();
        queryparams.put("sqFtMax","10000");
        queryparams.put("askingPriceMax","150000000");
        queryparams.put("acreageMin","500");
        queryparams.put("states","tx");
        AssetArrayDTO assetArrayDTO = client.assetDto(queryparams);
        List<PropertyDTO> assets = assetArrayDTO.getData();
        assets.forEach(asset ->  System.out.println(asset.getName()));
        System.out.println(assetArrayDTO.getTotalCount());
    }

    @Test
    public void crexiExcelGenTest() throws Exception{
        CrexiAssetClient client = new CrexiAssetClient();
        HashMap<String,String> queryparams = new HashMap<>();
        queryparams.put("sqFtMax","10000");
        queryparams.put("askingPriceMax","150000000");
        queryparams.put("acreageMin","500");
        queryparams.put("states","tx");
        AssetArrayDTO assetArrayDTO = client.assetDto(queryparams);
        List<PropertyDTO> assets = assetArrayDTO.getData();
        String[] columns = {"Name", "Description"};
        //TODO: use variable in resources?
        String path = ("..\\resources\\");
        ExcelGenerator excelGen = new ExcelGenerator();
        excelGen.excelGen(path, assets, columns);
    }

    @Test
    public void sendEmail() throws Exception{
        EmailGenerator emailSend = new EmailGenerator();
        emailSend.sendMail();
    }


}
