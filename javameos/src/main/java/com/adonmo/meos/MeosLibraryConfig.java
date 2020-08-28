package com.adonmo.meos;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
    value = @Platform(
        includepath = {"/home/kc/Adonmo/code/meos/include"},
        include = {
            "meos/types/box/TBox.hpp",
        },
        linkpath = {"/home/kc/Adonmo/code/meos/build/test/_deps/libmeos-build"},
        link = {"meos"}
    ),
    global = "com.adonmo.meos.MeosLibrary"
)
public class MeosLibraryConfig implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("std::chrono::system_clock::time_point").pointerTypes("NanoChrono.TimePoint"));
    }
}
