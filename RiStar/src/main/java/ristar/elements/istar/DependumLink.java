/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristar.elements.istar;

/**
 *
 * @author anamm
 */
public class DependumLink extends Link{
    public DependumLink(Dependum dependum) {        
        super(dependum.getDependency().getDepender(),dependum.getDependency().getDependee());
        dependum.setLink(this);
    }
}
