package pl.codeleak.patterns.adapter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //TODO stwórz adapter, który przekształci interfejsy
        // i umożliwi wykorzystanie metody z nieznanego interfejsu (XmlParser2)

        XmlParser11 xmlParser11 = new XmlParser11();
        Stream<String> xmlStream = Stream.of("<start>", "content", "</start>");

        String xmlString = xmlStream.collect(Collectors.joining());

        // FIXME
        // Xml xml = xmlParser2.parse(xmlStream);
        Xml xml = xmlParser11.parse(xmlString);
        System.out.println(xml);
    }
}
