package com.spring.project1.xml;


import com.spring.project1.scope.JdbcConnection;

public class XMLPersonDAO {

    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXMLJdbcConnection(JdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
