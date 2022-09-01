package exp;

import java.util.ArrayList;

public class MockProfService implements ServiceProf{

    @Override
    public String busca(int id) {
        if(id == 1) {
            return ProfConst.A;
        } else if (id == 2) {
            return ProfConst.B;
        } else if (id == 3) {
            return ProfConst.C;
        }else{
            return ProfConst.INEXISTENTE;
        }
    }

    @Override
    public boolean profExistente(int id) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int i=0; i < list.size(); i++){
            if(list.get(i).equals(id) || list.get(i).equals(id)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
