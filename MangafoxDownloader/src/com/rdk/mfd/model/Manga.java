/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdk.mfd.model;

/**
 * The manga class
 * @author Rdk
 */
public class Manga {
    private String name;
    private String url;
    
    /**
     * Default Constructor
     * @author Rdk
     */
    public Manga() {
        this.name = "JustADummyName";
        this.url = "dmm://justadummyname.dmm";
    }   
    
    /**
     * Constructor
     * @param name
     * @param url 
     */
    public Manga(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    /**
     * Get the name
     * @return 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Set the name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the url
     * @return 
     */
    public String getUrl() {
        return this.url;
    }
    
    /**
     * Set the url
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
