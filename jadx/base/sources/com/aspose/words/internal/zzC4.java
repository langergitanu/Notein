package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzC4 {
    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "StartObject";
            case 2:
                return "StartArray";
            case 3:
                return "StartConstructor";
            case 4:
                return "PropertyName";
            case 5:
                return "Comment";
            case 6:
                return "Raw";
            case 7:
                return "Integer";
            case 8:
                return "Float";
            case 9:
                return "String";
            case 10:
                return "Boolean";
            case 11:
                return "Null";
            case 12:
                return "Undefined";
            case 13:
                return "EndObject";
            case 14:
                return "EndArray";
            case 15:
                return "EndConstructor";
            case 16:
                return "Date";
            case 17:
                return "Long";
            default:
                return "Unknown JsonToken value.";
        }
    }
}
