package exp;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProf {

    ServiceProf serviceProf;

    public BuscaProf(ServiceProf service){
        this.serviceProf = service;
    }

    public Professor buscaProf(int id){
        // id = 10 -> buscando um inimigo de ID 10
        //InimigoJson é uma string que retornou do serviço
        String profJson = serviceProf.busca(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(profJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean verificaArrayListExistente(int id){
        boolean profExistente = serviceProf.profExistente(id);

        if (profExistente){
            return true;
        }else{
            return false;
        }
    }

}
