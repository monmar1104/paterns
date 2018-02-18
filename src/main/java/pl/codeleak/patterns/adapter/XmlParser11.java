package pl.codeleak.patterns.adapter;

public class XmlParser11 implements XmlParser1 {
    @Override
    public Xml parse(String xml) {
        return new Xml(xml);
    }
}
