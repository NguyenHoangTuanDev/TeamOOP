package thư_viện;

import java.util.ArrayList;

public interface IListFile
{
    void readListDataInDatabase(ArrayList<String> collection);
    
    ArrayList<String> writeListDataInDatabase();
}
