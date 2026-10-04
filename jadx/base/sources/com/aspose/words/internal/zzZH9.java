package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH9 {
    public static String zzWOX = "Illegal name character {0}";
    public static String zzWOY = "Illegal first name character {0}";
    public static String zzWOZ = "Illegal to pass empty name";
    public static String zzWP0 = "Trying to write an attribute when there is no open start element.";
    public static String zzWP1 = "Illegal input: comment content has embedded '--' in it (index {0})";
    public static String zzWP2 = "Illegal input: CDATA block has embedded ']]>' in it (index {0})";
    public static String zzWP3 = "Trying to output second root, <{0}>";
    public static String zzWP4 = "Trying to output non-whitespace characters outside main element tree (in prolog or epilog)";
    public static String zzWP5 = "Trying to output a CDATA block outside main element tree (in prolog or epilog)";
    public static String zzWP6 = "Unexpected root element <{0}>; expected <{0}> as per DOCTYPE declaration";
    public static String zzWP7 = "Element <{0}> has no attribute \"{1}\"";
    public static String zzWP8 = "Element <{0}> has ANY content specification; can not contain {1}";
    public static String zzWP9 = "Element <{0}> has non-mixed content specification; can not contain non-white space text, or any CDATA sections";
    public static String zzWPA = " (CDATA not allowed in prolog/epilog)";
    public static String zzWPB = "Duplicate DOCTYPE declaration";
    public static String zzWPC = "Can not have DOCTYPE declaration in epilog";
    public static String zzWPD = "XML 1.0 document can not refer to XML 1.1 parsed external entities";
    public static String zzWPE = "Current event ({0}) not START_ELEMENT, END_ELEMENT, CHARACTERS or CDATA";
    public static String zzWPF = "Current event not PROCESSING_INSTRUCTION";
    public static String zzWPG = "Current event not START_ELEMENT or END_ELEMENT";
    public static String zzWPH = "Current event not START_ELEMENT";
    public static String zzWPI = "Unrecognized feature \"{0}\"";
    public static String zzWPJ = "Illegal to pass null as argument";
    public static String zzWPK = "Internal error";
    public static String zzWPL = "Attribute \"{0}\" already declared for element <{1}>; ignoring re-declaration";
    public static String zzWPM = "Attribute \"{0}\" (for element <{1}>) declared multiple times";
    public static String zzWPN = "Missing DOCTYPE declaration in validating mode; can not validate elements or attributes";
    public static String zzWPO = "Inconsistent text encoding; declared as \"{0}\" in xml declaration, application had passed \"{1}\"";
    public static String zzWPP = "Undefined element \"{0}\"; referred to by attribute(s)";
    public static String zzWPQ = "schema validation";
    public static String zzWPR = "namespace declaration";
    public static String zzWPS = "doctype declaration";
    public static String zzWPT = "xml declaration";
    public static String zzWPU = "attribute declaration";
    public static String zzWPV = "element declaration";
    public static String zzWPW = "entity declaration";
    public static String zzWPa = "Element <{0}> has EMPTY content specification; can not contain {1}";
    public static String zzWPb = "Undefined element <{0}> encountered";
    public static String zzWPc = "Attribute xml:id has to have attribute type of ID, as per Xml:id specification";
    public static String zzWPd = "Attribute xml:space has to be defined of type enumerated, and have 1 or 2 values, 'default' and/or 'preserve'";
    public static String zzWPe = "Undeclared {0} entity \"{1}\"";
    public static String zzWPf = "Trying to redefine notation \"{0}\" (originally defined at {1})";
    public static String zzWPg = "Trying to redefine element \"{0}\" (originally defined at {1})";
    public static String zzWPh = "; expected #REQUIRED, #IMPLIED or #FIXED";
    public static String zzWPi = "; expected one of type (CDATA, ID, IDREF, IDREFS, ENTITY, ENTITIES NOTATION, NMTOKEN or NMTOKENS)";
    public static String zzWPj = "; expected a keyword (ATTLIST, ELEMENT, ENTITY, NOTATION), comment, or conditional section";
    public static String zzWPk = "Non-default namespace can not map to empty URI (as per Namespace 1.0 # 2) in XML 1.0 documents";
    public static String zzWPl = "Trying to bind URI 'http://www.w3.org/2000/xmlns/ to prefix \"{0}\" (can not be explicitly bound)";
    public static String zzWPm = "Trying to bind URI 'http://www.w3.org/XML/1998/namespace to prefix \"{0}\" (can only bind to 'xml')";
    public static String zzWPn = "Trying to declare prefix 'xmlns' (illegal as per NS 1.1 #4)";
    public static String zzWPo = "Trying to redeclare prefix 'xml' from its default URI 'http://www.w3.org/XML/1998/namespace' to \"{0}\"";
    public static String zzWPp = "Undeclared namespace prefix \"{0}\" (for attribute \"{1}\")";
    public static String zzWPq = "Undeclared namespace prefix \"{0}\"";
    public static String zzWPr = "Undeclared general entity \"{0}\" (document in stand-alone mode; perhaps declared externally?)";
    public static String zzWPs = "Undeclared general entity \"{0}\"";
    public static String zzWPt = "Entity \"{0}\" declared externally, but referenced from a document declared 'standalone=\"yes\"'";
    public static String zzWPu = "excepted either space or \"?>\" after PI target";
    public static String zzWPv = "Illegal processing instruction target (\"{0}\"); 'xml' (case insensitive) is reserved by the specs.";
    public static String zzWPw = "Missing processing instruction target";
    public static String zzWPx = "Unexpected keyword \"{0}\"; expected \"{1}\"";
    public static String zzWPy = "String ']]>' not allowed in textual content, except as the end marker of CDATA section";
    public static String zzWPz = "String '--' not allowed in comment (missing '>'?)";

    public static String zzgZ(int i) {
        switch (i) {
            case 1:
                return "START_ELEMENT";
            case 2:
                return "END_ELEMENT";
            case 3:
                return "PROCESSING_INSTRUCTION";
            case 4:
                return "CHARACTERS";
            case 5:
                return "COMMENT";
            case 6:
                return "SPACE";
            case 7:
                return "START_DOCUMENT";
            case 8:
                return "END_DOCUMENT";
            case 9:
                return "ENTITY_REFERENCE";
            case 10:
            default:
                return o0Oo0oo.OooO0O0(i, "[", "]");
            case 11:
                return "DTD";
            case 12:
                return "CDATA";
        }
    }
}
