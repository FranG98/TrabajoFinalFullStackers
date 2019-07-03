/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Windows
 */
@ManagedBean
@ViewScoped
public class GraficoBean implements Serializable{

    @ManagedProperty(value="#{}")
    
private List<String> sectores;
private BarChartModel animatedModel2;

@PostConstruct
    public void init() {
        createAnimatedModels();
        Boolean existe = false;
        for (int j = 0; j < listaProductos.size(); j++){
            existe = false;
            if (getSectores().size() > 0){
                for (int k = 0; k < getSectores().size(); k++){
                     if (getSectores().get(k).equals(listaProductos.get(j).getSector())){
                         existe = true;
                     }
                }
                if (existe != true){
                    getSectores().add(listaProductos.get(j).getSector());
                }    
            }else{
                getSectores().add(listaProductos.get(j).getSector());
            }
        } 
    }
   
    public BarChartModel getAnimatedModel2() {
        return animatedModel2;
    }
    
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 120);
        boys.set("2005", 100);
        boys.set("2006", 44);
        boys.set("2007", 150);
        boys.set("2008", 25);
 
        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 110);
        girls.set("2007", 135);
        girls.set("2008", 120);
 
        model.addSeries(boys);
        model.addSeries(girls);
 
        return model;
    }
   
    private void createAnimatedModels() {
 
        animatedModel2 = initBarModel();
        animatedModel2.setTitle("Ventas entre las fechas especificadas");
        animatedModel2.setAnimate(true);
        animatedModel2.setLegendPosition("ne");
    Axis yAxis = animatedModel2.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    /**
     * @return the sectores
     */
    public List<String> getSectores() {
        return sectores;
    }

    /**
     * @param sectores the sectores to set
     */
    public void setSectores(List<String> sectores) {
        this.sectores = sectores;
    }

    
}
