package program;

import converters.AbstractConverter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ConvertList_Name {
    //ArrayLists

    private final ArrayList<String> distanceList = new ArrayList<>();
    private final ArrayList<String> areaList = new ArrayList<>();
    private final ArrayList<String> volumeList = new ArrayList<>();
    private final ArrayList<String> massList = new ArrayList<>();
    private final ArrayList<String> timeList = new ArrayList<>();
    private final ArrayList<String> speedList = new ArrayList<>();
    private final ArrayList<String> accelerationList = new ArrayList<>();
    private final ArrayList<String> storageList = new ArrayList<>();
    private final ArrayList<String> converterLister = new ArrayList<>();
    //Atributes:
    private String[] archives;

    public ArrayList<String> getDistanceList() {
        return distanceList;
    }

    public ArrayList<String> getAreaList() {
        return areaList;
    }

    public ArrayList<String> getVolumeList() {
        return volumeList;
    }

    public ArrayList<String> getMassList() {
        return massList;
    }

    public ArrayList<String> getTimeList() {
        return timeList;
    }

    public ArrayList<String> getSpeedList() {
        return speedList;
    }

    public ArrayList<String> getAccelerationList() {
        return accelerationList;
    }

    public ArrayList<String> getStorageList() {
        return storageList;
    }

    public ArrayList<String> getConverterLister() {
        return converterLister;
    }

    public void ConvertLister() {

        File file = new File("C:\\Users\\htols\\Desktop\\projII_poo\\src\\converters");
        this.archives = file.list();

        for (String file_list : this.archives) {

            if (!(file_list.equals("AbstractConverter.java")) && !(file_list.equals("MeasureType.java")) && !(file_list.equals("classes"))) {
                try {

                    String class_name = file_list.substring(0, file_list.indexOf("."));
                    AbstractConverter obj_abs = (AbstractConverter) Class.forName("converters." + class_name).newInstance();
                    this.converterLister.add(obj_abs.getName() + file_list);

                    // ----------------- PARTE DE FILTRAR A COMBOBOX -------------------
                    int index_begin = obj_abs.getName().indexOf("[");
                    int index_end = obj_abs.getName().indexOf("]");
                    String unit = obj_abs.getName().substring(index_begin + 1, index_end);

                    //salva todas as classes de medida de acordo com o seu tipo em listas diferentes
                    if (unit.equals("distance")) {
                        this.distanceList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("area")) {
                        this.areaList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("volume")) {
                        this.volumeList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("mass")) {
                        this.massList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("time")) {
                        this.timeList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("speed")) {
                        this.speedList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("acceleration")) {
                        this.accelerationList.add(obj_abs.getName() + file_list);
                    }
                    if (unit.equals("storage")) {
                        this.storageList.add(obj_abs.getName() + file_list);
                    }

                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    JOptionPane.showMessageDialog(null, "Error:" + e);
                }
            }
        }
        Collections.sort(converterLister); //Colocar em ordem alfabética a lista 
    }
}
