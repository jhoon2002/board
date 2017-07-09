package com.jhoon.springboard.util;
import org.hibernate.cfg.ImprovedNamingStrategy;

 
public class PrefixNamingStrategy extends ImprovedNamingStrategy {
    private static final long serialVersionUID = 1L;
    private static final String TABLE_SUFFIX = "SB1_";
    private String writeTableSuffix;

    public PrefixNamingStrategy() {
    }
    public String getNewTableName() {
        return writeTableSuffix;
    }
    @Override
    public String tableName(String tableName) {

        StringBuilder newTableName = new StringBuilder();
        
        newTableName.append(TABLE_SUFFIX);
        newTableName.append(tableName);

        return newTableName.toString();
    }
}
