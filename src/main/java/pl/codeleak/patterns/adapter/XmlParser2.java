package pl.codeleak.patterns.adapter;

import java.util.stream.Stream;

public interface XmlParser2 {
    Xml parse(Stream<String> xml);
}
