package com.jhoon.springboard.util;

public class WriteTableNamimgStrategy extends PrefixNamingStrategy {

    private static final long serialVersionUID = 1L;
    private String writeTableSuffix;
    
    public WriteTableNamimgStrategy(String boid) {
        super();
        this.writeTableSuffix = "_" + boid.toUpperCase();
    }

    public String getNewTableName() {
        return writeTableSuffix;
    }
    @Override
    public String tableName(String tableName) {
        
        if (!(tableName.equals("WRITE"))) {
            return tableName;
        }
        StringBuilder newTableName = new StringBuilder();
        
        //newTableName.append(super.getTableSuffix());
        newTableName.append(tableName);
        newTableName.append(writeTableSuffix);
 
        return newTableName.toString();
        
    }
}
