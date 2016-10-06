package ua.ep.xml;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

/**
 * Created by Oleksii_Sydorenko on 10/5/2016.
 */
public class Runner {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse(
                Runner.class.getResourceAsStream("/Student.xml"));


        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile("/students/students_list/student[@id=1]/first_name");
        String result = (String) expr.evaluate(document, XPathConstants.STRING);
        System.out.println(result);

        XPathExpression exprList = xpath.compile("/students/students_list/student");
        NodeList nodeList = (NodeList) exprList.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.println(elem.getElementsByTagName("first_name")
                    .item(0).getFirstChild().getNodeValue()
                    + " " + elem.getElementsByTagName("last_name")
                    .item(0).getFirstChild().getNodeValue()
                    + " " + elem.getElementsByTagName("date_of_start")
                    .item(0).getFirstChild().getNodeValue());
        }


        XPathExpression exprCount = xpath.compile("count(//student)");
        String resultCount = (String) exprCount.evaluate(document, XPathConstants.STRING);
        System.out.println("Count of student = " + resultCount);

//        XPathExpression exprAll = xpath.compile("//student[1]//*/text()");
//        String nodeList2 = (String) exprAll.evaluate(document , XPathConstants.STRING);
//        System.out.println(nodeList2);


    }


}
