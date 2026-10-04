package com.aspose.slides.internal.p060ca;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.text.util.LocalePreferences;
import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.TableStyleOptions;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18438z3;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.miui.penengine.p596e.C18773h;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import com.orion.notein.domain.models.User;
import com.orion.notein.domain.models.UserConstants;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2107h4 implements InterfaceC2110h9 {

    /* JADX INFO: renamed from: k4 */
    public static final C2107h4 f7286k4 = new C2107h4();

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f7287x1 = new C7017h4("noonhehinitialarabic", "reshhiriqhebrew", "reshsegolhebrew", "qofshevahebrew", "qofpatahhebrew", "lamedholamhebrew", "dalethatafpatah", "reshhatafsegolhebrew", "reshholam", "reshhiriq", "qofhatafpatahhebrew", "qofqubutshebrew", "reshshevahebrew", "qofhiriqhebrew", "qoftsere", "qoftserehebrew", "qofholamhebrew", "reshqubutshebrew", "tchehmeeminitialarabic", "daletqubutshebrew", "daletsegolhebrew", "dalettserehebrew", "daletholamhebrew", "daletsegol", "finalkafqamatshebrew", "qofsegolhebrew", "dalettsere", "qofhatafpatah", "qofhatafsegol", "daletholam", "hamzadammatanarabic", "reshhatafpatah", "reshsheva", "hamzafathaarabic", "reshpatahhebrew", "daletqamats", "finalkafqamats", "qofhiriq", "finalkafsheva", "qofhatafsegolhebrew", "daletshevahebrew", "reshsegol", "daletqamatshebrew", "hamzalowkasraarabic", "lamedholam", "reshholamhebrew", "qofpatah", "dalethatafsegol", "reshqubuts", "dalethatafpatahhebrew", "daletsheva", "qofqubuts", "qofsheva", "qofqamats", "finalkafshevahebrew", "dalethiriq", "hamzafathatanarabic", "lammeemkhahinitialarabic", "daletqubuts", "qofsegol", "hamzasukunarabic", "reshhatafsegol", "reshqamats", "reshpatah", "hamzalowkasratanarabic", "hamzadammaarabic", "qofholam", "lamedholamdagesh", "shaddafathatanarabic", "lammeemjeeminitialarabic", "reshhatafpatahhebrew", "dalethatafsegolhebrew", "reshtserehebrew", "reshqamatshebrew", "daletpatahhebrew", "daletpatah", "lamedholamdageshhebrew", "qofqamatshebrew", "rehyehaleflamarabic", "reshtsere", "dalethiriqhebrew", "Ecedillabreve", "SF370000", "Ezhcaron", "schwahook", "Dieresis", "zerowidthnonjoiner", "ideographicresourceparen", "mcubedsquare", "aarusquare", "acircumflextilde", "ddadeva", "eparen", "won", "hatafqamatswidehebrew", "rupeesignbengali", "beta", "rupiah", "plussuperior", "fourteencircle", "Benarmenian", "ainarabic", "afii10033", "afii10032", "afii10031", "eightgurmukhi", "afii10037", "afii10036", "middledotkatakanahalfwidth", "afii10034", "afii10039", "afii10038", "oubopomofo", "Scircle", "schwa", "hookpalatalizedbelowcmb", "Shhacyrillic", "yokatakana", "aivowelsigngujarati", "arrowrightoverleft", "bracerightmonospace", "keharmenian", "Horicoptic", "khieukhaparenkorean", "whitetelephone", "saraaethai", "ovowelsigngujarati", "chabengali", "sixmonospace", "Upsilonhooksymbol", "coarmenian", "braceleftvertical", "Zhedescendercyrillic", "braceleftmonospace", "rvocalicgujarati", "sehiragana", "pemiddlehookcyrillic", "plussmall", "dadmedialarabic", "Peharmenian", "semivoicedmarkkanahalfwidth", "enhookcyrillic", "jeemmedialarabic", "hehfinalalttwoarabic", "tchehfinalarabic", "nieuntikeutkorean", "yeorinhieuhkorean", "Aybarmenian", "ushortcyrillic", "threeinferior", "Ohorngrave", "overlinecmb", "nieunpansioskorean", "Wmonospace", "tserenarrowhebrew", "quotedblprime", "threecircleinversesansserif", "Jsmall", "kagurmukhi", "kcaron", "dblverticalbar", "thehfinalarabic", "arrowupleftofdown", "Mmonospace", "twoinferior", "ghadeva", "Cacute", "kukatakana", "hatafpatahwidehebrew", "rieulpieupkorean", "afii57426", "kohmsquare", "esmallhiragana", "tonesix", "nekatakanahalfwidth", "kahookcyrillic", "tehmeemisolatedarabic", "asmallkatakana", "yyadeva", "afii57796", "afii57929", "afii57799", "toarmenian", "ezhcurl", "twoarabic", "Uhornhookabove", "Usmall", "hiriq14", "tavhebrew", "equal", "ccedillaacute", "Dafrican", "yasmallhiragana", "udblacute", "tortoiseshellbracketleftvertical", "Edotaccent", "ismallkatakanahalfwidth", "lamjeeminitialarabic", "lamalefhamzabelowisolatedarabic", "qamatsqatanwidehebrew", "beharabic", "eopenreversedhook", "hatafqamatsnarrowhebrew", "aideva", "Pecyrillic", "radoverssquare", "controlUS", "arrowdashleft", "Iishortcyrillic", "oshortvowelsigndeva", "Izhitsacyrillic", "iigurmukhi", "mwmegasquare", "mikatakanahalfwidth", "ddhabengali", "afii10832", "afii10831", "shinhebrew", "rlinebelow", "rhadeva", "llladeva", "qamats1a", "Upsilon1", "uhungarumlautcyrillic", "semicolonsmall", "vagujarati", "Dsmall", "onethai", "bparen", "Thook", "rvocalicvowelsigndeva", "qamats29", "pbopomofo", "lessoverequal", "hehmedialaltonearabic", "arrowtabright", "yehnoonfinalarabic", "Igrave", "yasmallkatakana", "vturned", "parenleftbt", "registered", "tippigurmukhi", "SF450000", "umacrondieresis", "prescription", "eopen", "greaterequal", "Etildebelow", "iterationhiragana", "miribaarusquare", "ohornacute", "dcaron", "pehinitialarabic", "zedieresiscyrillic", "dotlessi", "Llinebelow", "wynn", "tehmedialarabic", "wikorean", "dollaroldstyle", "iacute", "Zdot", "blackstar", "kheicoptic", "qubutsnarrowhebrew", "tildedoublecmb", "twooldstyle", "iluyhebrew", "dlsquare", "tecyrillic", "Gmonospace", "gimarmenian", "ninepersian", "four", "tehmarbutaarabic", "sixgujarati", "aumatragurmukhi", "Voarmenian", "Digammagreek", "Schwacyrillic", "fivedeva", "notidentical", "rehiragana", "propersubset", "erbopomofo", "dhadeva", "afii57665", "afii57664", "afii57667", "afii57669", "afii57668", "iivowelsigngujarati", "Tsecyrillic", "cyrbreve", "lammeemhahinitialarabic", "Icyrillic", "Chedieresiscyrillic", "telishaqetanahebrew", "nine", "rhabengali", "ccircle", "Vecyrillic", "Adieresiscyrillic", "ringhalfrightcentered", "paseqhebrew", "Liwnarmenian", "ezhreversed", "schwadieresiscyrillic", "commareversedabovecmb", "yuyeokorean", "tsere12", "whitedownpointingtriangle", "kappa", "afii10063", "afii10062", "afii10067", "percentarabic", "nakatakanahalfwidth", "Xsmall", "maithothai", "yoyingthai", "tworoman", "duhiragana", "tavdages", "thzsquare", "tehnoonfinalarabic", "thehinitialarabic", "calsquare", "sixthai", "viramagujarati", "telephone", "saraaimaimuanthai", "Oslashacute", "hehfinalaltonearabic", "precedes", "Ymonospace", "qubutsquarterhebrew", "Uacutesmall", "Gamma", "heiseierasquare", "squareverticalfill", "tekatakanahalfwidth", "fdotaccent", "wihiragana", "Itilde", "mahiragana", "Hzsquare", "periodmonospace", "blacklowerlefttriangle", "Keharmenian", "aamatragurmukhi", "afii57424", "Oi", "ghhagurmukhi", "vavvavhebrew", "Tlinebelow", "upsilonlatin", "Yusbigcyrillic", "Gcaron", "xi", "adotmacron", "babengali", "dollarsmall", "asciicircummonospace", ContextChain.TAG_PRODUCT_AND_INFRA, "gammalatinsmall", "questiondown", "caroncmb", "oi", "phophanthai", "sevengurmukhi", "ideographmooncircle", "jeemarabic", "Ocyrillic", "lameddagesh", "hethebrew", "teharabic", "gcircumflex", "pekatakana", "Uhookabove", "udieresismacron", "rvocalicbengali", "hokatakana", "nonenthai", "ssangkiyeokkorean", "fourpersian", "SF230000", "lbelt", "samekh", "commaarmenian", "reversedtilde", "finalnun", "angkhankhuthai", "zerogujarati", "auvowelsignbengali", "congruent", "Bdotaccent", "fourhangzhou", "visargadeva", "five", "Icircle", "sofpasuqhebrew", "parenleftinferior", "rieulphieuphkorean", "Odblgrave", "Udieresis", "nukatakana", "maieklowleftthai", "Ucyrillic", "oekorean", "Toarmenian", "cornerbracketrightvertical", "dbopomofo", "kparen", "Ydieresis", "takatakana", "siluqhebrew", "esdescendercyrillic", "quoterightn", "aimatragurmukhi", "deleteleft", "threecircle", "ninecircleinversesansserif", "sheicoptic", "dochadathai", "chieuchparenkorean", "Smonospace", "xparen", "yehmedialarabic", "Alpha", "Yatcyrillic", "yehbarreefinalarabic", "cagurmukhi", "tikatakana", "yagujarati", "bdotbelow", "sterling", "Imonospace", "zhearmenian", "yehhamzaabovearabic", "controlDC1", "wekatakana", "Wgrave", "blacksmallsquare", "blackuppointingtriangle", "hehmedialarabic", "arc", "sixroman", "udblgrave", "ellipsis", "yehhamzaabovemedialarabic", "hamzalowarabic", "ninehangzhou", "vehmedialarabic", "ideographicnameparen", "oinvertedbreve", "harpoonleftbarbup", "Macronsmall", "Iinvertedbreve", "sosuathai", "maqafhebrew", "mieumaparenkorean", "Ismall", "holam26", "tikeutkorean", "ideographiczero", "ddhadeva", "chagurmukhi", "rhook", "exclamdbl", "greaterequalorless", "ograve", "henghook", "saraueeleftthai", "period", "sdotaccent", "aigurmukhi", "Gcedilla", "angbopomofo", "newsheqelsign", "noonghunnafinalarabic", "finalkafdageshhebrew", "sentosquare", "afii301", "afii300", "controlCAN", "parenrightaltonearabic", "Idblgrave", "nikatakanahalfwidth", "rcedilla", "commamonospace", "Zcaronsmall", "tildeoperator", "afii57666", "apple", "hcircumflex", "centmonospace", "musicalnote", "ayin", "dparen", "Ydieresissmall", "tsuperior", "noonmeemisolatedarabic", "sadarabic", "space", "Ldot", "blacklenticularbracketleftvertical", "twoideographicparen", "ecandradeva", "ghook", "twelvecircle", "kjecyrillic", "radeva", "omacron", "Ohorndotbelow", "kturned", "Cedillasmall", "kenarmenian", "siostikeutkorean", "ocircumflexhookabove", "otilde", "colonsign", "vdotbelow", "Cmonospace", "rrvocalicvowelsigngujarati", "SF430000", "Acircumflexdotbelow", "apostrophemod", "yusmallhiragana", "Rsmall", "bullseye", "blackleftpointingtriangle", "peseta", "gikatakana", "osmallkatakanahalfwidth", "Amacron", "minusmod", "phieuphaparenkorean", "copyrightsans", "Idot", "uugurmukhi", "ghhadeva", "bracketleft", "yatcyrillic", "Uring", "ainmedialarabic", "Fcircle", "khieukhkorean", "approximatelyequal", "heharabic", "maihanakatthai", "eshortvowelsigndeva", "hyphensuperior", "Koppacyrillic", "qamatsde", "overlinedashed", "Eacute", "obarreddieresiscyrillic", "blacklenticularbracketright", "dblarrowleft", "breveinvertedcmb", "radsquare", "pohiragana", "Cdot", "jcaron", "dhagurmukhi", "akatakanahalfwidth", "daletdagesh", "Rcaron", "SF470000", "jhabengali", "Gsmall", "tonos", "lesssmall", "sfthyphen", "Yhookabove", "fitacyrillic", "Hoarmenian", "esuperior", "lcircumflexbelow", "eightarabic", "atilde", "memhebrew", "hehfinalarabic", "Ahookabove", "Iecyrillic", "tonebarlowmod", "commainferior", "Deltagreek", "exclamdownsmall", "ideographiccomma", "dihiragana", "chochoethai", "Lcaron", "supersetnotequal", "ralowerdiagonalbengali", "Lslash", "maitholowleftthai", "yoyakorean", "Kcommaaccent", "yaekorean", "ideographiclaborcircle", "fourgurmukhi", "Gcircumflex", "Ubreve", "blackleftpointingpointer", "Caronsmall", "tshecyrillic", "holamquarterhebrew", "wcircle", "H22073", "meetorusquare", "whiterightpointingtriangle", "Yiarmenian", "Ohm", "cornerbracketrighthalfwidth", "abrevetilde", "Gbreve", "ecandragujarati", "phisymbolgreek", "atsmall", "tusmallhiragana", "afii61664", "qafinitialarabic", "emphasismarkarmenian", "abrevehookabove", "Abrevehookabove", "mussquare", "Sampigreek", "zokatakana", "Ddotbelow", "lparen", "Chedescendercyrillic", "dalarabic", "Scaronsmall", "qaffinalarabic", "tahfinalarabic", "eightgujarati", "circumflexcmb", "sigmalunatesymbolgreek", "edblgrave", "tikatakanahalfwidth", "Igravesmall", "Endescendercyrillic", "bridgebelowcmb", "ssangieungkorean", "notelement", "Tecyrillic", "hturned", "sevenpersian", "weokorean", "sarauuthai", "dblgravecmb", "intisquare", "Ghemiddlehookcyrillic", "Gimarmenian", "fournumeratorbengali", "mikatakana", "Kaverticalstrokecyrillic", "leftangleabovecmb", "succeeds", "qcircle", "scircle", "Xmonospace", "Lslashsmall", "mirisquare", "zahiragana", "xdotaccent", "rikatakana", "zdot", "sevenhangzhou", "threeroman", "circle", "mparen", "threehackarabic", "sheva2e", "Tedescendercyrillic", "ypogegrammeni", "openbullet", "ohungarumlaut", "Cheharmenian", "registersans", "dblanglebracketright", "wdieresis", "overlinedblwavy", "tilde", "shimacoptic", "asteriskmath", "tcheharabic", "Edot", "Scircumflex", "controlFF", "iimatragurmukhi", "Tenroman", "parenlefttp", "guilsinglright", "Gcircle", "controlFS", "munahlefthebrew", "etildebelow", "meemfinalarabic", "whitecircle", "ideographicsuperviseparen", "SF040000", "otildedieresis", "harpoonrightbarbup", "siosnieunkorean", "lsuperior", "Jcircle", "squarebelowcmb", "Omacrongrave", "cieucuparenkorean", "aybarmenian", "sheqelhebrew", "ihiragana", "DZcaron", "proportion", "alefarabic", "twocircle", "spacehackarabic", "saraamthai", "Upsilonafrican", "controlEOT", "kiyeokparenkorean", "ocircumflextilde", "abengali", "pieuptikeutkorean", "minuscircle", "germandbls", "Xeharmenian", "scaron", "fivegujarati", "Ndotbelow", "afii61289", "ercyrillic", "ngagujarati", "ezhcaron", "qamatsqatanhebrew", "comma", "edieresis", "wawhamzaabovearabic", "daarmenian", "Tshecyrillic", "njecyrillic", "tmonospace", "alefhebrew", "Ycircle", "dblarrowright", "blinebelow", "hatafpatah2f", "equalsuperior", "igujarati", "ideographicfireparen", "afii10043", "Abrevedotbelow", "afii10041", "afii10047", "ninearabic", "afii10045", "gagurmukhi", "ecircumflextilde", "afii10049", "afii10048", "second", "Ocircumflexsmall", "pefinaldageshhebrew", "usmallhiragana", "laminitialarabic", "llvocalicvowelsignbengali", "rieultikeutkorean", "afii10146", "afii10147", "afii10145", "nkatakana", "Xdieresis", "iideva", "Checyrillic", "Omonospace", "arighthalfring", "colonmonospace", "blacksmilingface", "Vmonospace", "fofanthai", "ainfinalarabic", "ieungacirclekorean", "Zcaron", "Delta", "wdotaccent", "qofhebrew", "Udieresisgrave", "nssquare", "kiroguramusquare", "upperdothebrew", "alefmaksuramedialarabic", "plusbelowcmb", "yesieungkorean", "registerserif", "jparen", "Idieresis", "samekhdageshhebrew", "candrabindudeva", "fourparen", "Rinvertedbreve", "nieunhieuhkorean", "ddalfinalarabic", "pcircle", "perpendicular", "khaharabic", "ttehfinalarabic", "whitesmallsquare", "ukatakanahalfwidth", "quoteleft", "bcircle", "shin", "Omacronacute", "ideva", "Fitacyrillic", "zukatakana", "mokatakanahalfwidth", "Gammaafrican", "jhagurmukhi", "lcaron", "bhabengali", "braceleftsmall", "yehinitialarabic", "zero", "aadeva", "kiyeokaparenkorean", "obengali", "bqsquare", "viramadeva", "Ksicyrillic", "reviamugrashhebrew", "ghestrokecyrillic", "ocandravowelsigngujarati", "minute", "lessorequivalent", "nnagujarati", "Abreveacute", "notsucceeds", "fbopomofo", "ellipsisvertical", "referencemark", "ideographmetalcircle", "twentyperiod", "Umacrondieresis", "saraithai", "ohookabove", "dmonospace", "figuredash", "house", "udieresisgrave", "jis", "dargahebrew", "ringhalfright", "audeva", "alefhamzaabovefinalarabic", "afii57417", "etnahtalefthebrew", "ssabengali", "ldotbelowmacron", "ubopomofo", "tortoiseshellbracketrightsmall", "Abrevetilde", "magujarati", "scarondotaccent", "fourideographicparen", "reharmenian", "tortoiseshellbracketleftsmall", "Ostrokeacute", "vecyrillic", "Kcircle", "ecircle", "rturned", "ideographicmedicinecircle", "afii10846", "hookretroflexbelowcmb", "NJ", "LJ", "twostroke", "nineperiod", "Ecircumflexgrave", "zaqefqatanhebrew", "yring", "fourthtonechinese", "ekatakana", "Zlinebelow", "candrabindubengali", "Fmonospace", "trademark", "yamakkanthai", "Dlinebelow", "Psicyrillic", "lambdastroke", "perispomenigreekcmb", "epsilon", "upblock", "sorusithai", "afii00208", "kafarabic", "nundagesh", "Sdotbelowdotaccent", "sakatakana", "Zecyrillic", "Ehookabove", "cyrflex", "Enhookcyrillic", "Vcircle", "curlyand", "fathaarabic", "Brevesmall", "Kacute", "pointingindexupwhite", "sheqel", "nhiragana", "ntilde", "khagujarati", "fourbengali", "gehiragana", "iotadieresis", "segolquarterhebrew", "dakatakana", "Abrevecyrillic", "SF410000", "doubleyodpatahhebrew", "SF280000", "onefitted", "ampersandsmall", "Efcyrillic", "Ereversed", "numeralsignlowergreek", "IUcyrillic", "lamalefhamzabelowfinalarabic", "sihiragana", "oneideographicparen", "Ocaron", "ghainmedialarabic", "plusminus", "tetsecyrillic", "lslash", "Shimacoptic", "herutusquare", "oogurmukhi", "whitecornerbracketleftvertical", "ocyrillic", "ukorean", "Odieresissmall", "vavdagesh65", "decimalseparatorarabic", "arrowheadupmod", "Otildedieresis", "zahinitialarabic", "noonarabic", "greateroverequal", "notgreater", "fl", "acutebelowcmb", "segol13", "voicedmarkkanahalfwidth", "Gsmallhook", "summation", "Jecyrillic", "onesuperior", "thothanthai", "AEacute", "qamats33", "Atildesmall", "holamhebrew", "odblgrave", "cdot", "tildebelowcmb", "Upsilondieresishooksymbolgreek", "tildecmb", "sixbengali", "sparen", "ideographiciterationmark", "blackdiamond", "sevenhackarabic", "spadesuitblack", "parenleftvertical", "Tonefive", "osmallhiragana", "controlEM", "eightroman", "yuhiragana", "controlBS", "threethai", "Pacute", "ucaron", "pagedown", "ghemiddlehookcyrillic", "softsigncyrillic", "lladeva", "parenleftsmall", "ideographicmoonparen", "option", "nyadeva", "ghaininitialarabic", "pmonospace", "sigmafinal", "cdotaccent", "questiongreek", "bracketleftbt", "Lsmall", "ldot", "mmcubedsquare", "cmcubedsquare", "afii57797", "Oslash", "Becyrillic", "at", "Tdotbelow", "eukorean", "samekhdagesh", "msuperior", "agujarati", "Obarredcyrillic", "zayindagesh", "vewarmenian", "Hadescendercyrillic", "squareupperlefttolowerrightfill", "pmsquare", "circumflex", "tonetwo", "sheva22", "khieukhcirclekorean", "ezh", "mahapakhhebrew", "Xdotaccent", "fadeva", "lamfinalarabic", "Rmonospace", "fiveperiod", "ukcyrillic", "tackleft", "Umacroncyrillic", "zcurl", "Threeroman", "sixparen", "pazerhebrew", "Yiwnarmenian", "shinsindothebrew", "theharabic", "fivecircle", "asmallkatakanahalfwidth", "ieungcirclekorean", "numbersignmonospace", "Shacyrillic", "aulengthmarkbengali", "SF060000", "Wcircle", "Icircumflexsmall", "nokatakanahalfwidth", "blank", "endashvertical", "afii10102", "afii10103", "acircumflex", "afii10101", "afii10106", "afii10107", "afii10104", "fiveideographicparen", "Fsmall", "maitrilowleftthai", "afii10109", "Ocircumflexdotbelow", "fourperiod", "Lcircumflexbelow", "finaltsadihebrew", "gabengali", "gaffinalarabic", "lefttackbelowcmb", "sixarabic", "uvowelsignbengali", "zadeva", "ringhalfleftarmenian", "hieuhcirclekorean", "yuyekorean", "auvowelsigndeva", "tserewidehebrew", "greaterorequivalent", "Ihookabove", "hdotbelow", "abrevedotbelow", "hiriq", "asciitilde", "edot", "ddagurmukhi", "copyrightserif", "aubengali", "ascript", "questionarabic", "verticallinemod", "sukatakanahalfwidth", "ideographiccorrectcircle", "vakatakana", "labengali", "chadeva", "mahapakhlefthebrew", "vehfinalarabic", "bahiragana", "zhedescendercyrillic", "ascriptturned", "anglebracketleft", "gcedilla", "Mturned", "Vhook", "Macute", "sixsuperior", "Tmonospace", "dehihebrew", "ordmasculine", "lbopomofo", "wekorean", "abbreviationsigndeva", "delta", "tehhahinitialarabic", "segol", "AEmacron", "shindageshshindot", "meemmeeminitialarabic", "Imacroncyrillic", "rdblgrave", "gdot", "Iocyrillic", "zparen", "bobaimaithai", "omacrongrave", "Bmonospace", "Gheupturncyrillic", "zehiragana", "solidusshortoverlaycmb", "periodsmall", "slongdotaccent", "twogurmukhi", "pieupsioskorean", "ninemonospace", "Ezhreversed", "sevencircle", "ideographicmetalparen", "fivecircleinversesansserif", "bracerightsmall", "adieresiscyrillic", "dageshhebrew", "bakatakana", "Tcaron", "Agravesmall", "tthagurmukhi", "emacron", "arrowleftoverright", "yesieungsioskorean", "parenrightinferior", "chieuchacirclekorean", "Kabashkircyrillic", "takatakanahalfwidth", "SF080000", "thonangmonthothai", "hukatakanahalfwidth", "tehjeeminitialarabic", "logicaland", "Iotadieresis", "seventhai", "sevenperiod", "parenrightsuperior", "yosmallhiragana", "ncircumflexbelow", "afii10085", "whitecornerbracketrightvertical", "iacyrillic", "rieulaparenkorean", "hdieresis", "tortoiseshellbracketleft", "maithoupperleftthai", "chbopomofo", "ideographicstudyparen", "rcircle", "Obreve", "Ecircumflexhookabove", "huiitosquare", "one", "onegujarati", "yesieungpansioskorean", "eightcircle", "topatakthai", "rieulpansioskorean", "controlETB", "Elcyrillic", "circleplus", "Izhitsadblgravecyrillic", "DieresisAcute", "zhecyrillic", "tatweelarabic", "Acaron", "shaarmenian", "hdotaccent", "ebopomofo", "Yericyrillic", "proportional", "SF520000", "kagujarati", "Ljecyrillic", "squaremg", "meizierasquare", "squarekg", "controlSI", "fourarabic", "controlSO", "downtackmod", "siosaparenkorean", "hehiragana", "sixteenparen", "Emacrongrave", "section", "nun", "diamond", "thagujarati", "squaremm", "qbopomofo", "squarecm", "aogonek", "notlessnorequal", "hieuhacirclekorean", "ekatakanahalfwidth", "vadeva", "Dmonospace", "rakatakanahalfwidth", "triaglf", "roruathai", "forall", "tchehinitialarabic", "scircumflex", "pe", "sixdeva", "hatafpatahquarterhebrew", TranslateLanguage.HEBREW, "oe", "afii57716", "notparallel", "afii57718", "gcircle", "ae", "strokelongoverlaycmb", "upsilondieresistonos", "uparen", "arrowdashup", "rinvertedbreve", "noonfinalarabic", "glottalstopmod", "afii57413", "afii57412", "afii57411", "afii57410", "mehiragana", "afii57416", "afii57415", "afii57414", "afii57419", "afii57418", "dzeabkhasiancyrillic", "notsubset", "Ntildesmall", "cacute", "Iota", "igrave", "afii57512", "afii57513", "nfsquare", "afii57511", "twelveroman", "SF540000", "afii57514", "candrabinducmb", "afii57519", "rfishhookreversed", "vtilde", "lammedialarabic", "iebrevecyrillic", "taharabic", "ninehackarabic", "triagrt", "brevecmb", "Pcircle", "tadeva", "tonefive", "isuperior", "radoverssquaredsquare", "chochanthai", "nikatakana", "odieresiscyrillic", "Omegatonos", "rieulyeorinhieuhkorean", "blacksquare", "sevenroman", "kasquare", "mieumsioskorean", "nhookleft", "circlewithlefthalfblack", "auvowelsigngujarati", "kgreenlandic", "Emacronacute", "pisymbolgreek", "upsilondieresis", "Fourroman", "ghzsquare", "afii10018", "lamkhahinitialarabic", "rahiragana", "pdotaccent", "zerothai", "shevanarrowhebrew", "chedescenderabkhasiancyrillic", "fraction", "H18551", "mvmegasquare", "whitesquare", "yetivhebrew", "icircle", "Hardsigncyrillic", "veharabic", "Zsmall", "Iebrevecyrillic", "quoteright", "thothahanthai", "Odieresis", "qubutshebrew", "asterisk", "eighthnotebeamed", "afii10040", "wawfinalarabic", "hieuhaparenkorean", "Oopen", "evowelsigndeva", "Encyrillic", "sagurmukhi", "gdotaccent", "asuperior", "rvocalicdeva", "Tonesix", "thook", "aigujarati", "egujarati", "dohiragana", "Mcircle", "wahiragana", "tenparen", "Etilde", "pacute", "wasmallkatakana", "careof", "SF380000", "ahiragana", "tehmeeminitialarabic", "uragurmukhi", "shindageshshindothebrew", "notprecedes", "beamedsixteenthnotes", "Osmall", "Ucircle", "shalshelethebrew", "fivethai", "fmsquare", "omacronacute", "seveneighths", "makatakana", "dblanglebracketleftvertical", "abrevecyrillic", "moverssquare", "spadesuitwhite", "itilde", "vavholamhebrew", "heart", "lmonospace", "controlLF", "feharmenian", "threequartersemdash", "yoikorean", "Tsmall", "Kahookcyrillic", "eng", "rparen", "abreveacute", "qamats1c", "zhedieresiscyrillic", "gcaron", "tikeutcirclekorean", "Ccedillaacute", "saraethai", "aekorean", "Pmonospace", "Dzeabkhasiancyrillic", "Emacron", "betrafehebrew", "arrowrightwhite", "tavdagesh", "aivowelsigndeva", "buhiragana", "commasuperior", "Ldotbelowmacron", "lvocalicdeva", "tcaron", "dcircumflexbelow", "dcircle", "evowelsigngujarati", "Haabkhasiancyrillic", "noonghunnaarabic", "odeva", "Kastrokecyrillic", "alefhamzaabovearabic", "Nmonospace", "ssangpieupkorean", "Abreve", "lmsquare", "llvocalicdeva", "controlENQ", "kcircle", "sioskorean", "yacute", "ringhalfleft", "rokatakana", "yusbigiotifiedcyrillic", "kahiragana", "Kcedilla", "hekatakanahalfwidth", "khahinitialarabic", "alefmaddaabovearabic", "quotereversed", "sevenmonospace", "ecandravowelsigngujarati", "tpalatalhook", "anbopomofo", "hedagesh", "segol1f", "Alphatonos", "sixpersian", "guhiragana", "Adotmacron", "fourdeva", "Adieresis", "chagujarati", "nahiragana", "Rlinebelow", "commaturnedabovecmb", "ideographwatercircle", "yokatakanahalfwidth", "Idieresiscyrillic", "sheenarabic", "patahnarrowhebrew", "ereversed", "cheverticalstrokecyrillic", "Shaarmenian", "hakatakana", "pssquare", "candrabindugujarati", "glottalstopinverted", "alpha", "revlogicalnot", "strokeshortoverlaycmb", "Egrave", "dammatanaltonearabic", "shinshindothebrew", "fourteenperiod", "ycircumflex", "hardsigncyrillic", "seventeenparen", "eokorean", "enspace", "cieucaparenkorean", "cdsquare", "rohiragana", "finalpe", "ninethai", "wgrave", "Ohornacute", "clickalveolar", "rieulmieumkorean", "idotbelow", "hyphenmonospace", "tikeutacirclekorean", "afii57673", "tikeutaparenkorean", "afii57674", "eacute", "afii57679", "tthadeva", "gafarabic", "ramshorn", "philatin", "integral", "maieklowrightthai", "Adieresismacron", "quotesinglbase", "threeperiod", "Ytilde", "addakgurmukhi", "tikeutparenkorean", "hbopomofo", "pansioskorean", "hiriqnarrowhebrew", "Uinvertedbreve", "hehinitialarabic", "Sacute", "squarecc", "scommaaccent", "rvocalicvowelsignbengali", "khacyrillic", "ssuperior", "arrowupleft", "Ecircumflexdotbelow", "shhacyrillic", "Z", "zerowidthjoiner", "ccircumflex", "Y", "Acute", "R", "S", "P", "Q", "V", "W", "oneperiod", "U", "J", "K", "H", "omega1", "N", "O", "M", "Asmall", "C", C18385v2.f56336h, "F", "glottalstop", "D", "E", "z", "Esmall", "y", "Ucircumflex", "r", "s", ContextChain.TAG_PRODUCT, "q", "sakatakanahalfwidth", "w", "t", "u", "j", "k", C18773h.f57233c, ContextChain.TAG_INFRA, BackupFile.PREFIX_NOTE_DIR, "o", "l", "notcontains", "b", "c", "a", "f", "g", "jecyrillic", "e", "hatafsegol24", "uhorntilde", "trademarksans", "caronbelowcmb", "scedilla", "reharabic", "lfblock", "fehinitialarabic", "icyrillic", "hakatakanahalfwidth", "mssquare", "ideographicfinancialcircle", "venus", "afii57658", "fivepersian", "backslashmonospace", "Zmonospace", "ktsquare", "eighteenperiod", "semivoicedmarkkana", "nineparen", "cyrFlex", "twogujarati", "llinebelow", "exclamsmall", "hehhamzaabovefinalarabic", "zinorhebrew", "squaremil", "Rfraktur", "rbopomofo", "afii57453", "afii57452", "afii57451", "afii57450", "afii57457", "afii57456", "afii57455", "mokatakana", "Hdotaccent", "iicyrillic", "afii57458", "ttagurmukhi", "union", "eiotifiedcyrillic", "rragurmukhi", "lagurmukhi", "Hbar", "phosamphaothai", "Tcircumflexbelow", "greater", "yuslittleiotifiedcyrillic", "Nlinebelow", "tcedilla", "maichattawaupperleftthai", "rieulsioskorean", "becyrillic", "Yerudieresiscyrillic", "arrowdblup", "hatafsegol30", "lolingthai", "Pemiddlehookcyrillic", "noonnoonfinalarabic", "khadeva", "ll", "largecircle", "SF240000", "mugsquare", "Egravesmall", "Mdotaccent", "ikatakanahalfwidth", "ostrokeacute", "acutedeva", "Hungarumlaut", "questionmonospace", "nadeva", "angle", "Dslash", "threegurmukhi", "decimalseparatorpersian", "ghadarmenian", "tdotaccent", "acutetonecmb", "muvsquare", "ocircle", "tetdageshhebrew", "gparen", "hmonospace", "ubreve", "aibopomofo", "sheva15", "tabengali", "Eogonek", "apaatosquare", "zeta", "wakatakanahalfwidth", "khzsquare", "arrowdblboth", "gbreve", "squaremsquared", "momathai", "iotalatin", "tparen", "emacrongrave", "Nineroman", "sadinitialarabic", "ideographsuncircle", "glottalstopreversedmod", "ecircumflexhookabove", "zakatakana", "segolnarrowhebrew", "florin", "bridgeinvertedbelowcmb", "hahfinalarabic", "yoddageshhebrew", "triagup", "afii61352", "udieresis", "ringhalfrightbelowcmb", "tahmedialarabic", "tthagujarati", "quotedblright", "Jmonospace", "Ncircle", "Ecyrillic", "cosquare", "twohangzhou", "tlinebelow", "khokhwaithai", "mturned", "Hungarumlautsmall", "maiyamokthai", "bihiragana", "aivowelsignbengali", "afii10082", "afii10081", "kapyeounpieupkorean", "afii10087", "afii10086", "augurmukhi", "iota", "dammaarabic", "afii10089", "afii10088", "nnagurmukhi", "dotmath", "coverkgsquare", "arrowleftdbl", "alefmaddaabovefinalarabic", "ideographicfestivalparen", "Acircumflexsmall", "pieupaparenkorean", "bahtthai", "tokatakanahalfwidth", "hahinitialarabic", "sohiragana", "parenrightsmall", "thabengali", "ohorn", "Dotaccentsmall", "Upsilonacutehooksymbolgreek", "Dcedilla", "gravebelowcmb", "ts", "dzcaron", "clear", "SF530000", "bracketleftex", "ideographicsecretcircle", "invsmileface", "ttadeva", "controlDC4", "khomutthai", "arrowdblright", "sixhackarabic", "blacklenticularbracketleft", LocalePreferences.FirstDayOfWeek.SUNDAY, "gihiragana", "umonospace", "yakatakanahalfwidth", "zcaron", "ttagujarati", "alefmaksurainitialarabic", "Uacute", "yusbigcyrillic", "Ocircumflexacute", "Wsmall", "kapyeounphieuphkorean", "gimeldagesh", "onebengali", "aturned", "acutecmb", "hikatakanahalfwidth", "commaturnedmod", "nabengali", "gershayimaccenthebrew", "Gstroke", "dadfinalarabic", "fiveparen", "huhiragana", "dalfinalarabic", "Ccircumflex", "afii10053", "afii10052", "afii10051", "afii10050", "afii10057", "afii10056", "afii10055", "afii10054", "Bsmall", "ocircumflex", "afii10059", "afii10058", "reviahebrew", "yohiragana", "gravelowmod", "shevahebrew", "dodekthai", "Lmonospace", "mhzsquare", "divisionslash", "adieresismacron", "emacronacute", "periodarmenian", "chochingthai", "Zdotaccent", "gafmedialarabic", "pieupkorean", "cieuccirclekorean", "yiarmenian", "ideographfirecircle", "abopomofo", "jagurmukhi", "kiyeokacirclekorean", "clickretroflex", "hagurmukhi", "blacklenticularbracketrightvertical", "merkhahebrew", "fcircle", "muhiragana", "lamaleffinalarabic", "dsuperior", "ogonek", "Icaron", "fivesuperior", "lowlinecmb", "kcalsquare", "kacyrillic", "shadelight", "rreharabic", "dzcurl", "khahmedialarabic", "daggerdbl", "Tbar", "cieucacirclekorean", "anusvaragujarati", "kikatakana", "Psmall", "brevebelowcmb", "circlepostalmark", "wasmallhiragana", "twelveparen", "fathalowarabic", "pikatakana", "udieresisbelow", "Hcircle", "Ygrave", "underscoremonospace", "SF100000", "gjecyrillic", "haitusquare", "sekatakana", "imatragurmukhi", "kokatakana", "uhorngrave", "Scommaaccent", "patahquarterhebrew", "fourgujarati", "onehalf", "Ocircle", "tahiragana", "emonospace", "cent", "nu", "SF480000", "eightmonospace", "whitedownpointingsmalltriangle", "threepersian", "lowlinedashed", "commaarabic", "controlSYN", "commaaccent", "shbopomofo", "dagger", "dekatakana", "cmsquaredsquare", "quotesingle", "kacute", "qafarabic", "afii57690", "afii57695", "afii57694", "dagurmukhi", "omdeva", "tonsquare", "aabengali", "Sixroman", "hahmedialarabic", "dddhadeva", "Theta", "ccurl", "threearabic", "sadfinalarabic", "emcyrillic", "tildeverticalcmb", "Jheharmenian", "lvocalicvowelsigndeva", "Tcommaaccent", "afii57793", "afii57794", "afii57795", "merkhakefulalefthebrew", "Nsmall", "afii57798", "kiyeoksioskorean", "ringbelowcmb", "omegatonos", "napostrophe", "sixteenperiod", "cabengali", "psilipneumatacyrilliccmb", "Dcircle", "Gmacron", "whitetortoiseshellbracketright", "wikatakana", "tenroman", "SF510000", "yinyang", "seagullbelowcmb", "Deicoptic", "Ecircumflexbelow", "vavholam", "numero", "kapyeounmieumkorean", "Omicrontonos", "etatonos", "KKsquare", "threedeva", "Adieresissmall", "rradeva", "jaarmenian", "wonmonospace", "sevenideographicparen", "hoarmenian", "maichattawalowrightthai", "ninecircle", "twohackarabic", "ieungparenkorean", "fathatanarabic", "Esdescendercyrillic", "mdotbelow", "ffl", "increment", "igurmukhi", "ffi", "Dcircumflexbelow", "Ldotaccent", "wturned", "koreanstandardsymbol", "Racute", "ghagujarati", "overlinecenterline", "ilde", "twobengali", "controlVT", "udieresiscaron", "perafehebrew", "ngagurmukhi", "afii57394", "afii57395", "afii57396", "afii57397", "rcaron", "afii57392", "afii57393", "ngadeva", "afii57398", "afii57399", "oneeighth", "sabengali", "yaadosquare", "Circumflexsmall", "xeharmenian", "subsetnotequal", "mu1", "adeva", "behiragana", "emptyset", "qofdagesh", "tihiragana", "etnahtahebrew", "tsecyrillic", "propersuperset", "hatafpatah23", "xcircle", "breveinvertedbelowcmb", "Ocircumflexhookabove", "maitholowrightthai", "greatersmall", "sigma", "onearabic", "Aring", "theta1", "jcircle", "edeva", "nonbreakingspace", "hatafqamats1b", "rdotbelowmacron", "halantgurmukhi", "afii10042", "behmeeminitialarabic", "afii10046", "aavowelsigngujarati", "afii10044", "finalkafhebrew", "dollar", "ruthai", "whiteleftpointingsmalltriangle", "ayinhebrew", "equalsmall", "Adblgrave", "whiterightpointingsmalltriangle", "Kdotbelow", "Ifraktur", "SF260000", "contourintegral", "ucircumflexbelow", "Ncaron", "ocaron", "aagujarati", "dblverticallineabovecmb", "tcommaaccent", "Ocircumflex", "tenperiod", "dbldanda", "allequal", "patah", "rtblock", "nasquare", "gershayimhebrew", "holam19", "qmonospace", "verticalbar", "tetdagesh", "Blinebelow", "Ibreve", "nowarmenian", "hsuperior", "Acircumflexgrave", "hadescendercyrillic", "kesmallkatakana", "sixcircle", "Feharmenian", "mcircle", "tehinitialarabic", "seeninitialarabic", "notgreaternorequal", "Rdblgrave", "ddabengali", "uring", "qamats", "phieuphacirclekorean", "qamatsqatanquarterhebrew", "Uogonek", "Tdotaccent", "ecircumflexdotbelow", "acutecomb", "ugurmukhi", "uumatragurmukhi", "gimel", "hihiragana", "Hmonospace", "six", "afii299", "qarneyparahebrew", "alphatonos", "adblgrave", "lira", "sukatakana", "twoparen", "Iotatonos", "integralex", "shindagesh", "hatafqamats", "thalfinalarabic", "uuvowelsigngujarati", "waekorean", "yagurmukhi", "fparen", "bagurmukhi", "Omegagreek", "subset", "mbsquare", "tet", "gecyrillic", "wsuperior", "hatafqamatshebrew", "vekatakana", "afii10017", "dalethebrew", "twoperiod", "afii10019", "blackrightpointingpointer", "nokatakana", "fivemonospace", "rrvocalicvowelsignbengali", "siospieupkorean", "vmonospace", "oslash", "Udieresisbelow", "ideographiclowcircle", "afii10110", "mihiragana", "nonuthai", "ssagujarati", "orthogonal", "ideographicclose", "sixinferior", "GBsquare", "blackrightpointingtriangle", "Ogravesmall", "moverssquaredsquare", "Tcedilla", "llvocalicvowelsigndeva", "tbar", "dhagujarati", "idieresis", "tsadi", "Chook", "Ercyrillic", "sixideographicparen", "musicsharpsign", "timescircle", "anusvarabengali", "bekatakana", "dieresistonos", "kcedilla", "Ohookabove", "onenumeratorbengali", "yusmallkatakana", "chekhakassiancyrillic", "thousandcyrillic", "kdotbelow", "amonospace", "ring", "whitestar", "Dz", "zerosuperior", "Oneroman", "qubuts18", "fourcircle", "tackdown", "centsuperior", "slong", "elevenparen", "zuhiragana", "dz", "xdieresis", "ideographicallianceparen", "Reharmenian", "cedillacmb", "nnadeva", "tsadidageshhebrew", "foursuperior", "yoddagesh", "lamed", "Kenarmenian", "hcircle", "bbopomofo", "Oogonek", "qamatshebrew", "HPsquare", "yicyrillic", "atmonospace", "nwsquare", "hbar", "hagujarati", "omgujarati", "qamatswidehebrew", "Btopbar", "rrabengali", "rcommaaccent", "peharmenian", "kasratanarabic", "Caron", "maiekupperleftthai", "X", "fiveeighths", "wparen", "haaltonearabic", "dtopbar", "jhadeva", "eightthai", "T", "khhadeva", "svsquare", "I", "L", "braceleftmid", "eshsquatreversed", "vcircle", "G", "Gacute", "x", "exclammonospace", "twonumeratorbengali", "Xi", "fifteenperiod", "pfsquare", "tteharabic", "Pi", "whitelenticularbracketleft", "maitaikhuleftthai", "fmonospace", "m", "gheupturncyrillic", "d", "twomonospace", "afii57407", "vhook", "endash", "suchthat", "ddotaccent", "Acutesmall", "verticallinebelowcmb", "verticallineabovecmb", "Aringsmall", TranslateLanguage.FINNISH, "alefmaksurafinalarabic", "pieupparenkorean", "estimated", "wokatakanahalfwidth", "bstroke", "khieukhacirclekorean", "gysquare", "afii57509", "controlESC", "hiriqwidehebrew", "lbar", "Zstroke", "reshdageshhebrew", "ideographicenterpriseparen", "zeroinferior", "whitelenticularbracketright", "iotatonos", "patahwidehebrew", "subsetorequal", "Schwadieresiscyrillic", "Idotaccent", "multiply", "nagurmukhi", "Umacron", "colontriangularhalfmod", "dnblock", "chieuchaparenkorean", "controlRS", "barmonospace", "compass", "guillemotright", "zayindageshhebrew", "mansyonsquare", "tsere", "lhookretroflex", "fivearabic", "oparen", "filledbox", "izhitsacyrillic", "dlinebelow", "Ecircumflex", "threesuperior", "Istroke", "Lacute", "rsuperior", "commareversedmod", "cornerbracketleft", "Eightroman", "adotbelow", "kappasymbolgreek", "braceleft", "obreve", "lamalefisolatedarabic", "sahiragana", "afii57700", "udotbelow", "afii57705", "Uhorn", "nineroman", "Vsmall", "Phook", "lamlamhehisolatedarabic", "dhabengali", "aeacute", "meemmeemisolatedarabic", "Tcircle", "Tau", "oshortdeva", "afii57403", "afii57401", "afii57400", "muchgreater", "postalmarkface", "behmeemisolatedarabic", "afii57409", "yadeva", "guramusquare", "muasquare", "ecandravowelsigndeva", "Tiwnarmenian", "hatafsegolnarrowhebrew", "ghagurmukhi", "afii57506", "afii57507", "Ecircumflexsmall", "afii57505", "musicalnotedbl", "afii57508", "Fiveroman", "pukatakana", "eightparen", "ideographearthcircle", "integralbottom", "wehiragana", "fehfinalarabic", "SF090000", "filledrect", "notequal", "ideographiccongratulationparen", "zeromonospace", "hcedilla", "parenleftaltonearabic", "quarternote", "iishortcyrillic", "numeralsigngreek", "srsquare", "Odblacute", "lammeeminitialarabic", "Ydotbelow", "yturned", "Uhorntilde", "pahiragana", "Omegaroundcyrillic", "dcroat", "guilsinglleft", "voicedmarkkana", "curlyor", "overlinewavy", "yosmallkatakana", "patah2a", "SF200000", "ngonguthai", "yotgreek", "ubar", "Obarreddieresiscyrillic", "Ushortcyrillic", "ringhalfleftbelowcmb", "ainvertedbreve", "Eng", "afii10100", "Oharmenian", "afii10105", "musicflatsign", "breveinverteddoublecmb", "afii10108", "Udieresisacute", "Yacutesmall", "rmonospace", "zbopomofo", "zcircle", "asteriskarabic", "sheva115", "nbspace", "schwacyrillic", "rrvocalicgujarati", "idieresiscyrillic", "rlongleg", "integralbt", "ideographiccallparen", "piwrarmenian", "uhungarumlaut", "approxequal", "sevensuperior", "cieuckorean", "hoonsquare", "bracketrightmonospace", "onedotenleader", "pagurmukhi", "cheabkhasiancyrillic", "gpasquare", "zerogurmukhi", "Caarmenian", "lochulathai", "pecyrillic", "SF190000", "aavowelsignbengali", "ideographichighcircle", "degree", "hungarumlaut", "quotedbl", "zdotaccent", "issharbengali", "arrowheadrightmod", "Ethsmall", "qamatsquarterhebrew", "asmallhiragana", "hehinitialaltonearabic", "sixteencurrencydenominatorbengali", "geometricallyequal", "mmonospace", "kehiragana", "semicolonmonospace", "Ogoneksmall", "ringcmb", "kukatakanahalfwidth", "rieulhieuhkorean", "shindageshhebrew", "thieuthaparenkorean", "qamatsnarrowhebrew", "Kjecyrillic", "angleleft", "zerowidthspace", "anglebracketrightvertical", "udattadeva", "taisyouerasquare", "nehiragana", "oopen", "percentsmall", "Udieresiscaron", "gakatakana", "ncaron", "ebengali", "rrvocalicdeva", "ideographicprintcircle", "hekatakana", "vehinitialarabic", "hatafpatahnarrowhebrew", "zihiragana", "gcommaaccent", "djecyrillic", "ldotaccent", "etilde", "ideographicrightcircle", "sevenparen", "asciitildemonospace", "Rcommaaccent", "macronbelowcmb", "gstroke", "Dzhecyrillic", "fourteenparen", "Sdotaccent", "dkshade", "lvocalicbengali", "dzhecyrillic", "wmonospace", "mugreek", "SF360000", "tusmallkatakanahalfwidth", "Menarmenian", "shaddaarabic", "ideographicstockparen", "imageorapproximatelyequal", "controlDC3", "blackuppointingsmalltriangle", "afii57807", "afii57806", "afii57804", "afii57803", "afii57802", "afii57801", "afii57800", "Rdotaccent", "overline", "Dzecyrillic", "sallallahoualayhewasallamarabic", "Xcircle", "gimeldageshhebrew", "phieuphkorean", "lsquare", "nineteenperiod", "ecircumflexbelow", "lakkhangyaothai", "bmonospace", "ordfeminine", "sdotbelow", "sevencircleinversesansserif", "nikhahitthai", "maitriupperleftthai", "gmacron", "Ustraightstrokecyrillic", "nieunsioskorean", "cyrBreve", "ezhtail", "oneparen", "Yhook", "twelveperiod", "segol2c", "augujarati", "wohiragana", "bohiragana", "LL", "sacute", "eightoldstyle", "afii08941", "bracketrightex", "control", "saraileftthai", "controlNAK", "abreve", "ypogegrammenigreekcmb", "yehhamzaaboveinitialarabic", "lagujarati", "yod", "icircumflex", "less", "Uhorndotbelow", "exclamarmenian", "omicrontonos", "thehmedialarabic", "Odieresiscyrillic", "secondtonechinese", "dadarabic", "feharabic", "prolongedkana", "nkatakanahalfwidth", "notelementof", "ukatakana", "Epsilontonos", "thirteenperiod", "colonmonetary", "tehmarbutafinalarabic", "thophuthaothai", "asymptoticallyequal", "Bhook", "ycircle", "twodotenleader", "gohiragana", "chedescendercyrillic", "thieuthcirclekorean", "whitediamondcontainingblacksmalldiamond", "gimelhebrew", "yakorean", "Upsilontonos", "Zacute", "nbopomofo", "osuperior", "aparen", "acutelowmod", "dalet", "controlDLE", "Iogonek", "reflexsubset", "perthousand", "rupeemarkbengali", "egrave", "hatafsegol17", "Tworoman", "segolwidehebrew", "hatafsegolquarterhebrew", "ideographicperiod", "ibopomofo", "Utilde", "ideographicsunparen", "rakatakana", "ymonospace", "equivalence", "habengali", "afii57645", "totaothai", "Udieresissmall", "afii10076", "odotbelow", "firsttonechinese", "abbreviationmarkarmenian", "pedagesh", "ampersand", "questionsmall", "SF440000", "resh", "blackdownpointingtriangle", "invbullet", "haabkhasiancyrillic", "sagujarati", "acircumflexgrave", "wakorean", "mdotaccent", "peharabic", "Ghestrokecyrillic", "lcircle", "ytilde", "glottalstopreversed", "afii57443", "afii57442", "afii57441", "afii57440", "afii57446", "afii57445", "afii57444", "radicalex", "afii57449", "afii57448", "Uhungarumlautcyrillic", "ogujarati", "bracelefttp", "tsere1e", "iecyrillic", "psicyrillic", "daletdageshhebrew", "oogonekmacron", "Tonetwo", "Ddotaccent", "Idieresissmall", "nineoldstyle", "merkhalefthebrew", "yiwnarmenian", "dmacron", "carriagereturn", "pedageshhebrew", "fivehangzhou", "kasraarabic", "heartsuitblack", "dabengali", "acute", "lamedhebrew", "dbllowline", "noonmeeminitialarabic", "sukunarabic", "arrowdashdown", "eopenreversedclosed", "lacute", "nuktadeva", "Rho", "tehjeemisolatedarabic", "qhook", "pokatakana", "Zhedieresiscyrillic", "ohiragana", "circlemultiply", "mulsquare", "hyphentwo", "clicklateral", "Oslashsmall", "zekatakana", "hadeva", "ocircumflexacute", "clubsuitwhite", "Zaarmenian", "kafdageshhebrew", "zeropersian", "ttabengali", "arrowdown", "nikhahitleftthai", "vukatakana", "koppacyrillic", "iotadieresistonos", "kvsquare", "dotlessjstrokehook", "hhooksuperior", "nieunkorean", "cornerbracketlefthalfwidth", "afii64937", "visargagujarati", "hohipthai", "ovowelsignbengali", "dcedilla", "tserehebrew", "rlonglegturned", "yericyrillic", "Piwrarmenian", "gereshmuqdamhebrew", "mieumcirclekorean", "imonospace", "three", "afii61248", "tedescendercyrillic", "nparen", "quotesinglemonospace", "primemod", "kekatakanahalfwidth", "eightsuperior", "Eta", "maiekthai", "noonjeemisolatedarabic", "bracketright", "integraltp", "macute", "uptackbelowcmb", "Ndotaccent", "hatafpatah16", "SF050000", "Etarmenian", "bukatakana", "voicediterationhiragana", "kokaithai", "afii10093", "afii10092", "afii10091", "afii10090", "afii10097", "afii10096", "afii10095", "afii10094", "afii10099", "afii10098", "cagujarati", "amsquare", "oneroman", "uhorndotbelow", "uugujarati", "mem", "lamarabic", "pasquare", "hamzaarabic", "afii10192", "afii10193", "seenarabic", "afii10196", "afii10194", "afii10195", "ucyrillic", "IAcyrillic", "uacute", "tesh", "Enghecyrillic", "eematragurmukhi", "jeeminitialarabic", "anoteleia", "uhookabove", "Hcedilla", "Zcircle", "onecircleinversesansserif", "behnoonfinalarabic", "nuktagurmukhi", "shademedium", "fivehackarabic", "yukatakana", "Gcommaaccent", "shade", "onequarter", "Zdotbelow", "onethird", "controlHT", "Dcroat", "thirteencircle", "omegacyrillic", "yehmeemisolatedarabic", "uvowelsigngujarati", "nmonospace", "checkmark", "vav", "Djecyrillic", "alef", "iucyrillic", "Qsmall", "yr", "zayinhebrew", "nyagujarati", "rabengali", "blacklowerrighttriangle", "sixteencircle", "Zhecyrillic", "tchehmedialarabic", "eightbengali", "lozenge", "apostrophearmenian", "Zcircumflex", "seventeencircle", "hedageshhebrew", "sigma1", "afii57842", "afii57841", "mlsquare", "Acircumflexacute", "parenright", "escyrillic", "fiveoldstyle", "hhook", "adieresis", "khorakhangthai", "maichattawalowleftthai", "Wdotaccent", "shindageshsindothebrew", "ideographicfinancialparen", "abrevegrave", "meemarabic", "kaf", "fourcircleinversesansserif", "hieuhkorean", "pieupcieuckorean", "tokatakana", "zikatakana", "yyabengali", "izhitsadblgravecyrillic", "Oacute", "pieupsioskiyeokkorean", "dittomark", "qofdageshhebrew", "controlSUB", "arrowupdnbse", "Ohungarumlaut", "tusmallkatakana", "bhagurmukhi", "uhornacute", "zstroke", "visargabengali", "utildeacute", "shevaquarterhebrew", User.FEMALE, "emdash", "braceright", "bracketrightbt", "phophungthai", "kakatakanahalfwidth", "ubengali", "dammalowarabic", "qadeva", "Ccaron", "pieupkiyeokkorean", "echyiwnarmenian", "ruhiragana", "tipehahebrew", "threegujarati", "lezh", "gbopomofo", "shinsindot", "eighthangzhou", "zerobengali", "tav", "edotbelow", "tau", "B", "tagurmukhi", "Gdot", "einvertedbreve", "khagurmukhi", "istroke", "iinvertedbreve", "similar", "v", "ieungaparenkorean", "Chi", "ninedeva", "twodotleadervertical", "Otcyrillic", "hohiragana", "tehfinalarabic", "rukatakanahalfwidth", "oharmenian", "behinitialarabic", "btopbar", "zainarabic", "ddhagujarati", "ghainfinalarabic", "pwsquare", "verticallinelowmod", "thothungthai", "eight", "Rsmallinvertedsuperior", "jagujarati", "arrowdbldown", "aleffinalarabic", "parallel", "kaverticalstrokecyrillic", "lessmonospace", "middot", "titlocyrilliccmb", "wattosquare", "horizontalbar", "afii57681", "afii57680", "afii57683", "afii57682", "afii57685", "afii57684", "notgreaternorless", "caarmenian", "hekutaarusquare", "afii57688", "Idotbelow", "ismallhiragana", "mohiragana", "afii57686", "afii57689", "sentisquare", "fagurmukhi", "lamalefmaddaaboveisolatedarabic", "afii57687", "icaron", "breve", "haharabic", "Otildesmall", "yasmallkatakanahalfwidth", "bar", "parenleftsuperior", "zmonospace", "voicediterationkatakana", "two", "Dieresissmall", "pagujarati", "fiveroman", "enghecyrillic", "wdotbelow", "bethebrew", "sosothai", "fivegurmukhi", "alefdageshhebrew", "lamhahinitialarabic", "akatakana", "ygrave", "arrowupdownbase", "hlinebelow", "siluqlefthebrew", "otildeacute", "jbopomofo", "dezh", "controlDEL", "behmedialarabic", "feicoptic", "anglebracketright", "ljecyrillic", "ahookabove", "Dzcaron", "Abrevegrave", "Khook", "etnahtafoukhlefthebrew", "asciicircum", "onecircle", "kuhiragana", "sevenarabic", "tcircle", "blackrectangle", "yodyodhebrew", "eegurmukhi", "yen", "esmallkatakana", "SF460000", "afii57388", "sixperiod", "eogonek", "Eharmenian", "H18533", "whitecornerbracketleft", "dotkatakana", "tahinitialarabic", "H18543", "shaddafathaarabic", "cstretched", "squarekm", "parenrightex", "nuhiragana", "nyagurmukhi", "zecyrillic", "whitecircleinverse", "arrowhorizex", "soliduslongoverlaycmb", "Ydotaccent", "elevencircle", "molsquare", "agrave", "controlSTX", "Acircumflex", "dblprimemod", "ratio", "shagurmukhi", "rieulcirclekorean", "rieulkorean", "bikatakana", "ncircle", "kakatakana", "tonebarmidmod", "Acircumflexhookabove", "corporationsquare", "guillemotleft", "eharmenian", "arrowright", "umacron", "afii57381", "greatermonospace", "kikatakanahalfwidth", "Ncedilla", "iterationkatakana", "sixhangzhou", "hatafqamats28", "Iicyrillic", "AEsmall", "hukatakana", "mvsquare", "thieuthacirclekorean", "parenleftex", "club", "gammasuperior", "tsadihebrew", "Cdotaccent", "evowelsignbengali", "righttriangle", "Psi", "jmonospace", "jeemfinalarabic", "menarmenian", "ecyrillic", "product", "onemonospace", "ragurmukhi", "meemmedialarabic", "saraaimaimalaithai", "racute", "Aacute", "tenideographicparen", "memdageshhebrew", "quotedblprimereversed", "fehmedialarabic", "Seharmenian", "iogonek", "rehfinalarabic", "dblGrave", "kcommaaccent", "thanthakhatthai", "ddagujarati", "SF070000", "gagujarati", "twocircleinversesansserif", "mmsquaredsquare", "uubengali", "Udieresiscyrillic", "eightperiod", "sarauthai", "dammatanarabic", "asterism", "thereexists", "thagurmukhi", "phabengali", "sterlingmonospace", "yehmeeminitialarabic", "rho", "rafe", "ekorean", FirebaseAnalytics.Param.CURRENCY, "noonjeeminitialarabic", "hv", "centinferior", "liwnarmenian", "kafhebrew", "yodyodpatahhebrew", "lvocalicvowelsignbengali", "khokhaithai", "braceex", "nieunparenkorean", "ideographiccommaleft", "nieuncirclekorean", "colon", "arrowboth", "raarmenian", "yehbarreearabic", "Lcircle", "dollarmonospace", "arrowup", "obarredcyrillic", "blackupperrighttriangle", "chook", "paiyannoithai", "numbersignsmall", "sekatakanahalfwidth", "tavdageshhebrew", "yerahbenyomohebrew", "Hcircumflex", "Ecaron", "controlACK", "reshhebrew", "saraueethai", "irigurmukhi", "ibengali", "ocircumflexgrave", "yerahbenyomolefthebrew", "rihiragana", "udieresisacute", "eth", "logicalor", "Kappa", "Chedescenderabkhasiancyrillic", "phieuphparenkorean", "afii10061", "afii10060", "eta", "Udblgrave", "afii10065", "afii10064", "afii10069", "afii10068", "gamma", "Klinebelow", "macron", "saraothai", "rittorusquare", "nlinebelow", "macronmonospace", "rekatakanahalfwidth", "bracketrighttp", "OE", "AE", "Ugrave", "ghabengali", "uhiragana", "minus", "ideographicleftcircle", "Oogonekmacron", "quotedblmonospace", "hyphen", "alefhamzabelowfinalarabic", "yenmonospace", "muchless", "franc", "sixoldstyle", "phi", "madeva", "quotedblbase", "olehebrew", "Vtilde", "Scarondotaccent", "logicalnot", "gereshaccenthebrew", "Csmall", "iparen", "squarewhitewithsmallblack", "Kmonospace", "akorean", "dahiragana", "Tetsecyrillic", "phook", "nineteencircle", "patahhebrew", "dtail", "hungarumlautcmb", "yuslittlecyrillic", "clubsuitblack", "Uhungarumlaut", "Otildeacute", "onepersian", "centoldstyle", "dzaltone", "ttehmedialarabic", "osmallkatakana", "ideographicselfparen", "yokorean", "khieukhparenkorean", "thousandsseparatorarabic", "ssanghieuhkorean", "ltshade", "lambda", "twentycircle", "oneinferior", "cbopomofo", "dasiapneumatacyrilliccmb", "asteriskmonospace", "het", "palatalizationcyrilliccmb", "deicoptic", "yakatakana", "chaarmenian", "Ringsmall", "phagurmukhi", "question", "SF020000", "umacroncyrillic", "denominatorminusonenumeratorbengali", "udeva", "hiriq21", "pointingindexrightwhite", "fisheye", "whiteuppointingsmalltriangle", "cornerbracketleftvertical", "universal", "nagujarati", "cadeva", "decyrillic", "saraiithai", "jabengali", "Jaarmenian", "sindothebrew", "ohorngrave", "iivowelsigndeva", "Tretroflexhook", "Nacute", "twodeva", "logicalnotreversed", "bet", "aring", "gmonospace", "Pdotaccent", "Kacyrillic", "nakatakana", "gravetonecmb", "percentmonospace", "nieunacirclekorean", "Ccedilla", "Udieresismacron", "nuktagujarati", "dblgrave", "zohiragana", "squarediagonalcrosshatchfill", "dorusquare", "hiriq2d", "tildeoverlaycmb", "integraltop", "upsilon", "kmcubedsquare", "kihiragana", "afii57717", "Grave", "kapyeounssangpieupkorean", "threeoldstyle", "minusplus", "wokatakana", "aemacron", "checyrillic", "uhorn", "ustraightcyrillic", "sadmedialarabic", "segoltahebrew", "esmallkatakanahalfwidth", "maitrithai", "nihiragana", "afii10148", "colonsmall", "dblanglebracketrightvertical", "ustraightstrokecyrillic", "qafmedialarabic", "caron", "ivowelsigndeva", "edotaccent", "imacroncyrillic", "padeva", "afii63167", "fahrenheit", "gradient", "heartsuitwhite", "arrowdashright", "kashidaautonosidebearingarabic", "bullet", "parenrightbt", "controlSOT", "gravedeva", "chi", "ehookabove", "aiecyrillic", "ksicyrillic", "jhagujarati", "tekatakana", "softhyphen", "Kheicoptic", "vparen", "tukatakanahalfwidth", "Omega", "zaharabic", "nsuperior", "ecircumflexgrave", "Emcyrillic", "Yuslittlecyrillic", "dotlessj", "kiromeetorusquare", "tipehalefthebrew", "lxsquare", "peezisquare", "SF400000", "Cheverticalstrokecyrillic", "pehiragana", "zayin", "ogonekcmb", "infinity", "mumsquare", "gscript", "Ohornhookabove", "ekonkargurmukhi", User.MALE, "dollarsuperior", "bracerightbt", "Ebreve", "arrowdownwhite", "sikatakanahalfwidth", "afii57433", "afii57432", "afii57431", "afii57430", "afii57434", "nineinferior", "overscore", "squarelog", "seenmedialarabic", "nieunaparenkorean", "mohmsquare", "Shchacyrillic", "Zedescendercyrillic", "acircumflexacute", "uuvowelsigndeva", "mabengali", "Mdotbelow", "colontriangularmod", "Chekhakassiancyrillic", "afii57534", "uogonek", "voarmenian", "vavhebrew", "hotsprings", "SF390000", "zdotbelow", "Chaarmenian", "hookcmb", "rrvocalicvowelsigndeva", "oslashacute", "primereversed", "Gdotaccent", "holamnarrowhebrew", "jheharmenian", "suhiragana", "Ycircumflex", "zacute", "thirteenparen", "sevengujarati", "sikatakana", "hiriqhebrew", "qubutswidehebrew", "afii10066", "whiteleftpointingtriangle", "wawhamzaabovefinalarabic", "finalkaf", "elevenperiod", "Nj", "Lj", "Fdotaccent", "Dhook", "pointingindexleftwhite", "underscoredbl", "iubopomofo", "Omegatitlocyrillic", "imacron", "eightdeva", "Schwa", "dbllowlinecmb", "Ocenteredtilde", "Lcommaaccent", "ij", "nj", "lj", "dikatakana", "nabla", "smonospace", "nvsquare", "sacutedotaccent", "trademarkserif", "eightcircleinversesansserif", "shevawidehebrew", "afii57636", "gekatakana", "tortoiseshellbracketright", "alefqamatshebrew", "ideographicspecialparen", "Dtopbar", "omegalatinclosed", "macronlowmod", "braceleftbt", "arrowupwhite", "yehfinalarabic", "Esh", "lessorgreater", "vagurmukhi", "macroncmb", "ideographwoodcircle", "nooninitialarabic", "nineideographicparen", "MBsquare", "Elevenroman", "vavdagesh", "SF010000", "Wacute", "Thorn", "whitediamond", "betdageshhebrew", "acaron", "emdashvertical", "afii10023", "afii10022", "afii10021", "afii10020", "afii10027", "afii10026", "afii10025", "afii10024", "ovowelsigndeva", "commasmall", "afii10029", "afii10028", "aubopomofo", "Iacute", "odieresis", "qadmahebrew", "minusbelowcmb", "ikatakana", "dblarchinvertedbelowcmb", "Eiotifiedcyrillic", "okatakana", "ramiddlediagonalbengali", "Khacyrillic", "rikatakanahalfwidth", "noonmedialarabic", "kastrokecyrillic", "smileface", "bulletoperator", "aavowelsigndeva", "pehebrew", "arrowupdn", "endescendercyrillic", "brokenbar", "tretroflexhook", "Sheicoptic", "propellor", "oogonek", "controlDC2", "omega", "theta", "yhook", "alefhamzabelowarabic", "hahiragana", "Ustraightcyrillic", "arrowtableft", "yehhamzaabovefinalarabic", "ninegujarati", "ereversedcyrillic", "rhotichookmod", "lessequal", "nhookretroflex", "nineteenparen", "aibengali", "eturned", "kaffinalarabic", "dieresisgrave", "qamats27", "rhosymbolgreek", "reflexsuperset", "hehhamzaaboveisolatedarabic", "zeroarabic", "ihookabove", "ncommaaccent", "danda", "rvocalicvowelsigngujarati", "fiveinferior", "cmonospace", "echarmenian", "thieuthparenkorean", "gacute", "slashmonospace", "llagujarati", "bulletinverse", "dbloverlinecmb", "ivowelsignbengali", "merkhakefulahebrew", "hatafpatah", "benarmenian", "mpasquare", "ohornhookabove", "acircumflexhookabove", "mieumkorean", "pabengali", "kafmedialarabic", "Eopen", "dblanglebracketleft", "yehthreedotsbelowarabic", "Aiecyrillic", "sioskiyeokkorean", "glottalstopreversedsuperior", "sarauethai", "hookabovecomb", "lcommaaccent", "Yusbigiotifiedcyrillic", "bracerightmid", "deleteright", "Utildebelow", "katahiraprolongmarkhalfwidth", "viramabengali", "rekatakana", "maichattawathai", "hangulfiller", "wring", "arrowdownright", "kiyeokkorean", "rieulkiyeoksioskorean", "arrowleft", "onehangzhou", "ohorntilde", "kirosquare", "eighteenparen", "iniarmenian", "shacyrillic", "hyphensmall", "khokhonthai", "eshcurl", "nyabengali", "Ncircumflexbelow", "qof", "Rcedilla", "diamondsuitwhite", "hypheninferior", "otcyrillic", "eopenreversed", "Rsmallinverted", "psi", "jsuperior", "Ohorn", "seventeenperiod", "zedescendercyrillic", "dotbelowcmb", "kabashkircyrillic", "exclam", "exclamdown", "angleright", "Acircle", "parenrightmonospace", "hparen", "parenrighttp", "dottedcircle", "dadinitialarabic", "Ysmall", "betasymbolgreek", "sheva", "superset", "commaabovecmb", "ucircle", "hehebrew", "idieresisacute", "thothongthai", "clickdental", "vikatakana", "Ukcyrillic", "Ereversedcyrillic", "telishagedolahebrew", "afii57839", "obopomofo", "uuvowelsignbengali", "afii57671", "afii57670", "sevenoldstyle", "afii57672", "afii57675", "poplathai", "afii57677", "afii57676", "Decyrillic", "afii57678", "pieupsiostikeutkorean", "Scedilla", "zerodeva", "kokatakanahalfwidth", "squarekmcapital", "ninegurmukhi", "bsuperior", "eightinferior", "mieumpieupkorean", "ucircumflex", "bhook", "afii10072", "plus", "holamwidehebrew", "Hsmall", "afii10075", "afii10074", "mukatakanahalfwidth", "Ucircumflexbelow", "tethebrew", "khahfinalarabic", "lmiddletilde", "afii57470", "wcircumflex", "Cheabkhasiancyrillic", "Rdotbelow", "angstrom", "ydotaccent", "sheeninitialarabic", "mbopomofo", "afii10083", "parenleft", "afii10080", "Njecyrillic", "afii10084", "zaarmenian", "SF250000", "centigrade", "Echarmenian", "badeva", "utilde", "Hbrevebelow", "patah11", "agurmukhi", "Hdotbelow", "arrowrightdblstroke", "tonebarextralowmod", "hbrevebelow", "odblacute", "thieuthkorean", "hokatakanahalfwidth", "arrowupright", "Thornsmall", "dieresisbelowcmb", "arrowvertex", "Aacutesmall", "SF420000", "tdieresis", "pashtahebrew", "nunhebrew", "Udotbelow", "hiriqquarterhebrew", "rrvocalicbengali", "twothai", "tevirlefthebrew", "enbopomofo", "zahmedialarabic", "slash", "Edblgrave", "Zeta", "sosalathai", "Euro", "onehackarabic", "patah1d", "yeokorean", "twosuperior", "Kadescendercyrillic", "Phi", "mufsquare", "Omicron", "pieupcirclekorean", "finalpehebrew", "Zedieresiscyrillic", "questionarmenian", "ideographicearthparen", "fourroman", "shaddadammaarabic", "Ghadarmenian", "mekatakana", "yodhebrew", "ldotbelow", "ideographicexcellentcircle", "ehiragana", "shaddakasraarabic", "seharmenian", "betdagesh", "horncmb", "ideographicwoodparen", "thetasymbolgreek", "zainfinalarabic", "ivowelsigngujarati", "engbopomofo", "pluscircle", "threebengali", "plusmod", "lowlinecenterline", "Ncommaaccent", "bracketleftmonospace", "klinebelow", "arrowdownleft", "koroniscmb", "Aringbelow", "uvowelsigndeva", "cheharmenian", "Wdieresis", "dhook", "Eth", "usmallkatakana", "ideographiccentrecircle", "semicolon", "acircumflexdotbelow", "Daarmenian", "arrowdblleft", "parenleftmonospace", "righttackbelowcmb", "SF500000", "yhookabove", "asteriskaltonearabic", "questiondownsmall", "Ograve", "hatafqamats34", "saraaathai", "tturned", "ideographicspace", "shindothebrew", "qparen", "kafdagesh", "nmsquare", "omonospace", "fourinferior", "palochkacyrillic", "pakatakana", "oacute", "Tildesmall", "Ocircumflextilde", "rieulthieuthkorean", "Aringacute", "Upsilon", "ocandradeva", "threequarters", "divides", "Zhebrevecyrillic", "shaddakasratanarabic", "thanthakhatupperleftthai", "Iniarmenian", "thorn", "whitecornerbracketright", "mars", "Adotbelow", "llvocalicbengali", "qubuts31", "SF030000", "ohorndotbelow", "vavdageshhebrew", "rdotaccent", "Edieresis", "fongmanthai", "pehfinalarabic", "ghainarabic", "Otilde", "finaltsadi", "shadedark", "hatafpatahhebrew", "pieupacirclekorean", "fifteencircle", "ideographiclaborparen", "ssangsioskorean", "kadeva", "twentyhangzhou", "Ezh", "siosacirclekorean", "sixcircleinversesansserif", "triagdn", "kabengali", "finalmemhebrew", "holam32", "dadeva", "partialdiff", "zhebrevecyrillic", "gafinitialarabic", "Itildebelow", "samekhhebrew", "bhagujarati", "esh", "iivowelsignbengali", "pointingindexdownwhite", "rieulacirclekorean", "rafehebrew", "Jcircumflex", "ehbopomofo", "rieulkiyeokkorean", "whitebullet", "rieulparenkorean", "ismallkatakana", "maihanakatleftthai", "SF490000", "tencircle", "kiyeokcirclekorean", "mlonglegturned", "puhiragana", "lcedilla", "commaaboverightcmb", "ydieresis", "shindageshsindot", "blackupperlefttriangle", "ngabengali", "uudeva", "zerooldstyle", "invcircle", "asterisksmall", "uptackmod", "ideographicsocietyparen", "tukatakana", "SF110000", "Atilde", "numbersign", "chedieresiscyrillic", "dollarinferior", "ocandragujarati", "elevenroman", "wawarabic", "Acyrillic", "bilabialclick", "Wcircumflex", "IJ", "Umonospace", "phi1", "Sdotbelow", "Ccedillasmall", "acyrillic", "paampssquare", "yahiragana", "thousandsseparatorpersian", "approxequalorimage", "cieucparenkorean", "squareorthogonalcrosshatchfill", "rhookturnedsuperior", "tagujarati", "Acircumflextilde", "jeharabic", "fivebengali", "eibopomofo", "karoriisquare", "ideographichaveparen", "Gangiacoptic", "yerudieresiscyrillic", "tonebarextrahighmod", "zlinebelow", "Ghook", "mieumacirclekorean", "ccaron", "segolhebrew", "saraathai", "zarqahebrew", "circlewithrighthalfblack", "shabengali", "longs", "paragraph", "ccedilla", "Bcircle", "kmsquaredsquare", "etarmenian", "etnahtafoukhhebrew", "arrowleftwhite", "yukatakanahalfwidth", "finalkafdagesh", "khook", "efcyrillic", "dbsquare", "rieulpieupsioskorean", "udieresiscyrillic", "projective", "lamalefhamzaaboveisolatedarabic", "quotedblleft", "jcrossedtail", "eshortdeva", "vuhiragana", "Stigmagreek", "periodcentered", "whiteuppointingtriangle", "vavyodhebrew", "shchacyrillic", "phieuphcirclekorean", "hikatakana", "wbsquare", "uinvertedbreve", "Twelveroman", "circleot", "threeideographicparen", "dieresis", "twopersian", "sixgurmukhi", "kekatakana", "dong", "ocircumflexdotbelow", "sbopomofo", "existential", "yosmallkatakanahalfwidth", "Lambda", "Qcircle", "lessequalorgreater", "munahhebrew", "underscorevertical", "sheenfinalarabic", "arrowleftdblstroke", "Einvertedbreve", "squareln", "gukatakana", "oomatragurmukhi", "rhookturned", "divide", "squarehorizontalfill", "notsuperset", "dotbelowcomb", "Imacron", "afii61573", "afii61575", "afii61574", "copyright", "Odotbelow", "afii10030", "kafinitialarabic", "afii10035", "bindigurmukhi", "shagujarati", "sevenbengali", "kbopomofo", "Agrave", "Ksmall", "utildebelow", "Coarmenian", "Epsilon", "arrowheadleftmod", "Ucircumflexsmall", "SF270000", "muwsquare", "dotaccent", "alefmaksuraarabic", "okorean", "bracketlefttp", "hieuhparenkorean", "tthabengali", "intersection", "Omegacyrillic", "aacute", "squareupperrighttolowerleftfill", "dagujarati", "ecircumflexacute", "Gravesmall", "onegurmukhi", "zhbopomofo", "Uhorngrave", "ayinaltonehebrew", "ddotbelow", "rrehfinalarabic", "honokhukthai", "maitaikhuthai", "uhornhookabove", "finalmem", "Beta", "shadeva", "luthai", "Ocircumflexgrave", "ndotaccent", "wavyunderscorevertical", "siosparenkorean", "rightangle", "DZ", "Scaron", "dblintegral", "fourhackarabic", "Sacutedotaccent", "kohiragana", "doubleyodpatah", "kmonospace", "threehangzhou", "ydotbelow", "tccurl", "ssangnieunkorean", "chieuchcirclekorean", "fourthai", "jdotlessstroke", "tdotbelow", "aininitialarabic", "obarred", "Rdotbelowmacron", "periodhalfwidth", "lamalefhamzaabovefinalarabic", "Nowarmenian", "yikorean", "nohiragana", "telephoneblack", "rokatakanahalfwidth", "notless", "quoteleftreversed", "horicoptic", "kafrafehebrew", "ideographicwaterparen", "postalmark", "omegaroundcyrillic", "Ccircle", "pvsquare", "controlGS", "controlBEL", "Vdotbelow", "fourmonospace", "tcircumflexbelow", "oangthai", "twothirds", "chieuchkorean", "getamark", "cornerbracketright", "Uhornacute", "fofathai", "thalarabic", "zahfinalarabic", "epsilontonos", "sevendeva", "tiwnarmenian", "eightideographicparen", "yukorean", "qubuts25", "Ecircumflexacute", "therefore", "Ldotbelow", "Etatonos", "backslash", "ssangcieuckorean", "tildecomb", "yoyaekorean", "rukatakana", "araeaekorean", "blackcircle", "Ohorntilde", "zerohackarabic", "upsilontonos", "usmallkatakanahalfwidth", "euro", "nundageshhebrew", "ideographicrepresentparen", "tehhahisolatedarabic", "dehiragana", "twodotleader", "weierstrass", "phadeva", "memdagesh", "holam", "khhagurmukhi", "nieuncieuckorean", "ssadeva", "glottalstopstrokereversed", "Ecircumflextilde", "kadescendercyrillic", "bracerightvertical", "mieumpansioskorean", "fifteenparen", "pihiragana", "tonebarhighmod", "dargalefthebrew", "Yuslittleiotifiedcyrillic", "rfishhook", "spade", "afii10073", "Qmonospace", "afii10071", "afii10070", "afii10077", "iocyrillic", "finalnunhebrew", "Eacutesmall", "underscorewavy", "afii10079", "afii10078", "meeminitialarabic", "sokatakana", "ringhalfleftcentered", "aagurmukhi", "xbopomofo", "Emonospace", "Msmall", "block", "jehfinalarabic", "wakatakana", "cparen", "approaches", "glottalinvertedstroke", "masoracirclehebrew", "yekorean", "phagujarati", "kpasquare", "eightpersian", "jcircumflex", "thanthakhatlowrightthai", "omegatitlocyrillic", "ocandravowelsigndeva", "Macron", "yoyakthai", "SF220000", "OEsmall", "qamatsqatannarrowhebrew", "cedilla", "dokatakana", "ddalarabic", "Escyrillic", "ampersandmonospace", "pparen", "tortoiseshellbracketrightvertical", "ecedillabreve", "hatafsegolhebrew", "saraiileftthai", "ecaron", "greaterorless", "nekatakana", "sdotbelowdotaccent", "gadeva", "element", "Bdotbelow", "ieungkorean", "controlETX", "ideographnamecircle", "bhadeva", "twentyparen", "Gjecyrillic", "dukatakana", "deltaturned", "tuhiragana", "afii57454", "shaddadammatanarabic", "Hdieresis", "Utildeacute", "tbopomofo", "khabengali", "eopenclosed", "hatafsegol", "pehmedialarabic", "elcyrillic", "qamats10", "tohiragana", "threenumeratorbengali", "hasquare", "lameddageshhebrew", "earth", "because", "oneoldstyle", "equalmonospace", "nnabengali", "khokhuatthai", "ugrave", "yabengali", "yeharabic", "onedeva", "gereshhebrew", "ssangtikeutkorean", "pageup", "kooposquare", "klsquare", "zcircumflex", "whitetortoiseshellbracketleft", "xsuperior", "okatakanahalfwidth", "arrowheaddownmod", "maitrilowrightthai", "Edotbelow", "Softsigncyrillic", "dotaccentcmb", "Gecyrillic", "amacron", "ecircumflex", "behfinalarabic", "eighteencircle", "mieumparenkorean", "phinthuthai", "gravecmb", "iibengali", "rdotbelow", "ragujarati", "mhook", "threeeighths", "dieresisacute", "masquare", "dagesh", "mekatakanahalfwidth", "Amonospace", "iigujarati", "threemonospace", "acircle", "jadeva", "Iotaafrican", "nukatakanahalfwidth", "ibreve", "arrowrightheavy", "rturnedsuperior", "omicron", "wavedash", "radical", "dieresiscmb", "gravemonospace", "downtackbelowcmb", "Koppagreek", "kashidaautoarabic", "mukatakana", "thanthakhatlowleftthai", "eshreversedloop", "ideographicreachparen", "itildebelow", "idblgrave", "aleph", "ttehinitialarabic", "ncedilla", "Rcircle", "Iacutesmall", "Oacutesmall", "yusmallkatakanahalfwidth", "glottalstopstroke", "capslock", "nacute", "shook", "gravecomb", "shinshindot", "kwsquare", "Omacron", "kasmallkatakana", "Sigma", "underscore", "nuktabengali", "Ucaron", "ff", "sheenmedialarabic", "birusquare", "saraueleftthai", "xabovecmb", "Fhook", "hatafqamatsquarterhebrew", "Wdotbelow", "bracerighttp", "zagurmukhi", "nlegrightlong", "magurmukhi", "Edieresissmall", "grave", "DieresisGrave", "percent", "lamalefmaddaabovefinalarabic", "anglebracketleftvertical", "semicolonarabic", "ikorean", "thadeva", "Ntilde", "sioscieuckorean", "Feicoptic", "aringbelow", "Ainvertedbreve", "Aogonek", "afii57723", "Lcedilla", "plusmonospace", "supersetorequal", "encyrillic", "ndotbelow", "ysuperior", "nnnadeva", "gahiragana", "gangiacoptic", "Zhearmenian", "Dcaron", "syouwaerasquare", "afii57423", "afii57422", "afii57421", "afii57420", "afii57427", "paasentosquare", "afii57425", "araeakorean", "afii57429", "afii57428", "zaqefgadolhebrew", "bdotaccent", "hatafsegolwidehebrew", "sokatakanahalfwidth", "seveninferior", "bagujarati", "sioscirclekorean", "SF210000", "Idieresisacute", "Ssmall", "yparen", "ninebengali", "Sevenroman", "Raarmenian", "avagrahadeva", "Nhookleft", "Udblacute", "pieupthieuthkorean", "dialytikatonoscmb", "umatragurmukhi", "KBsquare", "wowaenthai", "Oinvertedbreve", "aringacute", "aleflamedhebrew", "zretroflexhook", "vokatakana", "controlCR", "Kcaron", "cruzeiro", "wacute", "ddhagurmukhi", "fouroldstyle", "qubuts", "mwsquare", "tsadidagesh", "ninesuperior", "tserequarterhebrew", "Nu", "Ugravesmall", "anusvaradeva", "Mu", "alefpatahhebrew", "ebreve", "parenrightvertical", "eighthackarabic", "periodsuperior", "Upsilondieresis", "dialytikatonos", "xmonospace", "seenfinalarabic", "makatakanahalfwidth", "Ecircle", "mu", "Yicyrillic", "whitesmilingface", "periodinferior", "Yacute", "ugujarati", "circumflexbelowcmb", "dzecyrillic", "Icircumflex", "seven", "Vewarmenian", "tevirhebrew", "bokatakana", "tsere2b", "chochangthai", "tehiragana", "yuikorean", "hehaltonearabic", "ladeva", "threeparen", "sadeva", "anudattadeva", "gokatakana");

    private C2107h4() {
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2110h9
    /* JADX INFO: renamed from: k4 */
    public final char mo10660k4(String str) {
        switch (f7287x1.m27428k4(str)) {
        }
        return (char) 1461;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m10663x1(char c) {
        if (c == 666) {
            return "eopenclosed";
        }
        if (c == 667) {
            return "Gsmallhook";
        }
        switch (c) {
            case 1:
                return "controlSTX";
            case 2:
                return "controlSOT";
            case 3:
                return "controlETX";
            case 4:
                return "controlEOT";
            case 5:
                return "controlENQ";
            case 6:
                return "controlACK";
            case 7:
                return "controlBEL";
            case '\b':
                return "controlBS";
            case '\t':
                return "controlHT";
            case '\n':
                return "controlLF";
            case 11:
                return "controlVT";
            case '\f':
                return "controlFF";
            case '\r':
                return "controlCR";
            case 14:
                return "controlSO";
            case 15:
                return "controlSI";
            case 16:
                return "controlDLE";
            case 17:
                return "controlDC1";
            case 18:
                return "controlDC2";
            case 19:
                return "controlDC3";
            case 20:
                return "controlDC4";
            case 21:
                return "controlNAK";
            case 22:
                return "controlSYN";
            case 23:
                return "controlETB";
            case 24:
                return "controlCAN";
            case 25:
                return "controlEM";
            case 26:
                return "controlSUB";
            case 27:
                return "controlESC";
            case 28:
                return "controlFS";
            case 29:
                return "controlGS";
            case 30:
                return "controlRS";
            case 31:
                return "controlUS";
            case ' ':
                return "space";
            case '!':
                return "exclam";
            case '\"':
                return "quotedbl";
            case '#':
                return "numbersign";
            case '$':
                return "dollar";
            case '%':
                return "percent";
            case '&':
                return "ampersand";
            case '\'':
                return "quotesingle";
            case '(':
                return "parenleft";
            case ')':
                return "parenright";
            case '*':
                return "asterisk";
            case '+':
                return "plus";
            case ',':
                return "comma";
            case '-':
                return "hyphen";
            case '.':
                return "period";
            case '/':
                return "slash";
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            case ':':
                return "colon";
            case ';':
                return "semicolon";
            case '<':
                return "less";
            case '=':
                return "equal";
            case '>':
                return "greater";
            case '?':
                return "question";
            case '@':
                return "at";
            case 'A':
                return C18385v2.f56336h;
            case 'B':
                return "B";
            case 'C':
                return "C";
            case 'D':
                return "D";
            case 'E':
                return "E";
            case 'F':
                return "F";
            case 'G':
                return "G";
            case 'H':
                return "H";
            case 'I':
                return "I";
            case 'J':
                return "J";
            case 'K':
                return "K";
            case 'L':
                return "L";
            case 'M':
                return "M";
            case 'N':
                return "N";
            case 'O':
                return "O";
            case 'P':
                return "P";
            case 'Q':
                return "Q";
            case 'R':
                return "R";
            case 'S':
                return "S";
            case 'T':
                return "T";
            case 'U':
                return "U";
            case 'V':
                return "V";
            case 'W':
                return "W";
            case 'X':
                return "X";
            case 'Y':
                return "Y";
            case 'Z':
                return "Z";
            case '[':
                return "bracketleft";
            case '\\':
                return "backslash";
            case ']':
                return "bracketright";
            case '^':
                return "asciicircum";
            case '_':
                return "underscore";
            case '`':
                return "grave";
            case 'a':
                return "a";
            case 'b':
                return "b";
            case 'c':
                return "c";
            case 'd':
                return "d";
            case 'e':
                return "e";
            case 'f':
                return "f";
            case 'g':
                return "g";
            case 'h':
                return C18773h.f57233c;
            case 'i':
                return ContextChain.TAG_INFRA;
            case 'j':
                return "j";
            case 'k':
                return "k";
            case 'l':
                return "l";
            case 'm':
                return "m";
            case 'n':
                return BackupFile.PREFIX_NOTE_DIR;
            case 'o':
                return "o";
            case 'p':
                return ContextChain.TAG_PRODUCT;
            case 'q':
                return "q";
            case 'r':
                return "r";
            case 's':
                return "s";
            case 't':
                return "t";
            case 'u':
                return "u";
            case 'v':
                return "v";
            case 'w':
                return "w";
            case 'x':
                return "x";
            case 'y':
                return "y";
            case 'z':
                return "z";
            case '{':
                return "braceleft";
            case '|':
                return "bar";
            case '}':
                return "braceright";
            case '~':
                return "asciitilde";
            case 127:
                return "controlDEL";
            default:
                switch (c) {
                    case 160:
                        return "nbspace";
                    case 161:
                        return "exclamdown";
                    case 162:
                        return "cent";
                    case 163:
                        return "sterling";
                    case 164:
                        return FirebaseAnalytics.Param.CURRENCY;
                    case 165:
                        return "yen";
                    case 166:
                        return "brokenbar";
                    case 167:
                        return "section";
                    case 168:
                        return "dieresis";
                    case 169:
                        return "copyright";
                    case 170:
                        return "ordfeminine";
                    case 171:
                        return "guillemotleft";
                    case 172:
                        return "logicalnot";
                    case 173:
                        return "sfthyphen";
                    case 174:
                        return "registered";
                    case 175:
                        return "macron";
                    case 176:
                        return "degree";
                    case 177:
                        return "plusminus";
                    case 178:
                        return "twosuperior";
                    case 179:
                        return "threesuperior";
                    case 180:
                        return "acute";
                    case 181:
                        return "mu";
                    case 182:
                        return "paragraph";
                    case 183:
                        return "middot";
                    case 184:
                        return "cedilla";
                    case 185:
                        return "onesuperior";
                    case 186:
                        return "ordmasculine";
                    case 187:
                        return "guillemotright";
                    case 188:
                        return "onequarter";
                    case 189:
                        return "onehalf";
                    case 190:
                        return "threequarters";
                    case 191:
                        return "questiondown";
                    case 192:
                        return "Agrave";
                    case 193:
                        return "Aacute";
                    case 194:
                        return "Acircumflex";
                    case 195:
                        return "Atilde";
                    case 196:
                        return "Adieresis";
                    case 197:
                        return "Aring";
                    case 198:
                        return "AE";
                    case 199:
                        return "Ccedilla";
                    case 200:
                        return "Egrave";
                    case 201:
                        return "Eacute";
                    case 202:
                        return "Ecircumflex";
                    case 203:
                        return "Edieresis";
                    case 204:
                        return "Igrave";
                    case 205:
                        return "Iacute";
                    case 206:
                        return "Icircumflex";
                    case 207:
                        return "Idieresis";
                    case 208:
                        return "Eth";
                    case 209:
                        return "Ntilde";
                    case 210:
                        return "Ograve";
                    case 211:
                        return "Oacute";
                    case 212:
                        return "Ocircumflex";
                    case 213:
                        return "Otilde";
                    case 214:
                        return "Odieresis";
                    case 215:
                        return "multiply";
                    case 216:
                        return "Oslash";
                    case 217:
                        return "Ugrave";
                    case 218:
                        return "Uacute";
                    case 219:
                        return "Ucircumflex";
                    case 220:
                        return "Udieresis";
                    case 221:
                        return "Yacute";
                    case 222:
                        return "Thorn";
                    case 223:
                        return "germandbls";
                    case 224:
                        return "agrave";
                    case 225:
                        return "aacute";
                    case 226:
                        return "acircumflex";
                    case 227:
                        return "atilde";
                    case 228:
                        return "adieresis";
                    case 229:
                        return "aring";
                    case 230:
                        return "ae";
                    case 231:
                        return "ccedilla";
                    case 232:
                        return "egrave";
                    case 233:
                        return "eacute";
                    case 234:
                        return "ecircumflex";
                    case 235:
                        return "edieresis";
                    case 236:
                        return "igrave";
                    case 237:
                        return "iacute";
                    case 238:
                        return "icircumflex";
                    case 239:
                        return "idieresis";
                    case 240:
                        return "eth";
                    case 241:
                        return "ntilde";
                    case 242:
                        return "ograve";
                    case 243:
                        return "oacute";
                    case 244:
                        return "ocircumflex";
                    case 245:
                        return "otilde";
                    case 246:
                        return "odieresis";
                    case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                        return "divide";
                    case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                        return "oslash";
                    case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                        return "ugrave";
                    case 250:
                        return "uacute";
                    case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                        return "ucircumflex";
                    case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                        return "udieresis";
                    case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                        return "yacute";
                    case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                        return "thorn";
                    case 255:
                        return "ydieresis";
                    case 256:
                        return "Amacron";
                    case 257:
                        return "amacron";
                    case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                        return "Abreve";
                    case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                        return "abreve";
                    case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                        return "Aogonek";
                    case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                        return "aogonek";
                    case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                        return "Cacute";
                    case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                        return "cacute";
                    case StyleIdentifier.BOOK_TITLE /* 264 */:
                        return "Ccircumflex";
                    case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                        return "ccircumflex";
                    case StyleIdentifier.TOC_HEADING /* 266 */:
                        return "Cdot";
                    case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                        return "cdot";
                    case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                        return "Ccaron";
                    case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                        return "ccaron";
                    case 270:
                        return "Dcaron";
                    case StyleIdentifier.PLAIN_TABLE_5 /* 271 */:
                        return "dcaron";
                    case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
                        return "Dcroat";
                    case StyleIdentifier.GRID_TABLE_1_LIGHT /* 273 */:
                        return "dcroat";
                    case StyleIdentifier.GRID_TABLE_2 /* 274 */:
                        return "Emacron";
                    case StyleIdentifier.GRID_TABLE_3 /* 275 */:
                        return "emacron";
                    case StyleIdentifier.GRID_TABLE_4 /* 276 */:
                        return "Ebreve";
                    case StyleIdentifier.GRID_TABLE_5_DARK /* 277 */:
                        return "ebreve";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL /* 278 */:
                        return "Edot";
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
                        return "edot";
                    case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1 /* 280 */:
                        return "Eogonek";
                    case StyleIdentifier.GRID_TABLE_2_ACCENT_1 /* 281 */:
                        return "eogonek";
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                        return "Ecaron";
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                        return "ecaron";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                        return "Gcircumflex";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 /* 285 */:
                        return "gcircumflex";
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1 /* 286 */:
                        return "Gbreve";
                    case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2 /* 287 */:
                        return "gbreve";
                    case StyleIdentifier.GRID_TABLE_2_ACCENT_2 /* 288 */:
                        return "Gdot";
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_2 /* 289 */:
                        return "gdot";
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                        return "Gcedilla";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2 /* 291 */:
                        return "gcedilla";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2 /* 292 */:
                        return "Hcircumflex";
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2 /* 293 */:
                        return "hcircumflex";
                    case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3 /* 294 */:
                        return "Hbar";
                    case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                        return "hbar";
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_3 /* 296 */:
                        return "Itilde";
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_3 /* 297 */:
                        return "itilde";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                        return "Imacron";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                        return "imacron";
                    case 300:
                        return "Ibreve";
                    case 301:
                        return "ibreve";
                    case 302:
                        return "Iogonek";
                    case 303:
                        return "iogonek";
                    case 304:
                        return "Idot";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4 /* 305 */:
                        return "dotlessi";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4 /* 306 */:
                        return "IJ";
                    case 307:
                        return "ij";
                    case 308:
                        return "Jcircumflex";
                    case StyleIdentifier.GRID_TABLE_2_ACCENT_5 /* 309 */:
                        return "jcircumflex";
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                        return "Kcedilla";
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_5 /* 311 */:
                        return "kcedilla";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5 /* 312 */:
                        return "kgreenlandic";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5 /* 313 */:
                        return "Lacute";
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5 /* 314 */:
                        return "lacute";
                    case 315:
                        return "Lcedilla";
                    case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
                        return "lcedilla";
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_6 /* 317 */:
                        return "Lcaron";
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_6 /* 318 */:
                        return "lcaron";
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                        return "Ldot";
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                        return "ldot";
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                        return "Lslash";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                        return "lslash";
                    case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                        return "Nacute";
                    case StyleIdentifier.LIST_TABLE_3 /* 324 */:
                        return "nacute";
                    case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                        return "Ncedilla";
                    case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                        return "ncedilla";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
                        return "Ncaron";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
                        return "ncaron";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                        return "napostrophe";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                        return "Eng";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
                        return "eng";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
                        return "Omacron";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
                        return "omacron";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
                        return "Obreve";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
                        return "obreve";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                        return "Odblacute";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                        return "odblacute";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                        return "OE";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
                        return "oe";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                        return "Racute";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                        return "racute";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                        return "Rcedilla";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                        return "rcedilla";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
                        return "Rcaron";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_3 /* 345 */:
                        return "rcaron";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_3 /* 346 */:
                        return "Sacute";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3 /* 347 */:
                        return "sacute";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3 /* 348 */:
                        return "Scircumflex";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3 /* 349 */:
                        return "scircumflex";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                        return "Scedilla";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_4 /* 351 */:
                        return "scedilla";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_4 /* 352 */:
                        return "Scaron";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_4 /* 353 */:
                        return "scaron";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4 /* 354 */:
                        return "Tcedilla";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 /* 355 */:
                        return "tcedilla";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4 /* 356 */:
                        return "Tcaron";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5 /* 357 */:
                        return "tcaron";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_5 /* 358 */:
                        return "Tbar";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_5 /* 359 */:
                        return "tbar";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                        return "Utilde";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_5 /* 361 */:
                        return "utilde";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5 /* 362 */:
                        return "Umacron";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5 /* 363 */:
                        return "umacron";
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6 /* 364 */:
                        return "Ubreve";
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_6 /* 365 */:
                        return "ubreve";
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_6 /* 366 */:
                        return "Uring";
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_6 /* 367 */:
                        return "uring";
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6 /* 368 */:
                        return "Udblacute";
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6 /* 369 */:
                        return "udblacute";
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                        return "Uogonek";
                    case StyleIdentifier.SMART_LINK /* 371 */:
                        return "uogonek";
                    case StyleIdentifier.MENTION /* 372 */:
                        return "Wcircumflex";
                    case StyleIdentifier.SMART_HYPERLINK /* 373 */:
                        return "wcircumflex";
                    case StyleIdentifier.HASHTAG /* 374 */:
                        return "Ycircumflex";
                    case StyleIdentifier.UNRESOLVED_MENTION /* 375 */:
                        return "ycircumflex";
                    case 376:
                        return "Ydieresis";
                    case 377:
                        return "Zacute";
                    case StyleIdentifier.length /* 378 */:
                        return "zacute";
                    case 379:
                        return "Zdot";
                    case 380:
                        return "zdot";
                    case 381:
                        return "Zcaron";
                    case 382:
                        return "zcaron";
                    case 383:
                        return "longs";
                    case 384:
                        return "bstroke";
                    case 385:
                        return "Bhook";
                    case 386:
                        return "Btopbar";
                    case 387:
                        return "btopbar";
                    case 388:
                        return "Tonesix";
                    case 389:
                        return "tonesix";
                    case 390:
                        return "Oopen";
                    case 391:
                        return "Chook";
                    case 392:
                        return "chook";
                    case 393:
                        return "Dafrican";
                    case 394:
                        return "Dhook";
                    case 395:
                        return "Dtopbar";
                    case 396:
                        return "dtopbar";
                    case 397:
                        return "deltaturned";
                    case 398:
                        return "Ereversed";
                    case 399:
                        return "Schwa";
                    case 400:
                        return "Eopen";
                    case 401:
                        return "Fhook";
                    case 402:
                        return "florin";
                    case 403:
                        return "Ghook";
                    case 404:
                        return "Gammaafrican";
                    case 405:
                        return "hv";
                    case 406:
                        return "Iotaafrican";
                    case 407:
                        return "Istroke";
                    case 408:
                        return "Khook";
                    case 409:
                        return "khook";
                    case 410:
                        return "lbar";
                    case 411:
                        return "lambdastroke";
                    case 412:
                        return "Mturned";
                    case 413:
                        return "Nhookleft";
                    case 414:
                        return "nlegrightlong";
                    case 415:
                        return "Ocenteredtilde";
                    case 416:
                        return "Ohorn";
                    case 417:
                        return "ohorn";
                    case 418:
                        return "Oi";
                    case 419:
                        return "oi";
                    case 420:
                        return "Phook";
                    case 421:
                        return "phook";
                    case 422:
                        return "yr";
                    case 423:
                        return "Tonetwo";
                    case 424:
                        return "tonetwo";
                    case 425:
                        return "Esh";
                    case 426:
                        return "eshreversedloop";
                    case 427:
                        return "tpalatalhook";
                    case 428:
                        return "Thook";
                    case 429:
                        return "thook";
                    case 430:
                        return "Tretroflexhook";
                    case 431:
                        return "Uhorn";
                    case 432:
                        return "uhorn";
                    case 433:
                        return "Upsilonafrican";
                    case 434:
                        return "Vhook";
                    case 435:
                        return "Yhook";
                    case 436:
                        return "yhook";
                    case 437:
                        return "Zstroke";
                    case 438:
                        return "zstroke";
                    case 439:
                        return "Ezh";
                    case 440:
                        return "Ezhreversed";
                    case 441:
                        return "ezhreversed";
                    case 442:
                        return "ezhtail";
                    case 443:
                        return "twostroke";
                    case 444:
                        return "Tonefive";
                    case 445:
                        return "tonefive";
                    case 446:
                        return "glottalinvertedstroke";
                    case 447:
                        return "wynn";
                    case 448:
                        return "clickdental";
                    case 449:
                        return "clicklateral";
                    case 450:
                        return "clickalveolar";
                    case 451:
                        return "clickretroflex";
                    case 452:
                        return "DZcaron";
                    case 453:
                        return "Dzcaron";
                    case 454:
                        return "dzcaron";
                    case 455:
                        return "LJ";
                    case 456:
                        return "Lj";
                    case 457:
                        return "lj";
                    case 458:
                        return "NJ";
                    case 459:
                        return "Nj";
                    case 460:
                        return "nj";
                    case 461:
                        return "Acaron";
                    case 462:
                        return "acaron";
                    case 463:
                        return "Icaron";
                    case 464:
                        return "icaron";
                    case 465:
                        return "Ocaron";
                    case 466:
                        return "ocaron";
                    case 467:
                        return "Ucaron";
                    case 468:
                        return "ucaron";
                    case 469:
                        return "Udieresismacron";
                    case 470:
                        return "udieresismacron";
                    case 471:
                        return "Udieresisacute";
                    case 472:
                        return "udieresisacute";
                    case 473:
                        return "Udieresiscaron";
                    case 474:
                        return "udieresiscaron";
                    case 475:
                        return "Udieresisgrave";
                    case 476:
                        return "udieresisgrave";
                    case 477:
                        return "eturned";
                    case 478:
                        return "Adieresismacron";
                    case 479:
                        return "adieresismacron";
                    case 480:
                        return "Adotmacron";
                    case 481:
                        return "adotmacron";
                    case 482:
                        return "AEmacron";
                    case 483:
                        return "aemacron";
                    case 484:
                        return "Gstroke";
                    case 485:
                        return "gstroke";
                    case 486:
                        return "Gcaron";
                    case 487:
                        return "gcaron";
                    case 488:
                        return "Kcaron";
                    case 489:
                        return "kcaron";
                    case 490:
                        return "Oogonek";
                    case 491:
                        return "oogonek";
                    case 492:
                        return "Oogonekmacron";
                    case 493:
                        return "oogonekmacron";
                    case 494:
                        return "Ezhcaron";
                    case 495:
                        return "ezhcaron";
                    case 496:
                        return "jcaron";
                    case 497:
                        return "DZ";
                    case 498:
                        return "Dz";
                    case 499:
                        return "dz";
                    case 500:
                        return "Gacute";
                    case 501:
                        return "gacute";
                    case 629:
                        return "obarred";
                    case 669:
                        return "jcrossedtail";
                    case 670:
                        return "kturned";
                    case TableStyleOptions.DEFAULT /* 672 */:
                        return "qhook";
                    case 673:
                        return "glottalstopstroke";
                    case 674:
                        return "glottalstopstrokereversed";
                    case 675:
                        return "dzaltone";
                    case 676:
                        return "dezh";
                    case 677:
                        return "dzcurl";
                    case 678:
                        return "ts";
                    case 679:
                        return "tesh";
                    case 680:
                        return "tccurl";
                    case 688:
                        return "hsuperior";
                    case 689:
                        return "hhooksuperior";
                    case 690:
                        return "jsuperior";
                    case 692:
                        return "rturnedsuperior";
                    case 693:
                        return "rhookturnedsuperior";
                    case 694:
                        return "Rsmallinvertedsuperior";
                    case 695:
                        return "wsuperior";
                    case 696:
                        return "ysuperior";
                    case 697:
                        return "primemod";
                    case 698:
                        return "dblprimemod";
                    case 699:
                        return "commaturnedmod";
                    case ALERT_VALUE:
                        return "afii57929";
                    case 701:
                        return "afii64937";
                    case 702:
                        return "ringhalfright";
                    case 703:
                        return "ringhalfleft";
                    case 704:
                        return "glottalstopmod";
                    case 705:
                        return "glottalstopreversedmod";
                    case 706:
                        return "arrowheadleftmod";
                    case 707:
                        return "arrowheadrightmod";
                    case 708:
                        return "arrowheadupmod";
                    case 709:
                        return "arrowheaddownmod";
                    case 710:
                        return "circumflex";
                    case 711:
                        return "caron";
                    case 712:
                        return "verticallinemod";
                    case 713:
                        return "firsttonechinese";
                    case 714:
                        return "secondtonechinese";
                    case 715:
                        return "fourthtonechinese";
                    case 716:
                        return "verticallinelowmod";
                    case 717:
                        return "macronlowmod";
                    case 718:
                        return "gravelowmod";
                    case 719:
                        return "acutelowmod";
                    case 720:
                        return "colontriangularmod";
                    case 721:
                        return "colontriangularhalfmod";
                    case 722:
                        return "ringhalfrightcentered";
                    case 723:
                        return "ringhalfleftcentered";
                    case 724:
                        return "uptackmod";
                    case 725:
                        return "downtackmod";
                    case 726:
                        return "plusmod";
                    case 727:
                        return "minusmod";
                    case 728:
                        return "breve";
                    case 729:
                        return "dotaccent";
                    case 730:
                        return "ring";
                    case 731:
                        return "ogonek";
                    case 732:
                        return "ilde";
                    case 733:
                        return "hungarumlaut";
                    case 734:
                        return "rhotichookmod";
                    case 736:
                        return "gammasuperior";
                    case 739:
                        return "xsuperior";
                    case 740:
                        return "glottalstopreversedsuperior";
                    case 741:
                        return "tonebarextrahighmod";
                    case 742:
                        return "tonebarhighmod";
                    case 743:
                        return "tonebarmidmod";
                    case 744:
                        return "tonebarlowmod";
                    case 745:
                        return "tonebarextralowmod";
                    case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                        return "gravecmb";
                    case 769:
                        return "acutecmb";
                    case 770:
                        return "circumflexcmb";
                    case 771:
                        return "tildecmb";
                    case 772:
                        return "macroncmb";
                    case 773:
                        return "overlinecmb";
                    case 774:
                        return "brevecmb";
                    case 775:
                        return "dotaccentcmb";
                    case 776:
                        return "dieresiscmb";
                    case 777:
                        return "hookabovecomb";
                    case 778:
                        return "ringcmb";
                    case 779:
                        return "hungarumlautcmb";
                    case 780:
                        return "caroncmb";
                    case 781:
                        return "verticallineabovecmb";
                    case 782:
                        return "dblverticallineabovecmb";
                    case 783:
                        return "dblgravecmb";
                    case 784:
                        return "candrabinducmb";
                    case 785:
                        return "breveinvertedcmb";
                    case 786:
                        return "commaturnedabovecmb";
                    case 787:
                        return "commaabovecmb";
                    case 788:
                        return "commareversedabovecmb";
                    case 789:
                        return "commaaboverightcmb";
                    case 790:
                        return "gravebelowcmb";
                    case 791:
                        return "acutebelowcmb";
                    case 792:
                        return "lefttackbelowcmb";
                    case 793:
                        return "righttackbelowcmb";
                    case 794:
                        return "leftangleabovecmb";
                    case 795:
                        return "horncmb";
                    case 796:
                        return "ringhalfleftbelowcmb";
                    case 797:
                        return "uptackbelowcmb";
                    case 798:
                        return "downtackbelowcmb";
                    case 799:
                        return "plusbelowcmb";
                    case EMERGENCY_VALUE:
                        return "minusbelowcmb";
                    case 801:
                        return "hookpalatalizedbelowcmb";
                    case 802:
                        return "hookretroflexbelowcmb";
                    case 803:
                        return "dotbelowcmb";
                    case 804:
                        return "dieresisbelowcmb";
                    case 805:
                        return "ringbelowcmb";
                    case 807:
                        return "cedillacmb";
                    case 808:
                        return "ogonekcmb";
                    case 809:
                        return "verticallinebelowcmb";
                    case 810:
                        return "bridgebelowcmb";
                    case 811:
                        return "dblarchinvertedbelowcmb";
                    case 812:
                        return "caronbelowcmb";
                    case 813:
                        return "circumflexbelowcmb";
                    case 814:
                        return "brevebelowcmb";
                    case 815:
                        return "breveinvertedbelowcmb";
                    case 816:
                        return "tildebelowcmb";
                    case 817:
                        return "macronbelowcmb";
                    case 818:
                        return "lowlinecmb";
                    case 819:
                        return "dbllowlinecmb";
                    case 820:
                        return "tildeoverlaycmb";
                    case 821:
                        return "strokeshortoverlaycmb";
                    case 822:
                        return "strokelongoverlaycmb";
                    case 823:
                        return "solidusshortoverlaycmb";
                    case 824:
                        return "soliduslongoverlaycmb";
                    case 825:
                        return "ringhalfrightbelowcmb";
                    case 826:
                        return "bridgeinvertedbelowcmb";
                    case 827:
                        return "squarebelowcmb";
                    case 828:
                        return "seagullbelowcmb";
                    case 829:
                        return "xabovecmb";
                    case 830:
                        return "tildeverticalcmb";
                    case 831:
                        return "dbloverlinecmb";
                    case 832:
                        return "gravetonecmb";
                    case 833:
                        return "acutetonecmb";
                    case 834:
                        return "perispomenigreekcmb";
                    case 835:
                        return "koroniscmb";
                    case 836:
                        return "dialytikatonoscmb";
                    case 837:
                        return "ypogegrammenigreekcmb";
                    case 864:
                        return "tildedoublecmb";
                    case 865:
                        return "breveinverteddoublecmb";
                    case 884:
                        return "numeralsigngreek";
                    case 885:
                        return "numeralsignlowergreek";
                    case 890:
                        return "ypogegrammeni";
                    case 894:
                        return "questiongreek";
                    case SQLitePersistence.MAX_ARGS /* 900 */:
                        return "tonos";
                    case 901:
                        return "dialytikatonos";
                    case 902:
                        return "Alphatonos";
                    case 903:
                        return "anoteleia";
                    case 904:
                        return "Epsilontonos";
                    case 905:
                        return "Etatonos";
                    case 906:
                        return "Iotatonos";
                    case 908:
                        return "Omicrontonos";
                    case 910:
                        return "Upsilontonos";
                    case 911:
                        return "Omegatonos";
                    case 912:
                        return "iotadieresistonos";
                    case 913:
                        return "Alpha";
                    case 914:
                        return "Beta";
                    case 915:
                        return "Gamma";
                    case 916:
                        return "Deltagreek";
                    case 917:
                        return "Epsilon";
                    case 918:
                        return "Zeta";
                    case 919:
                        return "Eta";
                    case 920:
                        return "Theta";
                    case 921:
                        return "Iota";
                    case 922:
                        return "Kappa";
                    case 923:
                        return "Lambda";
                    case 924:
                        return "Mu";
                    case 925:
                        return "Nu";
                    case 926:
                        return "Xi";
                    case 927:
                        return "Omicron";
                    case 928:
                        return "Pi";
                    case 929:
                        return "Rho";
                    case 931:
                        return "Sigma";
                    case 932:
                        return "Tau";
                    case 933:
                        return "Upsilon";
                    case 934:
                        return "Phi";
                    case 935:
                        return "Chi";
                    case 936:
                        return "Psi";
                    case 937:
                        return "Omegagreek";
                    case 938:
                        return "Iotadieresis";
                    case 939:
                        return "Upsilondieresis";
                    case 940:
                        return "alphatonos";
                    case 941:
                        return "epsilontonos";
                    case 942:
                        return "etatonos";
                    case 943:
                        return "iotatonos";
                    case 944:
                        return "upsilondieresistonos";
                    case 945:
                        return "alpha";
                    case 946:
                        return "beta";
                    case 947:
                        return "gamma";
                    case 948:
                        return "delta";
                    case 949:
                        return "epsilon";
                    case 950:
                        return "zeta";
                    case 951:
                        return "eta";
                    case 952:
                        return "theta";
                    case 953:
                        return "iota";
                    case 954:
                        return "kappa";
                    case 955:
                        return "lambda";
                    case 956:
                        return "mugreek";
                    case 957:
                        return "nu";
                    case 958:
                        return "xi";
                    case 959:
                        return "omicron";
                    case JSONParser.MODE_JSON_SIMPLE /* 960 */:
                        return ContextChain.TAG_PRODUCT_AND_INFRA;
                    case 961:
                        return "rho";
                    case 962:
                        return "sigma1";
                    case 963:
                        return "sigma";
                    case 964:
                        return "tau";
                    case 965:
                        return "upsilon";
                    case 966:
                        return "phi";
                    case 967:
                        return "chi";
                    case 968:
                        return "psi";
                    case 969:
                        return "omega";
                    case 970:
                        return "iotadieresis";
                    case 971:
                        return "upsilondieresis";
                    case 972:
                        return "omicrontonos";
                    case 973:
                        return "upsilontonos";
                    case 974:
                        return "omegatonos";
                    case 976:
                        return "betasymbolgreek";
                    case 977:
                        return "theta1";
                    case 978:
                        return "Upsilon1";
                    case 979:
                        return "Upsilonacutehooksymbolgreek";
                    case 980:
                        return "Upsilondieresishooksymbolgreek";
                    case 981:
                        return "phi1";
                    case 982:
                        return "omega1";
                    case 986:
                        return "Stigmagreek";
                    case 988:
                        return "Digammagreek";
                    case 990:
                        return "Koppagreek";
                    case 992:
                        return "Sampigreek";
                    case 994:
                        return "Sheicoptic";
                    case 995:
                        return "sheicoptic";
                    case 996:
                        return "Feicoptic";
                    case 997:
                        return "feicoptic";
                    case 998:
                        return "Kheicoptic";
                    case 999:
                        return "kheicoptic";
                    case 1000:
                        return "Horicoptic";
                    case 1001:
                        return "horicoptic";
                    case 1002:
                        return "Gangiacoptic";
                    case 1003:
                        return "gangiacoptic";
                    case 1004:
                        return "Shimacoptic";
                    case 1005:
                        return "shimacoptic";
                    case 1006:
                        return "Deicoptic";
                    case 1007:
                        return "deicoptic";
                    case 1008:
                        return "kappasymbolgreek";
                    case 1009:
                        return "rhosymbolgreek";
                    case 1010:
                        return "sigmalunatesymbolgreek";
                    case 1011:
                        return "yotgreek";
                    case 1025:
                        return "Iocyrillic";
                    case EditingLanguage.BULGARIAN /* 1026 */:
                        return "Djecyrillic";
                    case EditingLanguage.CATALAN /* 1027 */:
                        return "Gjecyrillic";
                    case EditingLanguage.CHINESE_TAIWAN /* 1028 */:
                        return "Ecyrillic";
                    case EditingLanguage.CZECH /* 1029 */:
                        return "Dzecyrillic";
                    case EditingLanguage.DANISH /* 1030 */:
                        return "Icyrillic";
                    case EditingLanguage.GERMAN_GERMANY /* 1031 */:
                        return "Yicyrillic";
                    case EditingLanguage.GREEK /* 1032 */:
                        return "Jecyrillic";
                    case EditingLanguage.ENGLISH_US /* 1033 */:
                        return "Ljecyrillic";
                    case EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT /* 1034 */:
                        return "Njecyrillic";
                    case EditingLanguage.FINNISH /* 1035 */:
                        return "Tshecyrillic";
                    case EditingLanguage.FRENCH_FRANCE /* 1036 */:
                        return "Kjecyrillic";
                    case EditingLanguage.HUNGARIAN /* 1038 */:
                        return "Ushortcyrillic";
                    case EditingLanguage.ICELANDIC /* 1039 */:
                        return "Dzhecyrillic";
                    case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                        return "Acyrillic";
                    case EditingLanguage.JAPANESE /* 1041 */:
                        return "Becyrillic";
                    case EditingLanguage.KOREAN /* 1042 */:
                        return "Vecyrillic";
                    case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
                        return "Gecyrillic";
                    case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
                        return "Decyrillic";
                    case EditingLanguage.POLISH /* 1045 */:
                        return "Iecyrillic";
                    case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
                        return "Zhecyrillic";
                    case EditingLanguage.ROMANSH /* 1047 */:
                        return "Zecyrillic";
                    case EditingLanguage.ROMANIAN /* 1048 */:
                        return "Iicyrillic";
                    case 1049:
                        return "Iishortcyrillic";
                    case 1050:
                        return "Kacyrillic";
                    case 1051:
                        return "Elcyrillic";
                    case 1052:
                        return "Emcyrillic";
                    case 1053:
                        return "Encyrillic";
                    case EditingLanguage.THAI /* 1054 */:
                        return "Ocyrillic";
                    case 1055:
                        return "Pecyrillic";
                    case EditingLanguage.URDU /* 1056 */:
                        return "Ercyrillic";
                    case EditingLanguage.INDONESIAN /* 1057 */:
                        return "Escyrillic";
                    case EditingLanguage.UKRAINIAN /* 1058 */:
                        return "Tecyrillic";
                    case EditingLanguage.BELARUSIAN /* 1059 */:
                        return "Ucyrillic";
                    case EditingLanguage.SLOVENIAN /* 1060 */:
                        return "Efcyrillic";
                    case EditingLanguage.ESTONIAN /* 1061 */:
                        return "Khacyrillic";
                    case EditingLanguage.LATVIAN /* 1062 */:
                        return "Tsecyrillic";
                    case EditingLanguage.LITHUANIAN /* 1063 */:
                        return "Checyrillic";
                    case EditingLanguage.TAJIK /* 1064 */:
                        return "Shacyrillic";
                    case EditingLanguage.PERSIAN /* 1065 */:
                        return "Shchacyrillic";
                    case EditingLanguage.VIETNAMESE /* 1066 */:
                        return "Hardsigncyrillic";
                    case EditingLanguage.ARMENIAN /* 1067 */:
                        return "Yericyrillic";
                    case EditingLanguage.AZERBAIJANI_LATIN /* 1068 */:
                        return "Softsigncyrillic";
                    case EditingLanguage.BASQUE /* 1069 */:
                        return "Ereversedcyrillic";
                    case EditingLanguage.SORBIAN /* 1070 */:
                        return "IUcyrillic";
                    case EditingLanguage.MACEDONIAN /* 1071 */:
                        return "IAcyrillic";
                    case EditingLanguage.SUTU /* 1072 */:
                        return "acyrillic";
                    case EditingLanguage.TSONGA /* 1073 */:
                        return "afii10066";
                    case EditingLanguage.TSWANA /* 1074 */:
                        return "afii10067";
                    case EditingLanguage.VENDA /* 1075 */:
                        return "afii10068";
                    case EditingLanguage.ISI_XHOSA /* 1076 */:
                        return "afii10069";
                    case EditingLanguage.ISI_ZULU /* 1077 */:
                        return "afii10070";
                    case EditingLanguage.AFRIKAANS /* 1078 */:
                        return "afii10072";
                    case EditingLanguage.GEORGIAN /* 1079 */:
                        return "afii10073";
                    case EditingLanguage.FAEROESE /* 1080 */:
                        return "afii10074";
                    case EditingLanguage.HINDI /* 1081 */:
                        return "afii10075";
                    case EditingLanguage.MALTESE /* 1082 */:
                        return "afii10076";
                    case EditingLanguage.NORTHERN_SAMI_NORWAY /* 1083 */:
                        return "afii10077";
                    case 1084:
                        return "afii10078";
                    case EditingLanguage.YIDDISH /* 1085 */:
                        return "afii10079";
                    case EditingLanguage.MALAY_MALAYSIA /* 1086 */:
                        return "afii10080";
                    case EditingLanguage.KAZAKH /* 1087 */:
                        return "afii10081";
                    case EditingLanguage.KYRGYZ /* 1088 */:
                        return "afii10082";
                    case EditingLanguage.KISWAHILI /* 1089 */:
                        return "afii10083";
                    case EditingLanguage.TURKMEN /* 1090 */:
                        return "afii10084";
                    case EditingLanguage.UZBEK_LATIN /* 1091 */:
                        return "afii10085";
                    case EditingLanguage.TATAR /* 1092 */:
                        return "afii10086";
                    case EditingLanguage.BANGLA_INDIA /* 1093 */:
                        return "afii10087";
                    case EditingLanguage.PUNJABI_INDIA /* 1094 */:
                        return "afii10088";
                    case EditingLanguage.GUJARATI /* 1095 */:
                        return "afii10089";
                    case EditingLanguage.ORIYA /* 1096 */:
                        return "afii10090";
                    case EditingLanguage.TAMIL /* 1097 */:
                        return "afii10091";
                    case EditingLanguage.TELUGU /* 1098 */:
                        return "afii10092";
                    case EditingLanguage.KANNADA /* 1099 */:
                        return "afii10093";
                    case EditingLanguage.MALAYALAM /* 1100 */:
                        return "afii10094";
                    case EditingLanguage.ASSAMESE /* 1101 */:
                        return "afii10095";
                    case EditingLanguage.MARATHI /* 1102 */:
                        return "afii10096";
                    case EditingLanguage.SANSKRIT /* 1103 */:
                        return "afii10097";
                    case EditingLanguage.TIBETAN_CHINA /* 1105 */:
                        return "afii10071";
                    case EditingLanguage.WELSH /* 1106 */:
                        return "afii10099";
                    case EditingLanguage.KHMER /* 1107 */:
                        return "afii10100";
                    case EditingLanguage.LAO /* 1108 */:
                        return "afii10101";
                    case EditingLanguage.BURMESE /* 1109 */:
                        return "afii10102";
                    case EditingLanguage.GALICIAN /* 1110 */:
                        return "afii10103";
                    case EditingLanguage.KONKANI /* 1111 */:
                        return "afii10104";
                    case EditingLanguage.MANIPURI /* 1112 */:
                        return "afii10105";
                    case EditingLanguage.SINDHI_DEVANAGARIC /* 1113 */:
                        return "afii10106";
                    case EditingLanguage.SYRIAC /* 1114 */:
                        return "afii10107";
                    case EditingLanguage.SINHALESE /* 1115 */:
                        return "afii10108";
                    case EditingLanguage.CHEROKEE /* 1116 */:
                        return "afii10109";
                    case EditingLanguage.AMHARIC /* 1118 */:
                        return "afii10110";
                    case EditingLanguage.TAMAZIGHT /* 1119 */:
                        return "afii10193";
                    case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                        return "Omegacyrillic";
                    case EditingLanguage.NEPALI /* 1121 */:
                        return "omegacyrillic";
                    case EditingLanguage.FRISIAN /* 1122 */:
                        return "Yatcyrillic";
                    case EditingLanguage.PASHTO /* 1123 */:
                        return "afii10194";
                    case EditingLanguage.FILIPINO /* 1124 */:
                        return "Eiotifiedcyrillic";
                    case EditingLanguage.DIVEHI /* 1125 */:
                        return "eiotifiedcyrillic";
                    case EditingLanguage.EDO /* 1126 */:
                        return "Yuslittlecyrillic";
                    case EditingLanguage.FULAH_NIGERIA /* 1127 */:
                        return "yuslittlecyrillic";
                    case EditingLanguage.HAUSA /* 1128 */:
                        return "Yuslittleiotifiedcyrillic";
                    case 1129:
                        return "yuslittleiotifiedcyrillic";
                    case EditingLanguage.YORUBA /* 1130 */:
                        return "Yusbigcyrillic";
                    case EditingLanguage.QUECHUA_BOLIVIA /* 1131 */:
                        return "yusbigcyrillic";
                    case 1132:
                        return "Yusbigiotifiedcyrillic";
                    case EditingLanguage.BASHKIR /* 1133 */:
                        return "yusbigiotifiedcyrillic";
                    case EditingLanguage.LUXEMBOUGISH /* 1134 */:
                        return "Ksicyrillic";
                    case EditingLanguage.GREENLANDIC /* 1135 */:
                        return "ksicyrillic";
                    case EditingLanguage.IGBO /* 1136 */:
                        return "Psicyrillic";
                    case EditingLanguage.KANURI /* 1137 */:
                        return "psicyrillic";
                    case EditingLanguage.OROMO /* 1138 */:
                        return "Fitacyrillic";
                    case EditingLanguage.TIGRIGNA_ETHIOPIA /* 1139 */:
                        return "afii10195";
                    case EditingLanguage.GUARANI /* 1140 */:
                        return "Izhitsacyrillic";
                    case EditingLanguage.HAWAIIAN /* 1141 */:
                        return "afii10196";
                    case EditingLanguage.LATIN /* 1142 */:
                        return "Izhitsadblgravecyrillic";
                    case EditingLanguage.SOMALI /* 1143 */:
                        return "izhitsadblgravecyrillic";
                    case EditingLanguage.f50775YI /* 1144 */:
                        return "Ukcyrillic";
                    case EditingLanguage.PAPIAMENTU /* 1145 */:
                        return "ukcyrillic";
                    case EditingLanguage.MAPUDUNGUN_CHILE /* 1146 */:
                        return "Omegaroundcyrillic";
                    case 1147:
                        return "omegaroundcyrillic";
                    case EditingLanguage.MOHAWK /* 1148 */:
                        return "Omegatitlocyrillic";
                    case 1149:
                        return "omegatitlocyrillic";
                    case EditingLanguage.BRETON /* 1150 */:
                        return "Otcyrillic";
                    case 1151:
                        return "otcyrillic";
                    case 1152:
                        return "Koppacyrillic";
                    case EditingLanguage.MAORI /* 1153 */:
                        return "koppacyrillic";
                    case 1154:
                        return "thousandcyrillic";
                    case EditingLanguage.CORSICAN /* 1155 */:
                        return "titlocyrilliccmb";
                    case EditingLanguage.ALSATIAN /* 1156 */:
                        return "palatalizationcyrilliccmb";
                    case EditingLanguage.SAKHA /* 1157 */:
                        return "dasiapneumatacyrilliccmb";
                    case 1158:
                        return "psilipneumatacyrilliccmb";
                    case 1168:
                        return "Gheupturncyrillic";
                    case EditingLanguage.SCOTTISH_GAELIC /* 1169 */:
                        return "afii10098";
                    case EditingLanguage.CENTRAL_KURDISH_IRAQ /* 1170 */:
                        return "Ghestrokecyrillic";
                    case 1171:
                        return "ghestrokecyrillic";
                    case 1172:
                        return "Ghemiddlehookcyrillic";
                    case 1173:
                        return "ghemiddlehookcyrillic";
                    case 1174:
                        return "Zhedescendercyrillic";
                    case 1175:
                        return "zhedescendercyrillic";
                    case 1176:
                        return "Zedescendercyrillic";
                    case AuthenticationConstants.Broker.BROKER_REQUEST_ID /* 1177 */:
                        return "zedescendercyrillic";
                    case 1178:
                        return "Kadescendercyrillic";
                    case 1179:
                        return "kadescendercyrillic";
                    case 1180:
                        return "Kaverticalstrokecyrillic";
                    case 1181:
                        return "kaverticalstrokecyrillic";
                    case 1182:
                        return "Kastrokecyrillic";
                    case 1183:
                        return "kastrokecyrillic";
                    case 1184:
                        return "Kabashkircyrillic";
                    case 1185:
                        return "kabashkircyrillic";
                    case 1186:
                        return "Endescendercyrillic";
                    case 1187:
                        return "endescendercyrillic";
                    case 1188:
                        return "Enghecyrillic";
                    case 1189:
                        return "enghecyrillic";
                    case 1190:
                        return "Pemiddlehookcyrillic";
                    case 1191:
                        return "pemiddlehookcyrillic";
                    case 1192:
                        return "Haabkhasiancyrillic";
                    case 1193:
                        return "haabkhasiancyrillic";
                    case 1194:
                        return "Esdescendercyrillic";
                    case 1195:
                        return "esdescendercyrillic";
                    case 1196:
                        return "Tedescendercyrillic";
                    case 1197:
                        return "tedescendercyrillic";
                    case 1198:
                        return "Ustraightcyrillic";
                    case 1199:
                        return "ustraightcyrillic";
                    case 1200:
                        return "Ustraightstrokecyrillic";
                    case 1201:
                        return "ustraightstrokecyrillic";
                    case 1202:
                        return "Hadescendercyrillic";
                    case 1203:
                        return "hadescendercyrillic";
                    case 1204:
                        return "Tetsecyrillic";
                    case 1205:
                        return "tetsecyrillic";
                    case 1206:
                        return "Chedescendercyrillic";
                    case 1207:
                        return "chedescendercyrillic";
                    case 1208:
                        return "Cheverticalstrokecyrillic";
                    case 1209:
                        return "cheverticalstrokecyrillic";
                    case 1210:
                        return "Shhacyrillic";
                    case 1211:
                        return "shhacyrillic";
                    case CommonConstant.RETCODE.NEED_UPDATE_STATICKIT /* 1212 */:
                        return "Cheabkhasiancyrillic";
                    case 1213:
                        return "cheabkhasiancyrillic";
                    case 1214:
                        return "Chedescenderabkhasiancyrillic";
                    case 1215:
                        return "chedescenderabkhasiancyrillic";
                    case 1216:
                        return "palochkacyrillic";
                    case 1217:
                        return "Zhebrevecyrillic";
                    case 1218:
                        return "zhebrevecyrillic";
                    case 1219:
                        return "Kahookcyrillic";
                    case 1220:
                        return "kahookcyrillic";
                    case 1223:
                        return "Enhookcyrillic";
                    case 1224:
                        return "enhookcyrillic";
                    case 1227:
                        return "Chekhakassiancyrillic";
                    case 1228:
                        return "chekhakassiancyrillic";
                    case 1232:
                        return "Abrevecyrillic";
                    case 1233:
                        return "abrevecyrillic";
                    case 1234:
                        return "Adieresiscyrillic";
                    case 1235:
                        return "adieresiscyrillic";
                    case 1236:
                        return "Aiecyrillic";
                    case 1237:
                        return "aiecyrillic";
                    case 1238:
                        return "Iebrevecyrillic";
                    case 1239:
                        return "iebrevecyrillic";
                    case 1240:
                        return "Schwacyrillic";
                    case 1241:
                        return "afii10846";
                    case 1242:
                        return "Schwadieresiscyrillic";
                    case 1243:
                        return "schwadieresiscyrillic";
                    case 1244:
                        return "Zhedieresiscyrillic";
                    case 1245:
                        return "zhedieresiscyrillic";
                    case 1246:
                        return "Zedieresiscyrillic";
                    case 1247:
                        return "zedieresiscyrillic";
                    case 1248:
                        return "Dzeabkhasiancyrillic";
                    case 1249:
                        return "dzeabkhasiancyrillic";
                    case 1250:
                        return "Imacroncyrillic";
                    case 1251:
                        return "imacroncyrillic";
                    case 1252:
                        return "Idieresiscyrillic";
                    case 1253:
                        return "idieresiscyrillic";
                    case 1254:
                        return "Odieresiscyrillic";
                    case 1255:
                        return "odieresiscyrillic";
                    case 1256:
                        return "Obarredcyrillic";
                    case 1257:
                        return "obarredcyrillic";
                    case 1258:
                        return "Obarreddieresiscyrillic";
                    case 1259:
                        return "obarreddieresiscyrillic";
                    case 1262:
                        return "Umacroncyrillic";
                    case 1263:
                        return "umacroncyrillic";
                    case 1264:
                        return "Udieresiscyrillic";
                    case 1265:
                        return "udieresiscyrillic";
                    case 1266:
                        return "Uhungarumlautcyrillic";
                    case 1267:
                        return "uhungarumlautcyrillic";
                    case 1268:
                        return "Chedieresiscyrillic";
                    case 1269:
                        return "chedieresiscyrillic";
                    case 1272:
                        return "Yerudieresiscyrillic";
                    case 1273:
                        return "yerudieresiscyrillic";
                    case 1329:
                        return "Aybarmenian";
                    case 1330:
                        return "Benarmenian";
                    case 1331:
                        return "Gimarmenian";
                    case 1332:
                        return "Daarmenian";
                    case 1333:
                        return "Echarmenian";
                    case 1334:
                        return "Zaarmenian";
                    case 1335:
                        return "Eharmenian";
                    case 1336:
                        return "Etarmenian";
                    case 1337:
                        return "Toarmenian";
                    case 1338:
                        return "Zhearmenian";
                    case 1339:
                        return "Iniarmenian";
                    case 1340:
                        return "Liwnarmenian";
                    case 1341:
                        return "Xeharmenian";
                    case 1342:
                        return "Caarmenian";
                    case 1343:
                        return "Kenarmenian";
                    case 1344:
                        return "Hoarmenian";
                    case 1345:
                        return "Jaarmenian";
                    case 1346:
                        return "Ghadarmenian";
                    case 1347:
                        return "Cheharmenian";
                    case 1348:
                        return "Menarmenian";
                    case 1349:
                        return "Yiarmenian";
                    case 1350:
                        return "Nowarmenian";
                    case 1351:
                        return "Shaarmenian";
                    case 1352:
                        return "Voarmenian";
                    case 1353:
                        return "Chaarmenian";
                    case 1354:
                        return "Peharmenian";
                    case 1355:
                        return "Jheharmenian";
                    case 1356:
                        return "Raarmenian";
                    case 1357:
                        return "Seharmenian";
                    case 1358:
                        return "Vewarmenian";
                    case 1359:
                        return "Tiwnarmenian";
                    case 1360:
                        return "Reharmenian";
                    case 1361:
                        return "Coarmenian";
                    case 1362:
                        return "Yiwnarmenian";
                    case 1363:
                        return "Piwrarmenian";
                    case 1364:
                        return "Keharmenian";
                    case 1365:
                        return "Oharmenian";
                    case 1366:
                        return "Feharmenian";
                    case 1369:
                        return "ringhalfleftarmenian";
                    case 1370:
                        return "apostrophearmenian";
                    case 1371:
                        return "emphasismarkarmenian";
                    case 1372:
                        return "exclamarmenian";
                    case 1373:
                        return "commaarmenian";
                    case 1374:
                        return "questionarmenian";
                    case 1375:
                        return "abbreviationmarkarmenian";
                    case 1377:
                        return "aybarmenian";
                    case 1378:
                        return "benarmenian";
                    case 1379:
                        return "gimarmenian";
                    case 1380:
                        return "daarmenian";
                    case 1381:
                        return "echarmenian";
                    case 1382:
                        return "zaarmenian";
                    case 1383:
                        return "eharmenian";
                    case 1384:
                        return "etarmenian";
                    case 1385:
                        return "toarmenian";
                    case 1386:
                        return "zhearmenian";
                    case 1387:
                        return "iniarmenian";
                    case 1388:
                        return "liwnarmenian";
                    case 1389:
                        return "xeharmenian";
                    case 1390:
                        return "caarmenian";
                    case 1391:
                        return "kenarmenian";
                    case 1392:
                        return "hoarmenian";
                    case 1393:
                        return "jaarmenian";
                    case 1394:
                        return "ghadarmenian";
                    case 1395:
                        return "cheharmenian";
                    case 1396:
                        return "menarmenian";
                    case 1397:
                        return "yiarmenian";
                    case 1398:
                        return "nowarmenian";
                    case 1399:
                        return "shaarmenian";
                    case 1400:
                        return "voarmenian";
                    case 1401:
                        return "chaarmenian";
                    case 1402:
                        return "peharmenian";
                    case 1403:
                        return "jheharmenian";
                    case 1404:
                        return "raarmenian";
                    case 1405:
                        return "seharmenian";
                    case 1406:
                        return "vewarmenian";
                    case 1407:
                        return "tiwnarmenian";
                    case 1408:
                        return "reharmenian";
                    case 1409:
                        return "coarmenian";
                    case 1410:
                        return "yiwnarmenian";
                    case 1411:
                        return "piwrarmenian";
                    case 1412:
                        return "keharmenian";
                    case 1413:
                        return "oharmenian";
                    case 1414:
                        return "feharmenian";
                    case 1415:
                        return "echyiwnarmenian";
                    case 1417:
                        return "periodarmenian";
                    case 1425:
                        return "etnahtafoukhhebrew";
                    case 1426:
                        return "segoltahebrew";
                    case 1427:
                        return "shalshelethebrew";
                    case 1428:
                        return "zaqefqatanhebrew";
                    case 1429:
                        return "zaqefgadolhebrew";
                    case 1430:
                        return "tipehahebrew";
                    case 1431:
                        return "reviahebrew";
                    case 1432:
                        return "zarqahebrew";
                    case 1433:
                        return "pashtahebrew";
                    case 1434:
                        return "yetivhebrew";
                    case 1435:
                        return "tevirhebrew";
                    case 1436:
                        return "gereshaccenthebrew";
                    case 1437:
                        return "gereshmuqdamhebrew";
                    case 1438:
                        return "gershayimaccenthebrew";
                    case 1439:
                        return "qarneyparahebrew";
                    case 1440:
                        return "telishagedolahebrew";
                    case 1441:
                        return "pazerhebrew";
                    case 1443:
                        return "munahhebrew";
                    case 1444:
                        return "mahapakhhebrew";
                    case 1445:
                        return "merkhahebrew";
                    case 1446:
                        return "merkhakefulahebrew";
                    case 1447:
                        return "dargahebrew";
                    case 1448:
                        return "qadmahebrew";
                    case 1449:
                        return "telishaqetanahebrew";
                    case 1450:
                        return "yerahbenyomohebrew";
                    case 1451:
                        return "olehebrew";
                    case 1452:
                        return "iluyhebrew";
                    case 1453:
                        return "dehihebrew";
                    case 1454:
                        return "zinorhebrew";
                    case 1455:
                        return "masoracirclehebrew";
                    case 1456:
                        return "afii57799";
                    case 1457:
                        return "afii57801";
                    case 1458:
                        return "afii57800";
                    case 1459:
                        return "afii57802";
                    case 1460:
                        return "afii57793";
                    case 1461:
                        return "afii57794";
                    case 1462:
                        return "afii57795";
                    case 1463:
                        return "afii57798";
                    case 1464:
                        return "afii57797";
                    case 1465:
                        return "afii57806";
                    case 1467:
                        return "afii57796";
                    case 1468:
                        return "afii57807";
                    case 1469:
                        return "afii57839";
                    case 1470:
                        return "afii57645";
                    case 1471:
                        return "afii57841";
                    case 1472:
                        return "afii57842";
                    case 1473:
                        return "afii57804";
                    case 1474:
                        return "afii57803";
                    case 1475:
                        return "afii57658";
                    case 1476:
                        return "upperdothebrew";
                    case 1488:
                        return "afii57664";
                    case 1489:
                        return "afii57665";
                    case 1490:
                        return "afii57666";
                    case 1491:
                        return "afii57667";
                    case 1492:
                        return "afii57668";
                    case 1493:
                        return "afii57669";
                    case 1494:
                        return "afii57670";
                    case 1495:
                        return "afii57671";
                    case 1496:
                        return "afii57672";
                    case 1497:
                        return "afii57673";
                    case 1498:
                        return "afii57674";
                    case 1499:
                        return "afii57675";
                    case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                        return "afii57676";
                    case 1501:
                        return "afii57677";
                    case 1502:
                        return "afii57678";
                    case 1503:
                        return "afii57679";
                    case 1504:
                        return "afii57680";
                    case 1505:
                        return "afii57681";
                    case 1506:
                        return "afii57682";
                    case 1507:
                        return "afii57683";
                    case 1508:
                        return "afii57684";
                    case 1509:
                        return "afii57685";
                    case 1510:
                        return "afii57686";
                    case 1511:
                        return "afii57687";
                    case 1512:
                        return "afii57688";
                    case 1513:
                        return "afii57689";
                    case 1514:
                        return "afii57690";
                    case 1520:
                        return "afii57716";
                    case 1521:
                        return "afii57717";
                    case 1522:
                        return "afii57718";
                    case 1523:
                        return "gereshhebrew";
                    case 1524:
                        return "gershayimhebrew";
                    case 1548:
                        return "afii57388";
                    case 1563:
                        return "afii57403";
                    case 1567:
                        return "afii57407";
                    case 1569:
                        return "afii57409";
                    case 1570:
                        return "afii57410";
                    case 1571:
                        return "afii57411";
                    case 1572:
                        return "afii57412";
                    case 1573:
                        return "afii57413";
                    case 1574:
                        return "afii57414";
                    case 1575:
                        return "afii57415";
                    case 1576:
                        return "afii57416";
                    case 1577:
                        return "afii57417";
                    case 1578:
                        return "afii57418";
                    case 1579:
                        return "afii57419";
                    case 1580:
                        return "afii57420";
                    case 1581:
                        return "afii57421";
                    case 1582:
                        return "afii57422";
                    case 1583:
                        return "afii57423";
                    case 1584:
                        return "afii57424";
                    case 1585:
                        return "afii57425";
                    case 1586:
                        return "afii57426";
                    case 1587:
                        return "afii57427";
                    case 1588:
                        return "afii57428";
                    case 1589:
                        return "afii57429";
                    case 1590:
                        return "afii57430";
                    case 1591:
                        return "afii57431";
                    case 1592:
                        return "afii57432";
                    case 1593:
                        return "afii57433";
                    case 1594:
                        return "afii57434";
                    case 1600:
                        return "afii57440";
                    case 1601:
                        return "afii57441";
                    case 1602:
                        return "afii57442";
                    case 1603:
                        return "afii57443";
                    case 1604:
                        return "afii57444";
                    case 1605:
                        return "afii57445";
                    case 1606:
                        return "afii57446";
                    case 1607:
                        return "afii57470";
                    case 1608:
                        return "afii57448";
                    case 1609:
                        return "afii57449";
                    case 1610:
                        return "afii57450";
                    case 1611:
                        return "afii57451";
                    case 1612:
                        return "afii57452";
                    case 1613:
                        return "afii57453";
                    case 1614:
                        return "afii57454";
                    case 1615:
                        return "afii57455";
                    case 1616:
                        return "afii57456";
                    case 1617:
                        return "afii57457";
                    case 1618:
                        return "afii57458";
                    case 1632:
                        return "afii57392";
                    case 1633:
                        return "afii57393";
                    case 1634:
                        return "afii57394";
                    case 1635:
                        return "afii57395";
                    case 1636:
                        return "afii57396";
                    case 1637:
                        return "afii57397";
                    case 1638:
                        return "afii57398";
                    case 1639:
                        return "afii57399";
                    case 1640:
                        return "afii57400";
                    case 1641:
                        return "afii57401";
                    case 1642:
                        return "afii57381";
                    case 1643:
                        return "decimalseparatorarabic";
                    case 1644:
                        return "thousandsseparatorarabic";
                    case 1645:
                        return "afii63167";
                    case 1657:
                        return "afii57511";
                    case 1662:
                        return "afii57506";
                    case 1670:
                        return "afii57507";
                    case 1672:
                        return "afii57512";
                    case 1681:
                        return "afii57513";
                    case 1688:
                        return "afii57508";
                    case 1700:
                        return "afii57505";
                    case 1711:
                        return "afii57509";
                    case 1722:
                        return "afii57514";
                    case 1729:
                        return "haaltonearabic";
                    case 1745:
                        return "yehthreedotsbelowarabic";
                    case 1746:
                        return "afii57519";
                    case 1749:
                        return "afii57534";
                    case 1776:
                        return "zeropersian";
                    case 1777:
                        return "onepersian";
                    case 1778:
                        return "twopersian";
                    case 1779:
                        return "threepersian";
                    case 1780:
                        return "fourpersian";
                    case 1781:
                        return "fivepersian";
                    case 1782:
                        return "sixpersian";
                    case 1783:
                        return "sevenpersian";
                    case 1784:
                        return "eightpersian";
                    case 1785:
                        return "ninepersian";
                    case 2305:
                        return "candrabindudeva";
                    case 2306:
                        return "anusvaradeva";
                    case 2307:
                        return "visargadeva";
                    case 2309:
                        return "adeva";
                    case 2310:
                        return "aadeva";
                    case 2311:
                        return "ideva";
                    case 2312:
                        return "iideva";
                    case 2313:
                        return "udeva";
                    case 2314:
                        return "uudeva";
                    case 2315:
                        return "rvocalicdeva";
                    case 2316:
                        return "lvocalicdeva";
                    case 2317:
                        return "ecandradeva";
                    case 2318:
                        return "eshortdeva";
                    case 2319:
                        return "edeva";
                    case 2320:
                        return "aideva";
                    case 2321:
                        return "ocandradeva";
                    case 2322:
                        return "oshortdeva";
                    case 2323:
                        return "odeva";
                    case 2324:
                        return "audeva";
                    case 2325:
                        return "kadeva";
                    case 2326:
                        return "khadeva";
                    case 2327:
                        return "gadeva";
                    case 2328:
                        return "ghadeva";
                    case 2329:
                        return "ngadeva";
                    case 2330:
                        return "cadeva";
                    case 2331:
                        return "chadeva";
                    case 2332:
                        return "jadeva";
                    case 2333:
                        return "jhadeva";
                    case 2334:
                        return "nyadeva";
                    case 2335:
                        return "ttadeva";
                    case 2336:
                        return "tthadeva";
                    case 2337:
                        return "ddadeva";
                    case 2338:
                        return "ddhadeva";
                    case 2339:
                        return "nnadeva";
                    case 2340:
                        return "tadeva";
                    case 2341:
                        return "thadeva";
                    case 2342:
                        return "dadeva";
                    case 2343:
                        return "dhadeva";
                    case 2344:
                        return "nadeva";
                    case 2345:
                        return "nnnadeva";
                    case 2346:
                        return "padeva";
                    case 2347:
                        return "phadeva";
                    case 2348:
                        return "badeva";
                    case 2349:
                        return "bhadeva";
                    case 2350:
                        return "madeva";
                    case 2351:
                        return "yadeva";
                    case 2352:
                        return "radeva";
                    case 2353:
                        return "rradeva";
                    case 2354:
                        return "ladeva";
                    case 2355:
                        return "lladeva";
                    case 2356:
                        return "llladeva";
                    case 2357:
                        return "vadeva";
                    case 2358:
                        return "shadeva";
                    case 2359:
                        return "ssadeva";
                    case 2360:
                        return "sadeva";
                    case 2361:
                        return "hadeva";
                    case 2364:
                        return "nuktadeva";
                    case 2365:
                        return "avagrahadeva";
                    case 2366:
                        return "aavowelsigndeva";
                    case 2367:
                        return "ivowelsigndeva";
                    case 2368:
                        return "iivowelsigndeva";
                    case 2369:
                        return "uvowelsigndeva";
                    case 2370:
                        return "uuvowelsigndeva";
                    case 2371:
                        return "rvocalicvowelsigndeva";
                    case 2372:
                        return "rrvocalicvowelsigndeva";
                    case 2373:
                        return "ecandravowelsigndeva";
                    case 2374:
                        return "eshortvowelsigndeva";
                    case 2375:
                        return "evowelsigndeva";
                    case 2376:
                        return "aivowelsigndeva";
                    case 2377:
                        return "ocandravowelsigndeva";
                    case 2378:
                        return "oshortvowelsigndeva";
                    case 2379:
                        return "ovowelsigndeva";
                    case 2380:
                        return "auvowelsigndeva";
                    case 2381:
                        return "viramadeva";
                    case 2384:
                        return "omdeva";
                    case 2385:
                        return "udattadeva";
                    case 2386:
                        return "anudattadeva";
                    case 2387:
                        return "gravedeva";
                    case 2388:
                        return "acutedeva";
                    case 2392:
                        return "qadeva";
                    case 2393:
                        return "khhadeva";
                    case 2394:
                        return "ghhadeva";
                    case 2395:
                        return "zadeva";
                    case 2396:
                        return "dddhadeva";
                    case 2397:
                        return "rhadeva";
                    case 2398:
                        return "fadeva";
                    case 2399:
                        return "yyadeva";
                    case 2400:
                        return "rrvocalicdeva";
                    case 2401:
                        return "llvocalicdeva";
                    case 2402:
                        return "lvocalicvowelsigndeva";
                    case 2403:
                        return "llvocalicvowelsigndeva";
                    case 2404:
                        return "danda";
                    case 2405:
                        return "dbldanda";
                    case 2406:
                        return "zerodeva";
                    case 2407:
                        return "onedeva";
                    case 2408:
                        return "twodeva";
                    case 2409:
                        return "threedeva";
                    case 2410:
                        return "fourdeva";
                    case 2411:
                        return "fivedeva";
                    case 2412:
                        return "sixdeva";
                    case 2413:
                        return "sevendeva";
                    case 2414:
                        return "eightdeva";
                    case 2415:
                        return "ninedeva";
                    case 2416:
                        return "abbreviationsigndeva";
                    case 2433:
                        return "candrabindubengali";
                    case 2434:
                        return "anusvarabengali";
                    case 2435:
                        return "visargabengali";
                    case 2437:
                        return "abengali";
                    case 2438:
                        return "aabengali";
                    case 2439:
                        return "ibengali";
                    case 2440:
                        return "iibengali";
                    case 2441:
                        return "ubengali";
                    case 2442:
                        return "uubengali";
                    case 2443:
                        return "rvocalicbengali";
                    case 2444:
                        return "lvocalicbengali";
                    case 2447:
                        return "ebengali";
                    case 2448:
                        return "aibengali";
                    case 2451:
                        return "obengali";
                    case 2452:
                        return "aubengali";
                    case 2453:
                        return "kabengali";
                    case 2454:
                        return "khabengali";
                    case 2455:
                        return "gabengali";
                    case 2456:
                        return "ghabengali";
                    case 2457:
                        return "ngabengali";
                    case 2458:
                        return "cabengali";
                    case 2459:
                        return "chabengali";
                    case 2460:
                        return "jabengali";
                    case 2461:
                        return "jhabengali";
                    case 2462:
                        return "nyabengali";
                    case 2463:
                        return "ttabengali";
                    case 2464:
                        return "tthabengali";
                    case 2465:
                        return "ddabengali";
                    case 2466:
                        return "ddhabengali";
                    case 2467:
                        return "nnabengali";
                    case 2468:
                        return "tabengali";
                    case 2469:
                        return "thabengali";
                    case 2470:
                        return "dabengali";
                    case 2471:
                        return "dhabengali";
                    case 2472:
                        return "nabengali";
                    case 2474:
                        return "pabengali";
                    case 2475:
                        return "phabengali";
                    case 2476:
                        return "babengali";
                    case 2477:
                        return "bhabengali";
                    case 2478:
                        return "mabengali";
                    case 2479:
                        return "yabengali";
                    case 2480:
                        return "rabengali";
                    case 2482:
                        return "labengali";
                    case 2486:
                        return "shabengali";
                    case 2487:
                        return "ssabengali";
                    case 2488:
                        return "sabengali";
                    case 2489:
                        return "habengali";
                    case 2492:
                        return "nuktabengali";
                    case 2494:
                        return "aavowelsignbengali";
                    case 2495:
                        return "ivowelsignbengali";
                    case 2496:
                        return "iivowelsignbengali";
                    case 2497:
                        return "uvowelsignbengali";
                    case 2498:
                        return "uuvowelsignbengali";
                    case 2499:
                        return "rvocalicvowelsignbengali";
                    case 2500:
                        return "rrvocalicvowelsignbengali";
                    case 2503:
                        return "evowelsignbengali";
                    case 2504:
                        return "aivowelsignbengali";
                    case 2507:
                        return "ovowelsignbengali";
                    case 2508:
                        return "auvowelsignbengali";
                    case 2509:
                        return "viramabengali";
                    case 2519:
                        return "aulengthmarkbengali";
                    case 2524:
                        return "rrabengali";
                    case 2525:
                        return "rhabengali";
                    case 2527:
                        return "yyabengali";
                    case 2528:
                        return "rrvocalicbengali";
                    case 2529:
                        return "llvocalicbengali";
                    case 2530:
                        return "lvocalicvowelsignbengali";
                    case 2531:
                        return "llvocalicvowelsignbengali";
                    case 2534:
                        return "zerobengali";
                    case 2535:
                        return "onebengali";
                    case 2536:
                        return "twobengali";
                    case 2537:
                        return "threebengali";
                    case 2538:
                        return "fourbengali";
                    case 2539:
                        return "fivebengali";
                    case 2540:
                        return "sixbengali";
                    case 2541:
                        return "sevenbengali";
                    case 2542:
                        return "eightbengali";
                    case 2543:
                        return "ninebengali";
                    case 2544:
                        return "ramiddlediagonalbengali";
                    case 2545:
                        return "ralowerdiagonalbengali";
                    case 2546:
                        return "rupeemarkbengali";
                    case 2547:
                        return "rupeesignbengali";
                    case 2548:
                        return "onenumeratorbengali";
                    case 2549:
                        return "twonumeratorbengali";
                    case 2550:
                        return "threenumeratorbengali";
                    case 2551:
                        return "fournumeratorbengali";
                    case 2552:
                        return "denominatorminusonenumeratorbengali";
                    case 2553:
                        return "sixteencurrencydenominatorbengali";
                    case 2554:
                        return "issharbengali";
                    case 2562:
                        return "bindigurmukhi";
                    case 2565:
                        return "agurmukhi";
                    case 2566:
                        return "aagurmukhi";
                    case 2567:
                        return "igurmukhi";
                    case 2568:
                        return "iigurmukhi";
                    case 2569:
                        return "ugurmukhi";
                    case 2570:
                        return "uugurmukhi";
                    case 2575:
                        return "eegurmukhi";
                    case 2576:
                        return "aigurmukhi";
                    case 2579:
                        return "oogurmukhi";
                    case 2580:
                        return "augurmukhi";
                    case 2581:
                        return "kagurmukhi";
                    case 2582:
                        return "khagurmukhi";
                    case 2583:
                        return "gagurmukhi";
                    case 2584:
                        return "ghagurmukhi";
                    case 2585:
                        return "ngagurmukhi";
                    case 2586:
                        return "cagurmukhi";
                    case 2587:
                        return "chagurmukhi";
                    case 2588:
                        return "jagurmukhi";
                    case 2589:
                        return "jhagurmukhi";
                    case 2590:
                        return "nyagurmukhi";
                    case 2591:
                        return "ttagurmukhi";
                    case 2592:
                        return "tthagurmukhi";
                    case 2593:
                        return "ddagurmukhi";
                    case 2594:
                        return "ddhagurmukhi";
                    case 2595:
                        return "nnagurmukhi";
                    case 2596:
                        return "tagurmukhi";
                    case 2597:
                        return "thagurmukhi";
                    case 2598:
                        return "dagurmukhi";
                    case 2599:
                        return "dhagurmukhi";
                    case 2600:
                        return "nagurmukhi";
                    case 2602:
                        return "pagurmukhi";
                    case 2603:
                        return "phagurmukhi";
                    case 2604:
                        return "bagurmukhi";
                    case 2605:
                        return "bhagurmukhi";
                    case 2606:
                        return "magurmukhi";
                    case 2607:
                        return "yagurmukhi";
                    case 2608:
                        return "ragurmukhi";
                    case 2610:
                        return "lagurmukhi";
                    case 2613:
                        return "vagurmukhi";
                    case 2614:
                        return "shagurmukhi";
                    case 2616:
                        return "sagurmukhi";
                    case 2617:
                        return "hagurmukhi";
                    case 2620:
                        return "nuktagurmukhi";
                    case 2622:
                        return "aamatragurmukhi";
                    case 2623:
                        return "imatragurmukhi";
                    case 2624:
                        return "iimatragurmukhi";
                    case 2625:
                        return "umatragurmukhi";
                    case 2626:
                        return "uumatragurmukhi";
                    case 2631:
                        return "eematragurmukhi";
                    case 2632:
                        return "aimatragurmukhi";
                    case 2635:
                        return "oomatragurmukhi";
                    case 2636:
                        return "aumatragurmukhi";
                    case 2637:
                        return "halantgurmukhi";
                    case 2649:
                        return "khhagurmukhi";
                    case 2650:
                        return "ghhagurmukhi";
                    case 2651:
                        return "zagurmukhi";
                    case 2652:
                        return "rragurmukhi";
                    case 2654:
                        return "fagurmukhi";
                    case 2662:
                        return "zerogurmukhi";
                    case 2663:
                        return "onegurmukhi";
                    case 2664:
                        return "twogurmukhi";
                    case 2665:
                        return "threegurmukhi";
                    case 2666:
                        return "fourgurmukhi";
                    case 2667:
                        return "fivegurmukhi";
                    case 2668:
                        return "sixgurmukhi";
                    case 2669:
                        return "sevengurmukhi";
                    case 2670:
                        return "eightgurmukhi";
                    case 2671:
                        return "ninegurmukhi";
                    case 2672:
                        return "tippigurmukhi";
                    case 2673:
                        return "addakgurmukhi";
                    case 2674:
                        return "irigurmukhi";
                    case 2675:
                        return "uragurmukhi";
                    case 2676:
                        return "ekonkargurmukhi";
                    case 2689:
                        return "candrabindugujarati";
                    case 2690:
                        return "anusvaragujarati";
                    case 2691:
                        return "visargagujarati";
                    case 2693:
                        return "agujarati";
                    case 2694:
                        return "aagujarati";
                    case 2695:
                        return "igujarati";
                    case 2696:
                        return "iigujarati";
                    case 2697:
                        return "ugujarati";
                    case 2698:
                        return "uugujarati";
                    case 2699:
                        return "rvocalicgujarati";
                    case 2701:
                        return "ecandragujarati";
                    case 2703:
                        return "egujarati";
                    case 2704:
                        return "aigujarati";
                    case 2705:
                        return "ocandragujarati";
                    case 2707:
                        return "ogujarati";
                    case 2708:
                        return "augujarati";
                    case 2709:
                        return "kagujarati";
                    case 2710:
                        return "khagujarati";
                    case 2711:
                        return "gagujarati";
                    case 2712:
                        return "ghagujarati";
                    case 2713:
                        return "ngagujarati";
                    case 2714:
                        return "cagujarati";
                    case 2715:
                        return "chagujarati";
                    case 2716:
                        return "jagujarati";
                    case 2717:
                        return "jhagujarati";
                    case 2718:
                        return "nyagujarati";
                    case 2719:
                        return "ttagujarati";
                    case 2720:
                        return "tthagujarati";
                    case 2721:
                        return "ddagujarati";
                    case 2722:
                        return "ddhagujarati";
                    case 2723:
                        return "nnagujarati";
                    case 2724:
                        return "tagujarati";
                    case 2725:
                        return "thagujarati";
                    case 2726:
                        return "dagujarati";
                    case 2727:
                        return "dhagujarati";
                    case 2728:
                        return "nagujarati";
                    case 2730:
                        return "pagujarati";
                    case 2731:
                        return "phagujarati";
                    case 2732:
                        return "bagujarati";
                    case 2733:
                        return "bhagujarati";
                    case 2734:
                        return "magujarati";
                    case 2735:
                        return "yagujarati";
                    case 2736:
                        return "ragujarati";
                    case 2738:
                        return "lagujarati";
                    case 2739:
                        return "llagujarati";
                    case 2741:
                        return "vagujarati";
                    case 2742:
                        return "shagujarati";
                    case 2743:
                        return "ssagujarati";
                    case 2744:
                        return "sagujarati";
                    case 2745:
                        return "hagujarati";
                    case 2748:
                        return "nuktagujarati";
                    case 2750:
                        return "aavowelsigngujarati";
                    case 2751:
                        return "ivowelsigngujarati";
                    case 2752:
                        return "iivowelsigngujarati";
                    case 2753:
                        return "uvowelsigngujarati";
                    case 2754:
                        return "uuvowelsigngujarati";
                    case 2755:
                        return "rvocalicvowelsigngujarati";
                    case 2756:
                        return "rrvocalicvowelsigngujarati";
                    case 2757:
                        return "ecandravowelsigngujarati";
                    case 2759:
                        return "evowelsigngujarati";
                    case 2760:
                        return "aivowelsigngujarati";
                    case 2761:
                        return "ocandravowelsigngujarati";
                    case 2763:
                        return "ovowelsigngujarati";
                    case 2764:
                        return "auvowelsigngujarati";
                    case 2765:
                        return "viramagujarati";
                    case 2768:
                        return "omgujarati";
                    case 2784:
                        return "rrvocalicgujarati";
                    case 2790:
                        return "zerogujarati";
                    case 2791:
                        return "onegujarati";
                    case 2792:
                        return "twogujarati";
                    case 2793:
                        return "threegujarati";
                    case 2794:
                        return "fourgujarati";
                    case 2795:
                        return "fivegujarati";
                    case 2796:
                        return "sixgujarati";
                    case 2797:
                        return "sevengujarati";
                    case 2798:
                        return "eightgujarati";
                    case 2799:
                        return "ninegujarati";
                    case 3585:
                        return "kokaithai";
                    case 3586:
                        return "khokhaithai";
                    case 3587:
                        return "khokhuatthai";
                    case 3588:
                        return "khokhwaithai";
                    case 3589:
                        return "khokhonthai";
                    case 3590:
                        return "khorakhangthai";
                    case 3591:
                        return "ngonguthai";
                    case 3592:
                        return "chochanthai";
                    case 3593:
                        return "chochingthai";
                    case 3594:
                        return "chochangthai";
                    case 3595:
                        return "sosothai";
                    case 3596:
                        return "chochoethai";
                    case 3597:
                        return "yoyingthai";
                    case 3598:
                        return "dochadathai";
                    case 3599:
                        return "topatakthai";
                    case 3600:
                        return "thothanthai";
                    case 3601:
                        return "thonangmonthothai";
                    case 3602:
                        return "thophuthaothai";
                    case 3603:
                        return "nonenthai";
                    case 3604:
                        return "dodekthai";
                    case 3605:
                        return "totaothai";
                    case 3606:
                        return "thothungthai";
                    case 3607:
                        return "thothahanthai";
                    case 3608:
                        return "thothongthai";
                    case 3609:
                        return "nonuthai";
                    case 3610:
                        return "bobaimaithai";
                    case 3611:
                        return "poplathai";
                    case 3612:
                        return "phophungthai";
                    case 3613:
                        return "fofathai";
                    case 3614:
                        return "phophanthai";
                    case 3615:
                        return "fofanthai";
                    case 3616:
                        return "phosamphaothai";
                    case 3617:
                        return "momathai";
                    case 3618:
                        return "yoyakthai";
                    case 3619:
                        return "roruathai";
                    case 3620:
                        return "ruthai";
                    case 3621:
                        return "lolingthai";
                    case 3622:
                        return "luthai";
                    case 3623:
                        return "wowaenthai";
                    case 3624:
                        return "sosalathai";
                    case 3625:
                        return "sorusithai";
                    case 3626:
                        return "sosuathai";
                    case 3627:
                        return "hohipthai";
                    case 3628:
                        return "lochulathai";
                    case 3629:
                        return "oangthai";
                    case 3630:
                        return "honokhukthai";
                    case 3631:
                        return "paiyannoithai";
                    case 3632:
                        return "saraathai";
                    case 3633:
                        return "maihanakatthai";
                    case 3634:
                        return "saraaathai";
                    case 3635:
                        return "saraamthai";
                    case 3636:
                        return "saraithai";
                    case 3637:
                        return "saraiithai";
                    case 3638:
                        return "sarauethai";
                    case 3639:
                        return "saraueethai";
                    case 3640:
                        return "sarauthai";
                    case 3641:
                        return "sarauuthai";
                    case 3642:
                        return "phinthuthai";
                    case 3647:
                        return "bahtthai";
                    case 3648:
                        return "saraethai";
                    case 3649:
                        return "saraaethai";
                    case 3650:
                        return "saraothai";
                    case 3651:
                        return "saraaimaimuanthai";
                    case 3652:
                        return "saraaimaimalaithai";
                    case 3653:
                        return "lakkhangyaothai";
                    case 3654:
                        return "maiyamokthai";
                    case 3655:
                        return "maitaikhuthai";
                    case 3656:
                        return "maiekthai";
                    case 3657:
                        return "maithothai";
                    case 3658:
                        return "maitrithai";
                    case 3659:
                        return "maichattawathai";
                    case 3660:
                        return "thanthakhatthai";
                    case 3661:
                        return "nikhahitthai";
                    case 3662:
                        return "yamakkanthai";
                    case 3663:
                        return "fongmanthai";
                    case 3664:
                        return "zerothai";
                    case 3665:
                        return "onethai";
                    case 3666:
                        return "twothai";
                    case 3667:
                        return "threethai";
                    case 3668:
                        return "fourthai";
                    case 3669:
                        return "fivethai";
                    case 3670:
                        return "sixthai";
                    case 3671:
                        return "seventhai";
                    case 3672:
                        return "eightthai";
                    case 3673:
                        return "ninethai";
                    case 3674:
                        return "angkhankhuthai";
                    case 3675:
                        return "khomutthai";
                    case 7680:
                        return "Aringbelow";
                    case 7681:
                        return "aringbelow";
                    case 7682:
                        return "Bdotaccent";
                    case 7683:
                        return "bdotaccent";
                    case 7684:
                        return "Bdotbelow";
                    case 7685:
                        return "bdotbelow";
                    case 7686:
                        return "Blinebelow";
                    case 7687:
                        return "blinebelow";
                    case 7688:
                        return "Ccedillaacute";
                    case 7689:
                        return "ccedillaacute";
                    case 7690:
                        return "Ddotaccent";
                    case 7691:
                        return "ddotaccent";
                    case 7692:
                        return "Ddotbelow";
                    case 7693:
                        return "ddotbelow";
                    case 7694:
                        return "Dlinebelow";
                    case 7695:
                        return "dlinebelow";
                    case 7696:
                        return "Dcedilla";
                    case 7697:
                        return "dcedilla";
                    case 7698:
                        return "Dcircumflexbelow";
                    case 7699:
                        return "dcircumflexbelow";
                    case 7700:
                        return "Emacrongrave";
                    case 7701:
                        return "emacrongrave";
                    case 7702:
                        return "Emacronacute";
                    case 7703:
                        return "emacronacute";
                    case 7704:
                        return "Ecircumflexbelow";
                    case 7705:
                        return "ecircumflexbelow";
                    case 7706:
                        return "Etildebelow";
                    case 7707:
                        return "etildebelow";
                    case 7708:
                        return "Ecedillabreve";
                    case 7709:
                        return "ecedillabreve";
                    case 7710:
                        return "Fdotaccent";
                    case 7711:
                        return "fdotaccent";
                    case 7712:
                        return "Gmacron";
                    case 7713:
                        return "gmacron";
                    case 7714:
                        return "Hdotaccent";
                    case 7715:
                        return "hdotaccent";
                    case 7716:
                        return "Hdotbelow";
                    case 7717:
                        return "hdotbelow";
                    case 7718:
                        return "Hdieresis";
                    case 7719:
                        return "hdieresis";
                    case 7720:
                        return "Hcedilla";
                    case 7721:
                        return "hcedilla";
                    case 7722:
                        return "Hbrevebelow";
                    case 7723:
                        return "hbrevebelow";
                    case 7724:
                        return "Itildebelow";
                    case 7725:
                        return "itildebelow";
                    case 7726:
                        return "Idieresisacute";
                    case 7727:
                        return "idieresisacute";
                    case 7728:
                        return "Kacute";
                    case 7729:
                        return "kacute";
                    case 7730:
                        return "Kdotbelow";
                    case 7731:
                        return "kdotbelow";
                    case 7732:
                        return "Klinebelow";
                    case 7733:
                        return "klinebelow";
                    case 7734:
                        return "Ldotbelow";
                    case 7735:
                        return "ldotbelow";
                    case 7736:
                        return "Ldotbelowmacron";
                    case 7737:
                        return "ldotbelowmacron";
                    case 7738:
                        return "Llinebelow";
                    case 7739:
                        return "llinebelow";
                    case 7740:
                        return "Lcircumflexbelow";
                    case 7741:
                        return "lcircumflexbelow";
                    case 7742:
                        return "Macute";
                    case 7743:
                        return "macute";
                    case 7744:
                        return "Mdotaccent";
                    case 7745:
                        return "mdotaccent";
                    case 7746:
                        return "Mdotbelow";
                    case 7747:
                        return "mdotbelow";
                    case 7748:
                        return "Ndotaccent";
                    case 7749:
                        return "ndotaccent";
                    case 7750:
                        return "Ndotbelow";
                    case 7751:
                        return "ndotbelow";
                    case 7752:
                        return "Nlinebelow";
                    case 7753:
                        return "nlinebelow";
                    case 7754:
                        return "Ncircumflexbelow";
                    case 7755:
                        return "ncircumflexbelow";
                    case 7756:
                        return "Otildeacute";
                    case 7757:
                        return "otildeacute";
                    case 7758:
                        return "Otildedieresis";
                    case 7759:
                        return "otildedieresis";
                    case 7760:
                        return "Omacrongrave";
                    case 7761:
                        return "omacrongrave";
                    case 7762:
                        return "Omacronacute";
                    case 7763:
                        return "omacronacute";
                    case 7764:
                        return "Pacute";
                    case 7765:
                        return "pacute";
                    case 7766:
                        return "Pdotaccent";
                    case 7767:
                        return "pdotaccent";
                    case 7768:
                        return "Rdotaccent";
                    case 7769:
                        return "rdotaccent";
                    case 7770:
                        return "Rdotbelow";
                    case 7771:
                        return "rdotbelow";
                    case 7772:
                        return "Rdotbelowmacron";
                    case 7773:
                        return "rdotbelowmacron";
                    case 7774:
                        return "Rlinebelow";
                    case 7775:
                        return "rlinebelow";
                    case 7776:
                        return "Sdotaccent";
                    case 7777:
                        return "sdotaccent";
                    case 7778:
                        return "Sdotbelow";
                    case 7779:
                        return "sdotbelow";
                    case 7780:
                        return "Sacutedotaccent";
                    case 7781:
                        return "sacutedotaccent";
                    case 7782:
                        return "Scarondotaccent";
                    case 7783:
                        return "scarondotaccent";
                    case 7784:
                        return "Sdotbelowdotaccent";
                    case 7785:
                        return "sdotbelowdotaccent";
                    case 7786:
                        return "Tdotaccent";
                    case 7787:
                        return "tdotaccent";
                    case 7788:
                        return "Tdotbelow";
                    case 7789:
                        return "tdotbelow";
                    case 7790:
                        return "Tlinebelow";
                    case 7791:
                        return "tlinebelow";
                    case 7792:
                        return "Tcircumflexbelow";
                    case 7793:
                        return "tcircumflexbelow";
                    case 7794:
                        return "Udieresisbelow";
                    case 7795:
                        return "udieresisbelow";
                    case 7796:
                        return "Utildebelow";
                    case 7797:
                        return "utildebelow";
                    case 7798:
                        return "Ucircumflexbelow";
                    case 7799:
                        return "ucircumflexbelow";
                    case 7800:
                        return "Utildeacute";
                    case 7801:
                        return "utildeacute";
                    case 7802:
                        return "Umacrondieresis";
                    case 7803:
                        return "umacrondieresis";
                    case 7804:
                        return "Vtilde";
                    case 7805:
                        return "vtilde";
                    case 7806:
                        return "Vdotbelow";
                    case 7807:
                        return "vdotbelow";
                    case 7808:
                        return "Wgrave";
                    case 7809:
                        return "wgrave";
                    case 7810:
                        return "Wacute";
                    case 7811:
                        return "wacute";
                    case 7812:
                        return "Wdieresis";
                    case 7813:
                        return "wdieresis";
                    case 7814:
                        return "Wdotaccent";
                    case 7815:
                        return "wdotaccent";
                    case 7816:
                        return "Wdotbelow";
                    case 7817:
                        return "wdotbelow";
                    case 7818:
                        return "Xdotaccent";
                    case 7819:
                        return "xdotaccent";
                    case 7820:
                        return "Xdieresis";
                    case 7821:
                        return "xdieresis";
                    case 7822:
                        return "Ydotaccent";
                    case 7823:
                        return "ydotaccent";
                    case 7824:
                        return "Zcircumflex";
                    case 7825:
                        return "zcircumflex";
                    case 7826:
                        return "Zdotbelow";
                    case 7827:
                        return "zdotbelow";
                    case 7828:
                        return "Zlinebelow";
                    case 7829:
                        return "zlinebelow";
                    case 7830:
                        return "hlinebelow";
                    case 7831:
                        return "tdieresis";
                    case 7832:
                        return "wring";
                    case 7833:
                        return "yring";
                    case 7834:
                        return "arighthalfring";
                    case 7835:
                        return "slongdotaccent";
                    case 7840:
                        return "Adotbelow";
                    case 7841:
                        return "adotbelow";
                    case 7842:
                        return "Ahookabove";
                    case 7843:
                        return "ahookabove";
                    case 7844:
                        return "Acircumflexacute";
                    case 7845:
                        return "acircumflexacute";
                    case 7846:
                        return "Acircumflexgrave";
                    case 7847:
                        return "acircumflexgrave";
                    case 7848:
                        return "Acircumflexhookabove";
                    case 7849:
                        return "acircumflexhookabove";
                    case 7850:
                        return "Acircumflextilde";
                    case 7851:
                        return "acircumflextilde";
                    case 7852:
                        return "Acircumflexdotbelow";
                    case 7853:
                        return "acircumflexdotbelow";
                    case 7854:
                        return "Abreveacute";
                    case 7855:
                        return "abreveacute";
                    case 7856:
                        return "Abrevegrave";
                    case 7857:
                        return "abrevegrave";
                    case 7858:
                        return "Abrevehookabove";
                    case 7859:
                        return "abrevehookabove";
                    case 7860:
                        return "Abrevetilde";
                    case 7861:
                        return "abrevetilde";
                    case 7862:
                        return "Abrevedotbelow";
                    case 7863:
                        return "abrevedotbelow";
                    case 7864:
                        return "Edotbelow";
                    case 7865:
                        return "edotbelow";
                    case 7866:
                        return "Ehookabove";
                    case 7867:
                        return "ehookabove";
                    case 7868:
                        return "Etilde";
                    case 7869:
                        return "etilde";
                    case 7870:
                        return "Ecircumflexacute";
                    case 7871:
                        return "ecircumflexacute";
                    case 7872:
                        return "Ecircumflexgrave";
                    case 7873:
                        return "ecircumflexgrave";
                    case 7874:
                        return "Ecircumflexhookabove";
                    case 7875:
                        return "ecircumflexhookabove";
                    case 7876:
                        return "Ecircumflextilde";
                    case 7877:
                        return "ecircumflextilde";
                    case 7878:
                        return "Ecircumflexdotbelow";
                    case 7879:
                        return "ecircumflexdotbelow";
                    case 7880:
                        return "Ihookabove";
                    case 7881:
                        return "ihookabove";
                    case 7882:
                        return "Idotbelow";
                    case 7883:
                        return "idotbelow";
                    case 7884:
                        return "Odotbelow";
                    case 7885:
                        return "odotbelow";
                    case 7886:
                        return "Ohookabove";
                    case 7887:
                        return "ohookabove";
                    case 7888:
                        return "Ocircumflexacute";
                    case 7889:
                        return "ocircumflexacute";
                    case 7890:
                        return "Ocircumflexgrave";
                    case 7891:
                        return "ocircumflexgrave";
                    case 7892:
                        return "Ocircumflexhookabove";
                    case 7893:
                        return "ocircumflexhookabove";
                    case 7894:
                        return "Ocircumflextilde";
                    case 7895:
                        return "ocircumflextilde";
                    case 7896:
                        return "Ocircumflexdotbelow";
                    case 7897:
                        return "ocircumflexdotbelow";
                    case 7898:
                        return "Ohornacute";
                    case 7899:
                        return "ohornacute";
                    case 7900:
                        return "Ohorngrave";
                    case 7901:
                        return "ohorngrave";
                    case 7902:
                        return "Ohornhookabove";
                    case 7903:
                        return "ohornhookabove";
                    case 7904:
                        return "Ohorntilde";
                    case 7905:
                        return "ohorntilde";
                    case 7906:
                        return "Ohorndotbelow";
                    case 7907:
                        return "ohorndotbelow";
                    case 7908:
                        return "Udotbelow";
                    case 7909:
                        return "udotbelow";
                    case 7910:
                        return "Uhookabove";
                    case 7911:
                        return "uhookabove";
                    case 7912:
                        return "Uhornacute";
                    case 7913:
                        return "uhornacute";
                    case 7914:
                        return "Uhorngrave";
                    case 7915:
                        return "uhorngrave";
                    case 7916:
                        return "Uhornhookabove";
                    case 7917:
                        return "uhornhookabove";
                    case 7918:
                        return "Uhorntilde";
                    case 7919:
                        return "uhorntilde";
                    case 7920:
                        return "Uhorndotbelow";
                    case 7921:
                        return "uhorndotbelow";
                    case 7922:
                        return "Ygrave";
                    case 7923:
                        return "ygrave";
                    case 7924:
                        return "Ydotbelow";
                    case 7925:
                        return "ydotbelow";
                    case 7926:
                        return "Yhookabove";
                    case 7927:
                        return "yhookabove";
                    case 7928:
                        return "Ytilde";
                    case 7929:
                        return "ytilde";
                    case InputDeviceCompat.SOURCE_MOUSE /* 8194 */:
                        return "enspace";
                    case 8203:
                        return "zerowidthspace";
                    case 8204:
                        return "afii61664";
                    case 8205:
                        return "afii301";
                    case 8206:
                        return "afii299";
                    case 8207:
                        return "afii300";
                    case 8208:
                        return "hyphentwo";
                    case 8210:
                        return "figuredash";
                    case 8211:
                        return "endash";
                    case 8212:
                        return "emdash";
                    case 8213:
                        return "afii00208";
                    case 8214:
                        return "dblverticalbar";
                    case 8215:
                        return "dbllowline";
                    case 8216:
                        return "quoteleft";
                    case 8217:
                        return "quoteright";
                    case EditingLanguage.BOSNIAN_CYRILLIC /* 8218 */:
                        return "quotesinglbase";
                    case 8219:
                        return "quoteleftreversed";
                    case C18438z3.f56774j /* 8220 */:
                        return "quotedblleft";
                    case 8221:
                        return "quotedblright";
                    case 8222:
                        return "quotedblbase";
                    case 8224:
                        return "dagger";
                    case 8225:
                        return "daggerdbl";
                    case 8226:
                        return "bullet";
                    case 8228:
                        return "onedotenleader";
                    case 8229:
                        return "twodotenleader";
                    case 8230:
                        return "ellipsis";
                    case 8236:
                        return "afii61573";
                    case 8237:
                        return "afii61574";
                    case 8238:
                        return "afii61575";
                    case 8240:
                        return "perthousand";
                    case 8242:
                        return "minute";
                    case 8243:
                        return "second";
                    case 8245:
                        return "primereversed";
                    case 8249:
                        return "guilsinglleft";
                    case 8250:
                        return "guilsinglright";
                    case 8251:
                        return "referencemark";
                    case 8252:
                        return "exclamdbl";
                    case 8254:
                        return "overline";
                    case 8258:
                        return "asterism";
                    case 8260:
                        return "fraction";
                    case 8304:
                        return "zerosuperior";
                    case 8308:
                        return "foursuperior";
                    case 8309:
                        return "fivesuperior";
                    case 8310:
                        return "sixsuperior";
                    case 8311:
                        return "sevensuperior";
                    case 8312:
                        return "eightsuperior";
                    case 8313:
                        return "ninesuperior";
                    case 8314:
                        return "plussuperior";
                    case 8316:
                        return "equalsuperior";
                    case 8317:
                        return "parenleftsuperior";
                    case 8318:
                        return "parenrightsuperior";
                    case 8319:
                        return "nsuperior";
                    case 8320:
                        return "zeroinferior";
                    case 8321:
                        return "oneinferior";
                    case 8322:
                        return "twoinferior";
                    case 8323:
                        return "threeinferior";
                    case 8324:
                        return "fourinferior";
                    case 8325:
                        return "fiveinferior";
                    case 8326:
                        return "sixinferior";
                    case 8327:
                        return "seveninferior";
                    case 8328:
                        return "eightinferior";
                    case 8329:
                        return "nineinferior";
                    case 8333:
                        return "parenleftinferior";
                    case 8334:
                        return "parenrightinferior";
                    case 8353:
                        return "colonmonetary";
                    case 8354:
                        return "cruzeiro";
                    case 8355:
                        return "franc";
                    case 8356:
                        return "afii08941";
                    case 8359:
                        return "peseta";
                    case 8361:
                        return "won";
                    case 8362:
                        return "afii57636";
                    case 8363:
                        return "dong";
                    case 8364:
                        return "Euro";
                    case 8451:
                        return "centigrade";
                    case 8453:
                        return "afii61248";
                    case 8457:
                        return "fahrenheit";
                    case 8465:
                        return "Ifraktur";
                    case 8467:
                        return "afii61289";
                    case 8470:
                        return "afii61352";
                    case 8472:
                        return "weierstrass";
                    case 8476:
                        return "Rfraktur";
                    case 8478:
                        return "prescription";
                    case 8481:
                        return "telephone";
                    case 8482:
                        return "trademark";
                    case 8486:
                        return "Ohm";
                    case 8491:
                        return "angstrom";
                    case 8494:
                        return "estimated";
                    case 8501:
                        return "aleph";
                    case 8531:
                        return "onethird";
                    case 8532:
                        return "twothirds";
                    case 8539:
                        return "oneeighth";
                    case 8540:
                        return "threeeighths";
                    case 8541:
                        return "fiveeighths";
                    case 8542:
                        return "seveneighths";
                    case 8544:
                        return "Oneroman";
                    case 8545:
                        return "Tworoman";
                    case 8546:
                        return "Threeroman";
                    case 8547:
                        return "Fourroman";
                    case 8548:
                        return "Fiveroman";
                    case 8549:
                        return "Sixroman";
                    case 8550:
                        return "Sevenroman";
                    case 8551:
                        return "Eightroman";
                    case 8552:
                        return "Nineroman";
                    case 8553:
                        return "Tenroman";
                    case 8554:
                        return "Elevenroman";
                    case 8555:
                        return "Twelveroman";
                    case 8560:
                        return "oneroman";
                    case 8561:
                        return "tworoman";
                    case 8562:
                        return "threeroman";
                    case 8563:
                        return "fourroman";
                    case 8564:
                        return "fiveroman";
                    case 8565:
                        return "sixroman";
                    case 8566:
                        return "sevenroman";
                    case 8567:
                        return "eightroman";
                    case 8568:
                        return "nineroman";
                    case 8569:
                        return "tenroman";
                    case 8570:
                        return "elevenroman";
                    case 8571:
                        return "twelveroman";
                    case 8592:
                        return "arrowleft";
                    case 8593:
                        return "arrowup";
                    case 8594:
                        return "arrowright";
                    case 8595:
                        return "arrowdown";
                    case 8596:
                        return "arrowboth";
                    case 8597:
                        return "arrowupdn";
                    case 8598:
                        return "arrowupleft";
                    case 8599:
                        return "arrowupright";
                    case 8600:
                        return "arrowdownright";
                    case 8601:
                        return "arrowdownleft";
                    case 8616:
                        return "arrowupdnbse";
                    case 8629:
                        return "carriagereturn";
                    case 8636:
                        return "harpoonleftbarbup";
                    case 8640:
                        return "harpoonrightbarbup";
                    case 8644:
                        return "arrowrightoverleft";
                    case 8645:
                        return "arrowupleftofdown";
                    case 8646:
                        return "arrowleftoverright";
                    case 8653:
                        return "arrowleftdblstroke";
                    case 8655:
                        return "arrowrightdblstroke";
                    case 8656:
                        return "arrowdblleft";
                    case 8657:
                        return "arrowdblup";
                    case 8658:
                        return "arrowdblright";
                    case 8659:
                        return "arrowdbldown";
                    case 8660:
                        return "arrowdblboth";
                    case 8670:
                        return "pageup";
                    case 8671:
                        return "pagedown";
                    case 8672:
                        return "arrowdashleft";
                    case 8673:
                        return "arrowdashup";
                    case 8674:
                        return "arrowdashright";
                    case 8675:
                        return "arrowdashdown";
                    case 8676:
                        return "arrowtableft";
                    case 8677:
                        return "arrowtabright";
                    case 8678:
                        return "arrowleftwhite";
                    case 8679:
                        return "arrowupwhite";
                    case 8680:
                        return "arrowrightwhite";
                    case 8681:
                        return "arrowdownwhite";
                    case 8682:
                        return "capslock";
                    case 8704:
                        return "forall";
                    case 8706:
                        return "partialdiff";
                    case 8707:
                        return "existential";
                    case 8709:
                        return "emptyset";
                    case 8710:
                        return "Delta";
                    case 8711:
                        return "gradient";
                    case 8712:
                        return "element";
                    case 8713:
                        return "notelement";
                    case 8715:
                        return "suchthat";
                    case 8716:
                        return "notcontains";
                    case 8719:
                        return "product";
                    case 8721:
                        return "summation";
                    case 8722:
                        return "minus";
                    case 8723:
                        return "minusplus";
                    case 8725:
                        return "divisionslash";
                    case 8727:
                        return "asteriskmath";
                    case 8729:
                        return "bulletoperator";
                    case 8730:
                        return "radical";
                    case 8733:
                        return "proportional";
                    case 8734:
                        return "infinity";
                    case 8735:
                        return "orthogonal";
                    case 8736:
                        return "angle";
                    case 8739:
                        return "divides";
                    case 8741:
                        return "parallel";
                    case 8742:
                        return "notparallel";
                    case 8743:
                        return "logicaland";
                    case 8744:
                        return "logicalor";
                    case 8745:
                        return "intersection";
                    case 8746:
                        return "union";
                    case 8747:
                        return "integral";
                    case 8748:
                        return "dblintegral";
                    case 8750:
                        return "contourintegral";
                    case 8756:
                        return "therefore";
                    case 8757:
                        return "because";
                    case 8758:
                        return "ratio";
                    case 8759:
                        return "proportion";
                    case 8764:
                        return "similar";
                    case 8765:
                        return "reversedtilde";
                    case 8771:
                        return "asymptoticallyequal";
                    case 8773:
                        return "approximatelyequal";
                    case 8776:
                        return "approxequal";
                    case 8780:
                        return "allequal";
                    case 8784:
                        return "approaches";
                    case 8785:
                        return "geometricallyequal";
                    case 8786:
                        return "approxequalorimage";
                    case 8787:
                        return "imageorapproximatelyequal";
                    case 8800:
                        return "notequal";
                    case 8801:
                        return "equivalence";
                    case 8802:
                        return "notidentical";
                    case 8804:
                        return "lessequal";
                    case 8805:
                        return "greaterequal";
                    case 8806:
                        return "lessoverequal";
                    case 8807:
                        return "greateroverequal";
                    case 8810:
                        return "muchless";
                    case 8811:
                        return "muchgreater";
                    case 8814:
                        return "notless";
                    case 8815:
                        return "notgreater";
                    case 8816:
                        return "notlessnorequal";
                    case 8817:
                        return "notgreaternorequal";
                    case 8818:
                        return "lessorequivalent";
                    case 8819:
                        return "greaterorequivalent";
                    case 8822:
                        return "lessorgreater";
                    case 8823:
                        return "greaterorless";
                    case 8825:
                        return "notgreaternorless";
                    case 8826:
                        return "precedes";
                    case 8827:
                        return "succeeds";
                    case 8832:
                        return "notprecedes";
                    case 8833:
                        return "notsucceeds";
                    case 8834:
                        return "propersubset";
                    case 8835:
                        return "propersuperset";
                    case 8836:
                        return "notsubset";
                    case 8837:
                        return "notsuperset";
                    case 8838:
                        return "reflexsubset";
                    case 8839:
                        return "reflexsuperset";
                    case 8842:
                        return "subsetnotequal";
                    case 8843:
                        return "supersetnotequal";
                    case 8853:
                        return "circleplus";
                    case 8854:
                        return "minuscircle";
                    case 8855:
                        return "circlemultiply";
                    case 8857:
                        return "circleot";
                    case 8867:
                        return "tackleft";
                    case 8868:
                        return "tackdown";
                    case 8869:
                        return "perpendicular";
                    case 8895:
                        return "righttriangle";
                    case 8901:
                        return "dotmath";
                    case 8910:
                        return "curlyor";
                    case 8911:
                        return "curlyand";
                    case 8922:
                        return "lessequalorgreater";
                    case 8923:
                        return "greaterequalorless";
                    case 8942:
                        return "ellipsisvertical";
                    case 8962:
                        return "house";
                    case 8963:
                        return "control";
                    case 8965:
                        return "projective";
                    case 8976:
                        return "logicalnotreversed";
                    case 8978:
                        return "arc";
                    case 8984:
                        return "propellor";
                    case 8992:
                        return "integraltop";
                    case 8993:
                        return "integralbottom";
                    case 8997:
                        return "option";
                    case 8998:
                        return "deleteright";
                    case 8999:
                        return "clear";
                    case com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED /* 9001 */:
                        return "angleleft";
                    case com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 9002 */:
                        return "angleright";
                    case com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE /* 9003 */:
                        return "deleteleft";
                    case 9251:
                        return "blank";
                    case 9312:
                        return "onecircle";
                    case 9313:
                        return "twocircle";
                    case 9314:
                        return "threecircle";
                    case 9315:
                        return "fourcircle";
                    case 9316:
                        return "fivecircle";
                    case 9317:
                        return "sixcircle";
                    case 9318:
                        return "sevencircle";
                    case 9319:
                        return "eightcircle";
                    case 9320:
                        return "ninecircle";
                    case 9321:
                        return "tencircle";
                    case 9322:
                        return "elevencircle";
                    case 9323:
                        return "twelvecircle";
                    case 9324:
                        return "thirteencircle";
                    case 9325:
                        return "fourteencircle";
                    case 9326:
                        return "fifteencircle";
                    case 9327:
                        return "sixteencircle";
                    case 9328:
                        return "seventeencircle";
                    case 9329:
                        return "eighteencircle";
                    case 9330:
                        return "nineteencircle";
                    case 9331:
                        return "twentycircle";
                    case 9332:
                        return "oneparen";
                    case 9333:
                        return "twoparen";
                    case 9334:
                        return "threeparen";
                    case 9335:
                        return "fourparen";
                    case 9336:
                        return "fiveparen";
                    case 9337:
                        return "sixparen";
                    case 9338:
                        return "sevenparen";
                    case 9339:
                        return "eightparen";
                    case 9340:
                        return "nineparen";
                    case 9341:
                        return "tenparen";
                    case 9342:
                        return "elevenparen";
                    case 9343:
                        return "twelveparen";
                    case 9344:
                        return "thirteenparen";
                    case 9345:
                        return "fourteenparen";
                    case 9346:
                        return "fifteenparen";
                    case 9347:
                        return "sixteenparen";
                    case 9348:
                        return "seventeenparen";
                    case 9349:
                        return "eighteenparen";
                    case 9350:
                        return "nineteenparen";
                    case 9351:
                        return "twentyparen";
                    case 9352:
                        return "oneperiod";
                    case 9353:
                        return "twoperiod";
                    case 9354:
                        return "threeperiod";
                    case 9355:
                        return "fourperiod";
                    case 9356:
                        return "fiveperiod";
                    case 9357:
                        return "sixperiod";
                    case 9358:
                        return "sevenperiod";
                    case 9359:
                        return "eightperiod";
                    case 9360:
                        return "nineperiod";
                    case 9361:
                        return "tenperiod";
                    case 9362:
                        return "elevenperiod";
                    case 9363:
                        return "twelveperiod";
                    case 9364:
                        return "thirteenperiod";
                    case 9365:
                        return "fourteenperiod";
                    case 9366:
                        return "fifteenperiod";
                    case 9367:
                        return "sixteenperiod";
                    case 9368:
                        return "seventeenperiod";
                    case 9369:
                        return "eighteenperiod";
                    case 9370:
                        return "nineteenperiod";
                    case 9371:
                        return "twentyperiod";
                    case 9372:
                        return "aparen";
                    case 9373:
                        return "bparen";
                    case 9374:
                        return "cparen";
                    case 9375:
                        return "dparen";
                    case 9376:
                        return "eparen";
                    case 9377:
                        return "fparen";
                    case 9378:
                        return "gparen";
                    case 9379:
                        return "hparen";
                    case 9380:
                        return "iparen";
                    case 9381:
                        return "jparen";
                    case 9382:
                        return "kparen";
                    case 9383:
                        return "lparen";
                    case 9384:
                        return "mparen";
                    case 9385:
                        return "nparen";
                    case 9386:
                        return "oparen";
                    case 9387:
                        return "pparen";
                    case 9388:
                        return "qparen";
                    case 9389:
                        return "rparen";
                    case 9390:
                        return "sparen";
                    case 9391:
                        return "tparen";
                    case 9392:
                        return "uparen";
                    case 9393:
                        return "vparen";
                    case 9394:
                        return "wparen";
                    case 9395:
                        return "xparen";
                    case 9396:
                        return "yparen";
                    case 9397:
                        return "zparen";
                    case 9398:
                        return "Acircle";
                    case 9399:
                        return "Bcircle";
                    case 9400:
                        return "Ccircle";
                    case 9401:
                        return "Dcircle";
                    case 9402:
                        return "Ecircle";
                    case 9403:
                        return "Fcircle";
                    case 9404:
                        return "Gcircle";
                    case 9405:
                        return "Hcircle";
                    case 9406:
                        return "Icircle";
                    case 9407:
                        return "Jcircle";
                    case 9408:
                        return "Kcircle";
                    case 9409:
                        return "Lcircle";
                    case 9410:
                        return "Mcircle";
                    case 9411:
                        return "Ncircle";
                    case 9412:
                        return "Ocircle";
                    case 9413:
                        return "Pcircle";
                    case 9414:
                        return "Qcircle";
                    case 9415:
                        return "Rcircle";
                    case 9416:
                        return "Scircle";
                    case 9417:
                        return "Tcircle";
                    case 9418:
                        return "Ucircle";
                    case 9419:
                        return "Vcircle";
                    case 9420:
                        return "Wcircle";
                    case 9421:
                        return "Xcircle";
                    case 9422:
                        return "Ycircle";
                    case 9423:
                        return "Zcircle";
                    case 9424:
                        return "acircle";
                    case 9425:
                        return "bcircle";
                    case 9426:
                        return "ccircle";
                    case 9427:
                        return "dcircle";
                    case 9428:
                        return "ecircle";
                    case 9429:
                        return "fcircle";
                    case 9430:
                        return "gcircle";
                    case 9431:
                        return "hcircle";
                    case 9432:
                        return "icircle";
                    case 9433:
                        return "jcircle";
                    case 9434:
                        return "kcircle";
                    case 9435:
                        return "lcircle";
                    case 9436:
                        return "mcircle";
                    case 9437:
                        return "ncircle";
                    case 9438:
                        return "ocircle";
                    case 9439:
                        return "pcircle";
                    case 9440:
                        return "qcircle";
                    case 9441:
                        return "rcircle";
                    case 9442:
                        return "scircle";
                    case 9443:
                        return "tcircle";
                    case 9444:
                        return "ucircle";
                    case 9445:
                        return "vcircle";
                    case 9446:
                        return "wcircle";
                    case 9447:
                        return "xcircle";
                    case 9448:
                        return "ycircle";
                    case 9449:
                        return "zcircle";
                    case 9472:
                        return "SF100000";
                    case 9474:
                        return "SF110000";
                    case 9484:
                        return "SF010000";
                    case 9488:
                        return "SF030000";
                    case 9492:
                        return "SF020000";
                    case 9496:
                        return "SF040000";
                    case 9500:
                        return "SF080000";
                    case 9508:
                        return "SF090000";
                    case 9516:
                        return "SF060000";
                    case 9524:
                        return "SF070000";
                    case 9532:
                        return "SF050000";
                    case 9552:
                        return "SF430000";
                    case 9553:
                        return "SF240000";
                    case 9554:
                        return "SF510000";
                    case 9555:
                        return "SF520000";
                    case 9556:
                        return "SF390000";
                    case 9557:
                        return "SF220000";
                    case 9558:
                        return "SF210000";
                    case 9559:
                        return "SF250000";
                    case 9560:
                        return "SF500000";
                    case 9561:
                        return "SF490000";
                    case 9562:
                        return "SF380000";
                    case 9563:
                        return "SF280000";
                    case 9564:
                        return "SF270000";
                    case 9565:
                        return "SF260000";
                    case 9566:
                        return "SF360000";
                    case 9567:
                        return "SF370000";
                    case 9568:
                        return "SF420000";
                    case 9569:
                        return "SF190000";
                    case 9570:
                        return "SF200000";
                    case 9571:
                        return "SF230000";
                    case 9572:
                        return "SF470000";
                    case 9573:
                        return "SF480000";
                    case 9574:
                        return "SF410000";
                    case 9575:
                        return "SF450000";
                    case 9576:
                        return "SF460000";
                    case 9577:
                        return "SF400000";
                    case 9578:
                        return "SF540000";
                    case 9579:
                        return "SF530000";
                    case 9580:
                        return "SF440000";
                    case 9600:
                        return "upblock";
                    case 9604:
                        return "dnblock";
                    case 9608:
                        return "block";
                    case 9612:
                        return "lfblock";
                    case 9616:
                        return "rtblock";
                    case 9617:
                        return "ltshade";
                    case 9618:
                        return "shade";
                    case 9619:
                        return "dkshade";
                    case 9632:
                        return "blacksquare";
                    case 9633:
                        return "H22073";
                    case 9635:
                        return "squarewhitewithsmallblack";
                    case 9636:
                        return "squarehorizontalfill";
                    case 9637:
                        return "squareverticalfill";
                    case 9638:
                        return "squareorthogonalcrosshatchfill";
                    case 9639:
                        return "squareupperlefttolowerrightfill";
                    case 9640:
                        return "squareupperrighttolowerleftfill";
                    case 9641:
                        return "squarediagonalcrosshatchfill";
                    case 9642:
                        return "H18543";
                    case 9643:
                        return "H18551";
                    case 9644:
                        return "blackrectangle";
                    case 9650:
                        return "blackuppointingtriangle";
                    case 9651:
                        return "whiteuppointingtriangle";
                    case 9652:
                        return "blackuppointingsmalltriangle";
                    case 9653:
                        return "whiteuppointingsmalltriangle";
                    case 9654:
                        return "blackrightpointingtriangle";
                    case 9655:
                        return "whiterightpointingtriangle";
                    case 9657:
                        return "whiterightpointingsmalltriangle";
                    case 9658:
                        return "blackrightpointingpointer";
                    case 9660:
                        return "blackdownpointingtriangle";
                    case 9661:
                        return "whitedownpointingtriangle";
                    case 9663:
                        return "whitedownpointingsmalltriangle";
                    case 9664:
                        return "blackleftpointingtriangle";
                    case 9665:
                        return "whiteleftpointingtriangle";
                    case 9667:
                        return "whiteleftpointingsmalltriangle";
                    case 9668:
                        return "blackleftpointingpointer";
                    case 9670:
                        return "blackdiamond";
                    case 9671:
                        return "whitediamond";
                    case 9672:
                        return "whitediamondcontainingblacksmalldiamond";
                    case 9673:
                        return "fisheye";
                    case 9674:
                        return "lozenge";
                    case 9675:
                        return "circle";
                    case 9676:
                        return "dottedcircle";
                    case 9678:
                        return "bullseye";
                    case 9679:
                        return "H18533";
                    case 9680:
                        return "circlewithlefthalfblack";
                    case 9681:
                        return "circlewithrighthalfblack";
                    case 9688:
                        return "bulletinverse";
                    case 9689:
                        return "invcircle";
                    case 9698:
                        return "blacklowerrighttriangle";
                    case 9699:
                        return "blacklowerlefttriangle";
                    case 9700:
                        return "blackupperlefttriangle";
                    case 9701:
                        return "blackupperrighttriangle";
                    case 9702:
                        return "openbullet";
                    case 9711:
                        return "largecircle";
                    case 9733:
                        return "blackstar";
                    case 9734:
                        return "whitestar";
                    case 9742:
                        return "telephoneblack";
                    case 9743:
                        return "whitetelephone";
                    case 9756:
                        return "pointingindexleftwhite";
                    case 9757:
                        return "pointingindexupwhite";
                    case 9758:
                        return "pointingindexrightwhite";
                    case 9759:
                        return "pointingindexdownwhite";
                    case 9775:
                        return "yinyang";
                    case 9786:
                        return "smileface";
                    case 9787:
                        return "blacksmilingface";
                    case 9788:
                        return "compass";
                    case 9792:
                        return User.FEMALE;
                    case 9793:
                        return "earth";
                    case 9794:
                        return User.MALE;
                    case 9824:
                        return "spade";
                    case 9825:
                        return "heartsuitwhite";
                    case 9826:
                        return "diamondsuitwhite";
                    case 9827:
                        return "club";
                    case 9828:
                        return "spadesuitwhite";
                    case 9829:
                        return "heart";
                    case 9830:
                        return "diamond";
                    case 9831:
                        return "clubsuitwhite";
                    case 9832:
                        return "hotsprings";
                    case 9833:
                        return "quarternote";
                    case 9834:
                        return "musicalnote";
                    case 9835:
                        return "eighthnotebeamed";
                    case 9836:
                        return "beamedsixteenthnotes";
                    case 9837:
                        return "musicflatsign";
                    case 9839:
                        return "musicsharpsign";
                    case UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK /* 10003 */:
                        return "checkmark";
                    case 10122:
                        return "onecircleinversesansserif";
                    case 10123:
                        return "twocircleinversesansserif";
                    case 10124:
                        return "threecircleinversesansserif";
                    case 10125:
                        return "fourcircleinversesansserif";
                    case 10126:
                        return "fivecircleinversesansserif";
                    case 10127:
                        return "sixcircleinversesansserif";
                    case 10128:
                        return "sevencircleinversesansserif";
                    case 10129:
                        return "eightcircleinversesansserif";
                    case 10130:
                        return "ninecircleinversesansserif";
                    case 10142:
                        return "arrowrightheavy";
                    case 12288:
                        return "ideographicspace";
                    case EditingLanguage.ARABIC_LEBANON /* 12289 */:
                        return "ideographiccomma";
                    case 12290:
                        return "ideographicperiod";
                    case 12291:
                        return "dittomark";
                    case 12292:
                        return "jis";
                    case 12293:
                        return "ideographiciterationmark";
                    case 12294:
                        return "ideographicclose";
                    case 12295:
                        return "ideographiczero";
                    case 12296:
                        return "anglebracketleft";
                    case EditingLanguage.ENGLISH_ZIMBABWE /* 12297 */:
                        return "anglebracketright";
                    case EditingLanguage.SPANISH_ECUADOR /* 12298 */:
                        return "dblanglebracketleft";
                    case 12299:
                        return "dblanglebracketright";
                    case 12300:
                        return "cornerbracketleft";
                    case 12301:
                        return "cornerbracketright";
                    case 12302:
                        return "whitecornerbracketleft";
                    case 12303:
                        return "whitecornerbracketright";
                    case 12304:
                        return "blacklenticularbracketleft";
                    case 12305:
                        return "blacklenticularbracketright";
                    case 12306:
                        return "postalmark";
                    case 12307:
                        return "getamark";
                    case 12308:
                        return "tortoiseshellbracketleft";
                    case 12309:
                        return "tortoiseshellbracketright";
                    case 12310:
                        return "whitelenticularbracketleft";
                    case 12311:
                        return "whitelenticularbracketright";
                    case 12312:
                        return "whitetortoiseshellbracketleft";
                    case 12313:
                        return "whitetortoiseshellbracketright";
                    case 12316:
                        return "wavedash";
                    case 12317:
                        return "quotedblprimereversed";
                    case 12318:
                        return "quotedblprime";
                    case 12320:
                        return "postalmarkface";
                    case 12321:
                        return "onehangzhou";
                    case 12322:
                        return "twohangzhou";
                    case 12323:
                        return "threehangzhou";
                    case 12324:
                        return "fourhangzhou";
                    case 12325:
                        return "fivehangzhou";
                    case 12326:
                        return "sixhangzhou";
                    case 12327:
                        return "sevenhangzhou";
                    case 12328:
                        return "eighthangzhou";
                    case 12329:
                        return "ninehangzhou";
                    case 12342:
                        return "circlepostalmark";
                    case 12353:
                        return "asmallhiragana";
                    case 12354:
                        return "ahiragana";
                    case 12355:
                        return "ismallhiragana";
                    case 12356:
                        return "ihiragana";
                    case 12357:
                        return "usmallhiragana";
                    case 12358:
                        return "uhiragana";
                    case 12359:
                        return "esmallhiragana";
                    case 12360:
                        return "ehiragana";
                    case 12361:
                        return "osmallhiragana";
                    case 12362:
                        return "ohiragana";
                    case 12363:
                        return "kahiragana";
                    case 12364:
                        return "gahiragana";
                    case 12365:
                        return "kihiragana";
                    case 12366:
                        return "gihiragana";
                    case 12367:
                        return "kuhiragana";
                    case 12368:
                        return "guhiragana";
                    case 12369:
                        return "kehiragana";
                    case 12370:
                        return "gehiragana";
                    case 12371:
                        return "kohiragana";
                    case 12372:
                        return "gohiragana";
                    case 12373:
                        return "sahiragana";
                    case 12374:
                        return "zahiragana";
                    case 12375:
                        return "sihiragana";
                    case 12376:
                        return "zihiragana";
                    case 12377:
                        return "suhiragana";
                    case 12378:
                        return "zuhiragana";
                    case 12379:
                        return "sehiragana";
                    case 12380:
                        return "zehiragana";
                    case 12381:
                        return "sohiragana";
                    case 12382:
                        return "zohiragana";
                    case 12383:
                        return "tahiragana";
                    case 12384:
                        return "dahiragana";
                    case 12385:
                        return "tihiragana";
                    case 12386:
                        return "dihiragana";
                    case 12387:
                        return "tusmallhiragana";
                    case 12388:
                        return "tuhiragana";
                    case 12389:
                        return "duhiragana";
                    case 12390:
                        return "tehiragana";
                    case 12391:
                        return "dehiragana";
                    case 12392:
                        return "tohiragana";
                    case 12393:
                        return "dohiragana";
                    case 12394:
                        return "nahiragana";
                    case 12395:
                        return "nihiragana";
                    case 12396:
                        return "nuhiragana";
                    case 12397:
                        return "nehiragana";
                    case 12398:
                        return "nohiragana";
                    case 12399:
                        return "hahiragana";
                    case 12400:
                        return "bahiragana";
                    case 12401:
                        return "pahiragana";
                    case 12402:
                        return "hihiragana";
                    case 12403:
                        return "bihiragana";
                    case 12404:
                        return "pihiragana";
                    case 12405:
                        return "huhiragana";
                    case 12406:
                        return "buhiragana";
                    case 12407:
                        return "puhiragana";
                    case 12408:
                        return "hehiragana";
                    case 12409:
                        return "behiragana";
                    case 12410:
                        return "pehiragana";
                    case 12411:
                        return "hohiragana";
                    case 12412:
                        return "bohiragana";
                    case 12413:
                        return "pohiragana";
                    case 12414:
                        return "mahiragana";
                    case 12415:
                        return "mihiragana";
                    case 12416:
                        return "muhiragana";
                    case 12417:
                        return "mehiragana";
                    case 12418:
                        return "mohiragana";
                    case 12419:
                        return "yasmallhiragana";
                    case 12420:
                        return "yahiragana";
                    case 12421:
                        return "yusmallhiragana";
                    case 12422:
                        return "yuhiragana";
                    case 12423:
                        return "yosmallhiragana";
                    case 12424:
                        return "yohiragana";
                    case 12425:
                        return "rahiragana";
                    case 12426:
                        return "rihiragana";
                    case 12427:
                        return "ruhiragana";
                    case 12428:
                        return "rehiragana";
                    case 12429:
                        return "rohiragana";
                    case 12430:
                        return "wasmallhiragana";
                    case 12431:
                        return "wahiragana";
                    case 12432:
                        return "wihiragana";
                    case 12433:
                        return "wehiragana";
                    case 12434:
                        return "wohiragana";
                    case 12435:
                        return "nhiragana";
                    case 12436:
                        return "vuhiragana";
                    case 12443:
                        return "voicedmarkkana";
                    case 12444:
                        return "semivoicedmarkkana";
                    case 12445:
                        return "iterationhiragana";
                    case 12446:
                        return "voicediterationhiragana";
                    case 12449:
                        return "asmallkatakana";
                    case 12450:
                        return "akatakana";
                    case 12451:
                        return "ismallkatakana";
                    case 12452:
                        return "ikatakana";
                    case 12453:
                        return "usmallkatakana";
                    case 12454:
                        return "ukatakana";
                    case 12455:
                        return "esmallkatakana";
                    case 12456:
                        return "ekatakana";
                    case 12457:
                        return "osmallkatakana";
                    case 12458:
                        return "okatakana";
                    case 12459:
                        return "kakatakana";
                    case 12460:
                        return "gakatakana";
                    case 12461:
                        return "kikatakana";
                    case 12462:
                        return "gikatakana";
                    case 12463:
                        return "kukatakana";
                    case 12464:
                        return "gukatakana";
                    case 12465:
                        return "kekatakana";
                    case 12466:
                        return "gekatakana";
                    case 12467:
                        return "kokatakana";
                    case 12468:
                        return "gokatakana";
                    case 12469:
                        return "sakatakana";
                    case 12470:
                        return "zakatakana";
                    case 12471:
                        return "sikatakana";
                    case 12472:
                        return "zikatakana";
                    case 12473:
                        return "sukatakana";
                    case 12474:
                        return "zukatakana";
                    case 12475:
                        return "sekatakana";
                    case 12476:
                        return "zekatakana";
                    case 12477:
                        return "sokatakana";
                    case 12478:
                        return "zokatakana";
                    case 12479:
                        return "takatakana";
                    case 12480:
                        return "dakatakana";
                    case 12481:
                        return "tikatakana";
                    case 12482:
                        return "dikatakana";
                    case 12483:
                        return "tusmallkatakana";
                    case 12484:
                        return "tukatakana";
                    case 12485:
                        return "dukatakana";
                    case 12486:
                        return "tekatakana";
                    case 12487:
                        return "dekatakana";
                    case 12488:
                        return "tokatakana";
                    case 12489:
                        return "dokatakana";
                    case 12490:
                        return "nakatakana";
                    case 12491:
                        return "nikatakana";
                    case 12492:
                        return "nukatakana";
                    case 12493:
                        return "nekatakana";
                    case 12494:
                        return "nokatakana";
                    case 12495:
                        return "hakatakana";
                    case 12496:
                        return "bakatakana";
                    case 12497:
                        return "pakatakana";
                    case 12498:
                        return "hikatakana";
                    case 12499:
                        return "bikatakana";
                    case GoogleSignInStatusCodes.SIGN_IN_FAILED /* 12500 */:
                        return "pikatakana";
                    case GoogleSignInStatusCodes.SIGN_IN_CANCELLED /* 12501 */:
                        return "hukatakana";
                    case GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS /* 12502 */:
                        return "bukatakana";
                    case 12503:
                        return "pukatakana";
                    case 12504:
                        return "hekatakana";
                    case 12505:
                        return "bekatakana";
                    case 12506:
                        return "pekatakana";
                    case 12507:
                        return "hokatakana";
                    case 12508:
                        return "bokatakana";
                    case 12509:
                        return "pokatakana";
                    case 12510:
                        return "makatakana";
                    case 12511:
                        return "mikatakana";
                    case 12512:
                        return "mukatakana";
                    case 12513:
                        return "mekatakana";
                    case 12514:
                        return "mokatakana";
                    case 12515:
                        return "yasmallkatakana";
                    case 12516:
                        return "yakatakana";
                    case 12517:
                        return "yusmallkatakana";
                    case 12518:
                        return "yukatakana";
                    case 12519:
                        return "yosmallkatakana";
                    case 12520:
                        return "yokatakana";
                    case 12521:
                        return "rakatakana";
                    case 12522:
                        return "rikatakana";
                    case 12523:
                        return "rukatakana";
                    case 12524:
                        return "rekatakana";
                    case 12525:
                        return "rokatakana";
                    case 12526:
                        return "wasmallkatakana";
                    case 12527:
                        return "wakatakana";
                    case 12528:
                        return "wikatakana";
                    case 12529:
                        return "wekatakana";
                    case 12530:
                        return "wokatakana";
                    case 12531:
                        return "nkatakana";
                    case 12532:
                        return "vukatakana";
                    case 12533:
                        return "kasmallkatakana";
                    case 12534:
                        return "kesmallkatakana";
                    case 12535:
                        return "vakatakana";
                    case 12536:
                        return "vikatakana";
                    case 12537:
                        return "vekatakana";
                    case 12538:
                        return "vokatakana";
                    case 12539:
                        return "dotkatakana";
                    case 12540:
                        return "prolongedkana";
                    case 12541:
                        return "iterationkatakana";
                    case 12542:
                        return "voicediterationkatakana";
                    case 12549:
                        return "bbopomofo";
                    case 12550:
                        return "pbopomofo";
                    case 12551:
                        return "mbopomofo";
                    case 12552:
                        return "fbopomofo";
                    case 12553:
                        return "dbopomofo";
                    case 12554:
                        return "tbopomofo";
                    case 12555:
                        return "nbopomofo";
                    case 12556:
                        return "lbopomofo";
                    case 12557:
                        return "gbopomofo";
                    case 12558:
                        return "kbopomofo";
                    case 12559:
                        return "hbopomofo";
                    case 12560:
                        return "jbopomofo";
                    case 12561:
                        return "qbopomofo";
                    case 12562:
                        return "xbopomofo";
                    case 12563:
                        return "zhbopomofo";
                    case 12564:
                        return "chbopomofo";
                    case 12565:
                        return "shbopomofo";
                    case 12566:
                        return "rbopomofo";
                    case 12567:
                        return "zbopomofo";
                    case 12568:
                        return "cbopomofo";
                    case 12569:
                        return "sbopomofo";
                    case 12570:
                        return "abopomofo";
                    case 12571:
                        return "obopomofo";
                    case 12572:
                        return "ebopomofo";
                    case 12573:
                        return "ehbopomofo";
                    case 12574:
                        return "aibopomofo";
                    case 12575:
                        return "eibopomofo";
                    case 12576:
                        return "aubopomofo";
                    case 12577:
                        return "oubopomofo";
                    case 12578:
                        return "anbopomofo";
                    case 12579:
                        return "enbopomofo";
                    case 12580:
                        return "angbopomofo";
                    case 12581:
                        return "engbopomofo";
                    case 12582:
                        return "erbopomofo";
                    case 12583:
                        return "ibopomofo";
                    case 12584:
                        return "ubopomofo";
                    case 12585:
                        return "iubopomofo";
                    case 12593:
                        return "kiyeokkorean";
                    case 12594:
                        return "ssangkiyeokkorean";
                    case 12595:
                        return "kiyeoksioskorean";
                    case 12596:
                        return "nieunkorean";
                    case 12597:
                        return "nieuncieuckorean";
                    case 12598:
                        return "nieunhieuhkorean";
                    case 12599:
                        return "tikeutkorean";
                    case 12600:
                        return "ssangtikeutkorean";
                    case 12601:
                        return "rieulkorean";
                    case 12602:
                        return "rieulkiyeokkorean";
                    case 12603:
                        return "rieulmieumkorean";
                    case 12604:
                        return "rieulpieupkorean";
                    case 12605:
                        return "rieulsioskorean";
                    case 12606:
                        return "rieulthieuthkorean";
                    case 12607:
                        return "rieulphieuphkorean";
                    case 12608:
                        return "rieulhieuhkorean";
                    case 12609:
                        return "mieumkorean";
                    case 12610:
                        return "pieupkorean";
                    case 12611:
                        return "ssangpieupkorean";
                    case 12612:
                        return "pieupsioskorean";
                    case 12613:
                        return "sioskorean";
                    case 12614:
                        return "ssangsioskorean";
                    case 12615:
                        return "ieungkorean";
                    case 12616:
                        return "cieuckorean";
                    case 12617:
                        return "ssangcieuckorean";
                    case 12618:
                        return "chieuchkorean";
                    case 12619:
                        return "khieukhkorean";
                    case 12620:
                        return "thieuthkorean";
                    case 12621:
                        return "phieuphkorean";
                    case 12622:
                        return "hieuhkorean";
                    case 12623:
                        return "akorean";
                    case 12624:
                        return "aekorean";
                    case 12625:
                        return "yakorean";
                    case 12626:
                        return "yaekorean";
                    case 12627:
                        return "eokorean";
                    case 12628:
                        return "ekorean";
                    case 12629:
                        return "yeokorean";
                    case 12630:
                        return "yekorean";
                    case 12631:
                        return "okorean";
                    case 12632:
                        return "wakorean";
                    case 12633:
                        return "waekorean";
                    case 12634:
                        return "oekorean";
                    case 12635:
                        return "yokorean";
                    case 12636:
                        return "ukorean";
                    case 12637:
                        return "weokorean";
                    case 12638:
                        return "wekorean";
                    case 12639:
                        return "wikorean";
                    case 12640:
                        return "yukorean";
                    case 12641:
                        return "eukorean";
                    case 12642:
                        return "yikorean";
                    case 12643:
                        return "ikorean";
                    case 12644:
                        return "hangulfiller";
                    case 12645:
                        return "ssangnieunkorean";
                    case 12646:
                        return "nieuntikeutkorean";
                    case 12647:
                        return "nieunsioskorean";
                    case 12648:
                        return "nieunpansioskorean";
                    case 12649:
                        return "rieulkiyeoksioskorean";
                    case 12650:
                        return "rieultikeutkorean";
                    case 12651:
                        return "rieulpieupsioskorean";
                    case 12652:
                        return "rieulpansioskorean";
                    case 12653:
                        return "rieulyeorinhieuhkorean";
                    case 12654:
                        return "mieumpieupkorean";
                    case 12655:
                        return "mieumsioskorean";
                    case 12656:
                        return "mieumpansioskorean";
                    case 12657:
                        return "kapyeounmieumkorean";
                    case 12658:
                        return "pieupkiyeokkorean";
                    case 12659:
                        return "pieuptikeutkorean";
                    case 12660:
                        return "pieupsioskiyeokkorean";
                    case 12661:
                        return "pieupsiostikeutkorean";
                    case 12662:
                        return "pieupcieuckorean";
                    case 12663:
                        return "pieupthieuthkorean";
                    case 12664:
                        return "kapyeounpieupkorean";
                    case 12665:
                        return "kapyeounssangpieupkorean";
                    case 12666:
                        return "sioskiyeokkorean";
                    case 12667:
                        return "siosnieunkorean";
                    case 12668:
                        return "siostikeutkorean";
                    case 12669:
                        return "siospieupkorean";
                    case 12670:
                        return "sioscieuckorean";
                    case 12671:
                        return "pansioskorean";
                    case 12672:
                        return "ssangieungkorean";
                    case 12673:
                        return "yesieungkorean";
                    case 12674:
                        return "yesieungsioskorean";
                    case 12675:
                        return "yesieungpansioskorean";
                    case 12676:
                        return "kapyeounphieuphkorean";
                    case 12677:
                        return "ssanghieuhkorean";
                    case 12678:
                        return "yeorinhieuhkorean";
                    case 12679:
                        return "yoyakorean";
                    case 12680:
                        return "yoyaekorean";
                    case 12681:
                        return "yoikorean";
                    case 12682:
                        return "yuyeokorean";
                    case 12683:
                        return "yuyekorean";
                    case 12684:
                        return "yuikorean";
                    case 12685:
                        return "araeakorean";
                    case 12686:
                        return "araeaekorean";
                    case 12800:
                        return "kiyeokparenkorean";
                    case 12801:
                        return "nieunparenkorean";
                    case 12802:
                        return "tikeutparenkorean";
                    case 12803:
                        return "rieulparenkorean";
                    case 12804:
                        return "mieumparenkorean";
                    case 12805:
                        return "pieupparenkorean";
                    case 12806:
                        return "siosparenkorean";
                    case 12807:
                        return "ieungparenkorean";
                    case 12808:
                        return "cieucparenkorean";
                    case 12809:
                        return "chieuchparenkorean";
                    case 12810:
                        return "khieukhparenkorean";
                    case 12811:
                        return "thieuthparenkorean";
                    case 12812:
                        return "phieuphparenkorean";
                    case 12813:
                        return "hieuhparenkorean";
                    case 12814:
                        return "kiyeokaparenkorean";
                    case 12815:
                        return "nieunaparenkorean";
                    case 12816:
                        return "tikeutaparenkorean";
                    case 12817:
                        return "rieulaparenkorean";
                    case 12818:
                        return "mieumaparenkorean";
                    case 12819:
                        return "pieupaparenkorean";
                    case 12820:
                        return "siosaparenkorean";
                    case 12821:
                        return "ieungaparenkorean";
                    case 12822:
                        return "cieucaparenkorean";
                    case 12823:
                        return "chieuchaparenkorean";
                    case 12824:
                        return "khieukhaparenkorean";
                    case 12825:
                        return "thieuthaparenkorean";
                    case 12826:
                        return "phieuphaparenkorean";
                    case 12827:
                        return "hieuhaparenkorean";
                    case 12828:
                        return "cieucuparenkorean";
                    case 12832:
                        return "oneideographicparen";
                    case 12833:
                        return "twoideographicparen";
                    case 12834:
                        return "threeideographicparen";
                    case 12835:
                        return "fourideographicparen";
                    case 12836:
                        return "fiveideographicparen";
                    case 12837:
                        return "sixideographicparen";
                    case 12838:
                        return "sevenideographicparen";
                    case 12839:
                        return "eightideographicparen";
                    case 12840:
                        return "nineideographicparen";
                    case 12841:
                        return "tenideographicparen";
                    case 12842:
                        return "ideographicmoonparen";
                    case 12843:
                        return "ideographicfireparen";
                    case 12844:
                        return "ideographicwaterparen";
                    case 12845:
                        return "ideographicwoodparen";
                    case 12846:
                        return "ideographicmetalparen";
                    case 12847:
                        return "ideographicearthparen";
                    case 12848:
                        return "ideographicsunparen";
                    case 12849:
                        return "ideographicstockparen";
                    case 12850:
                        return "ideographichaveparen";
                    case 12851:
                        return "ideographicsocietyparen";
                    case 12852:
                        return "ideographicnameparen";
                    case 12853:
                        return "ideographicspecialparen";
                    case 12854:
                        return "ideographicfinancialparen";
                    case 12855:
                        return "ideographiccongratulationparen";
                    case 12856:
                        return "ideographiclaborparen";
                    case 12857:
                        return "ideographicrepresentparen";
                    case 12858:
                        return "ideographiccallparen";
                    case 12859:
                        return "ideographicstudyparen";
                    case 12860:
                        return "ideographicsuperviseparen";
                    case 12861:
                        return "ideographicenterpriseparen";
                    case 12862:
                        return "ideographicresourceparen";
                    case 12863:
                        return "ideographicallianceparen";
                    case 12864:
                        return "ideographicfestivalparen";
                    case 12866:
                        return "ideographicselfparen";
                    case 12867:
                        return "ideographicreachparen";
                    case 12896:
                        return "kiyeokcirclekorean";
                    case 12897:
                        return "nieuncirclekorean";
                    case 12898:
                        return "tikeutcirclekorean";
                    case 12899:
                        return "rieulcirclekorean";
                    case 12900:
                        return "mieumcirclekorean";
                    case 12901:
                        return "pieupcirclekorean";
                    case 12902:
                        return "sioscirclekorean";
                    case 12903:
                        return "ieungcirclekorean";
                    case 12904:
                        return "cieuccirclekorean";
                    case 12905:
                        return "chieuchcirclekorean";
                    case 12906:
                        return "khieukhcirclekorean";
                    case 12907:
                        return "thieuthcirclekorean";
                    case 12908:
                        return "phieuphcirclekorean";
                    case 12909:
                        return "hieuhcirclekorean";
                    case 12910:
                        return "kiyeokacirclekorean";
                    case 12911:
                        return "nieunacirclekorean";
                    case 12912:
                        return "tikeutacirclekorean";
                    case 12913:
                        return "rieulacirclekorean";
                    case 12914:
                        return "mieumacirclekorean";
                    case 12915:
                        return "pieupacirclekorean";
                    case 12916:
                        return "siosacirclekorean";
                    case 12917:
                        return "ieungacirclekorean";
                    case 12918:
                        return "cieucacirclekorean";
                    case 12919:
                        return "chieuchacirclekorean";
                    case 12920:
                        return "khieukhacirclekorean";
                    case 12921:
                        return "thieuthacirclekorean";
                    case 12922:
                        return "phieuphacirclekorean";
                    case 12923:
                        return "hieuhacirclekorean";
                    case 12927:
                        return "koreanstandardsymbol";
                    case 12938:
                        return "ideographmooncircle";
                    case 12939:
                        return "ideographfirecircle";
                    case 12940:
                        return "ideographwatercircle";
                    case 12941:
                        return "ideographwoodcircle";
                    case 12942:
                        return "ideographmetalcircle";
                    case 12943:
                        return "ideographearthcircle";
                    case 12944:
                        return "ideographsuncircle";
                    case 12948:
                        return "ideographnamecircle";
                    case 12950:
                        return "ideographicfinancialcircle";
                    case 12952:
                        return "ideographiclaborcircle";
                    case 12953:
                        return "ideographicsecretcircle";
                    case 12957:
                        return "ideographicexcellentcircle";
                    case 12958:
                        return "ideographicprintcircle";
                    case 12963:
                        return "ideographiccorrectcircle";
                    case 12964:
                        return "ideographichighcircle";
                    case 12965:
                        return "ideographiccentrecircle";
                    case 12966:
                        return "ideographiclowcircle";
                    case 12967:
                        return "ideographicleftcircle";
                    case 12968:
                        return "ideographicrightcircle";
                    case 12969:
                        return "ideographicmedicinecircle";
                    case 13056:
                        return "apaatosquare";
                    case 13059:
                        return "aarusquare";
                    case 13061:
                        return "intisquare";
                    case 13069:
                        return "karoriisquare";
                    case 13076:
                        return "kirosquare";
                    case 13077:
                        return "kiroguramusquare";
                    case 13078:
                        return "kiromeetorusquare";
                    case 13080:
                        return "guramusquare";
                    case 13086:
                        return "kooposquare";
                    case 13090:
                        return "sentisquare";
                    case 13091:
                        return "sentosquare";
                    case 13094:
                        return "dorusquare";
                    case 13095:
                        return "tonsquare";
                    case 13098:
                        return "haitusquare";
                    case 13099:
                        return "paasentosquare";
                    case 13105:
                        return "birusquare";
                    case 13107:
                        return "huiitosquare";
                    case 13110:
                        return "hekutaarusquare";
                    case 13113:
                        return "herutusquare";
                    case 13115:
                        return "peezisquare";
                    case 13122:
                        return "hoonsquare";
                    case 13127:
                        return "mansyonsquare";
                    case 13129:
                        return "mirisquare";
                    case 13130:
                        return "miribaarusquare";
                    case 13133:
                        return "meetorusquare";
                    case 13134:
                        return "yaadosquare";
                    case 13137:
                        return "rittorusquare";
                    case 13143:
                        return "wattosquare";
                    case 13179:
                        return "heiseierasquare";
                    case 13180:
                        return "syouwaerasquare";
                    case 13181:
                        return "taisyouerasquare";
                    case 13182:
                        return "meizierasquare";
                    case 13183:
                        return "corporationsquare";
                    case 13184:
                        return "paampssquare";
                    case 13185:
                        return "nasquare";
                    case 13186:
                        return "muasquare";
                    case 13187:
                        return "masquare";
                    case 13188:
                        return "kasquare";
                    case 13189:
                        return "KBsquare";
                    case 13190:
                        return "MBsquare";
                    case 13191:
                        return "GBsquare";
                    case 13192:
                        return "calsquare";
                    case 13193:
                        return "kcalsquare";
                    case 13194:
                        return "pfsquare";
                    case 13195:
                        return "nfsquare";
                    case 13196:
                        return "mufsquare";
                    case 13197:
                        return "mugsquare";
                    case 13198:
                        return "squaremg";
                    case 13199:
                        return "squarekg";
                    case 13200:
                        return "Hzsquare";
                    case 13201:
                        return "khzsquare";
                    case 13202:
                        return "mhzsquare";
                    case 13203:
                        return "ghzsquare";
                    case 13204:
                        return "thzsquare";
                    case 13205:
                        return "mulsquare";
                    case 13206:
                        return "mlsquare";
                    case 13207:
                        return "dlsquare";
                    case 13208:
                        return "klsquare";
                    case 13209:
                        return "fmsquare";
                    case 13210:
                        return "nmsquare";
                    case 13211:
                        return "mumsquare";
                    case 13212:
                        return "squaremm";
                    case 13213:
                        return "squarecm";
                    case 13214:
                        return "squarekm";
                    case 13215:
                        return "mmsquaredsquare";
                    case 13216:
                        return "cmsquaredsquare";
                    case 13217:
                        return "squaremsquared";
                    case 13218:
                        return "kmsquaredsquare";
                    case 13219:
                        return "mmcubedsquare";
                    case 13220:
                        return "cmcubedsquare";
                    case 13221:
                        return "mcubedsquare";
                    case 13222:
                        return "kmcubedsquare";
                    case 13223:
                        return "moverssquare";
                    case 13224:
                        return "moverssquaredsquare";
                    case 13225:
                        return "pasquare";
                    case 13226:
                        return "kpasquare";
                    case 13227:
                        return "mpasquare";
                    case 13228:
                        return "gpasquare";
                    case 13229:
                        return "radsquare";
                    case 13230:
                        return "radoverssquare";
                    case 13231:
                        return "radoverssquaredsquare";
                    case 13232:
                        return "pssquare";
                    case 13233:
                        return "nssquare";
                    case 13234:
                        return "mussquare";
                    case 13235:
                        return "mssquare";
                    case 13236:
                        return "pvsquare";
                    case 13237:
                        return "nvsquare";
                    case 13238:
                        return "muvsquare";
                    case 13239:
                        return "mvsquare";
                    case 13240:
                        return "kvsquare";
                    case 13241:
                        return "mvmegasquare";
                    case 13242:
                        return "pwsquare";
                    case 13243:
                        return "nwsquare";
                    case 13244:
                        return "muwsquare";
                    case 13245:
                        return "mwsquare";
                    case 13246:
                        return "kwsquare";
                    case 13247:
                        return "mwmegasquare";
                    case 13248:
                        return "kohmsquare";
                    case 13249:
                        return "mohmsquare";
                    case 13250:
                        return "amsquare";
                    case 13251:
                        return "bqsquare";
                    case 13252:
                        return "squarecc";
                    case 13253:
                        return "cdsquare";
                    case 13254:
                        return "coverkgsquare";
                    case 13255:
                        return "cosquare";
                    case 13256:
                        return "dbsquare";
                    case 13257:
                        return "gysquare";
                    case 13258:
                        return "hasquare";
                    case 13259:
                        return "HPsquare";
                    case 13261:
                        return "KKsquare";
                    case 13262:
                        return "squarekmcapital";
                    case 13263:
                        return "ktsquare";
                    case 13264:
                        return "lmsquare";
                    case 13265:
                        return "squareln";
                    case 13266:
                        return "squarelog";
                    case 13267:
                        return "lxsquare";
                    case 13268:
                        return "mbsquare";
                    case 13269:
                        return "squaremil";
                    case 13270:
                        return "molsquare";
                    case 13272:
                        return "pmsquare";
                    case 13275:
                        return "srsquare";
                    case 13276:
                        return "svsquare";
                    case 13277:
                        return "wbsquare";
                    case 21316:
                        return "twentyhangzhou";
                    case 63166:
                        return "dotlessj";
                    case 63167:
                        return "LL";
                    case 63168:
                        return "ll";
                    case 63171:
                        return "commaaccent";
                    case 63172:
                        return "afii10063";
                    case 63173:
                        return "afii10064";
                    case 63174:
                        return "afii10192";
                    case 63175:
                        return "afii10831";
                    case 63176:
                        return "afii10832";
                    case 63177:
                        return "Acute";
                    case 63178:
                        return "Caron";
                    case 63179:
                        return "Dieresis";
                    case 63180:
                        return "DieresisAcute";
                    case 63181:
                        return "DieresisGrave";
                    case 63182:
                        return "Grave";
                    case 63183:
                        return "Hungarumlaut";
                    case 63184:
                        return "Macron";
                    case 63185:
                        return "cyrBreve";
                    case 63186:
                        return "cyrFlex";
                    case 63187:
                        return "dblGrave";
                    case 63188:
                        return "cyrbreve";
                    case 63189:
                        return "cyrflex";
                    case 63190:
                        return "dblgrave";
                    case 63191:
                        return "dieresisacute";
                    case 63192:
                        return "dieresisgrave";
                    case 63193:
                        return "copyrightserif";
                    case 63194:
                        return "registerserif";
                    case 63195:
                        return "trademarkserif";
                    case 63196:
                        return "onefitted";
                    case 63197:
                        return "rupiah";
                    case 63198:
                        return "threequartersemdash";
                    case 63199:
                        return "centinferior";
                    case 63200:
                        return "centsuperior";
                    case 63201:
                        return "commainferior";
                    case 63202:
                        return "commasuperior";
                    case 63203:
                        return "dollarinferior";
                    case 63204:
                        return "dollarsuperior";
                    case 63205:
                        return "hypheninferior";
                    case 63206:
                        return "hyphensuperior";
                    case 63207:
                        return "periodinferior";
                    case 63208:
                        return "periodsuperior";
                    case 63209:
                        return "asuperior";
                    case 63210:
                        return "bsuperior";
                    case 63211:
                        return "dsuperior";
                    case 63212:
                        return "esuperior";
                    case 63213:
                        return "isuperior";
                    case 63214:
                        return "lsuperior";
                    case 63215:
                        return "msuperior";
                    case 63216:
                        return "osuperior";
                    case 63217:
                        return "rsuperior";
                    case 63218:
                        return "ssuperior";
                    case 63219:
                        return "tsuperior";
                    case 63220:
                        return "Brevesmall";
                    case 63221:
                        return "Caronsmall";
                    case 63222:
                        return "Circumflexsmall";
                    case 63223:
                        return "Dotaccentsmall";
                    case 63224:
                        return "Hungarumlautsmall";
                    case 63225:
                        return "Lslashsmall";
                    case 63226:
                        return "OEsmall";
                    case 63227:
                        return "Ogoneksmall";
                    case 63228:
                        return "Ringsmall";
                    case 63229:
                        return "Scaronsmall";
                    case 63230:
                        return "Tildesmall";
                    case 63231:
                        return "Zcaronsmall";
                    case 63265:
                        return "exclamsmall";
                    case 63268:
                        return "dollaroldstyle";
                    case 63270:
                        return "ampersandsmall";
                    case 63280:
                        return "zerooldstyle";
                    case 63281:
                        return "oneoldstyle";
                    case 63282:
                        return "twooldstyle";
                    case 63283:
                        return "threeoldstyle";
                    case 63284:
                        return "fouroldstyle";
                    case 63285:
                        return "fiveoldstyle";
                    case 63286:
                        return "sixoldstyle";
                    case 63287:
                        return "sevenoldstyle";
                    case 63288:
                        return "eightoldstyle";
                    case 63289:
                        return "nineoldstyle";
                    case 63295:
                        return "questionsmall";
                    case 63328:
                        return "Gravesmall";
                    case 63329:
                        return "Asmall";
                    case 63330:
                        return "Bsmall";
                    case 63331:
                        return "Csmall";
                    case 63332:
                        return "Dsmall";
                    case 63333:
                        return "Esmall";
                    case 63334:
                        return "Fsmall";
                    case 63335:
                        return "Gsmall";
                    case 63336:
                        return "Hsmall";
                    case 63337:
                        return "Ismall";
                    case 63338:
                        return "Jsmall";
                    case 63339:
                        return "Ksmall";
                    case 63340:
                        return "Lsmall";
                    case 63341:
                        return "Msmall";
                    case 63342:
                        return "Nsmall";
                    case 63343:
                        return "Osmall";
                    case 63344:
                        return "Psmall";
                    case 63345:
                        return "Qsmall";
                    case 63346:
                        return "Rsmall";
                    case 63347:
                        return "Ssmall";
                    case 63348:
                        return "Tsmall";
                    case 63349:
                        return "Usmall";
                    case 63350:
                        return "Vsmall";
                    case 63351:
                        return "Wsmall";
                    case 63352:
                        return "Xsmall";
                    case 63353:
                        return "Ysmall";
                    case 63354:
                        return "Zsmall";
                    case 63393:
                        return "exclamdownsmall";
                    case 63394:
                        return "centoldstyle";
                    case 63400:
                        return "Dieresissmall";
                    case 63407:
                        return "Macronsmall";
                    case 63412:
                        return "Acutesmall";
                    case 63416:
                        return "Cedillasmall";
                    case 63423:
                        return "questiondownsmall";
                    case 63456:
                        return "Agravesmall";
                    case 63457:
                        return "Aacutesmall";
                    case 63458:
                        return "Acircumflexsmall";
                    case 63459:
                        return "Atildesmall";
                    case 63460:
                        return "Adieresissmall";
                    case 63461:
                        return "Aringsmall";
                    case 63462:
                        return "AEsmall";
                    case 63463:
                        return "Ccedillasmall";
                    case 63464:
                        return "Egravesmall";
                    case 63465:
                        return "Eacutesmall";
                    case 63466:
                        return "Ecircumflexsmall";
                    case 63467:
                        return "Edieresissmall";
                    case 63468:
                        return "Igravesmall";
                    case 63469:
                        return "Iacutesmall";
                    case 63470:
                        return "Icircumflexsmall";
                    case 63471:
                        return "Idieresissmall";
                    case 63472:
                        return "Ethsmall";
                    case 63473:
                        return "Ntildesmall";
                    case 63474:
                        return "Ogravesmall";
                    case 63475:
                        return "Oacutesmall";
                    case 63476:
                        return "Ocircumflexsmall";
                    case 63477:
                        return "Otildesmall";
                    case 63478:
                        return "Odieresissmall";
                    case 63480:
                        return "Oslashsmall";
                    case 63481:
                        return "Ugravesmall";
                    case 63482:
                        return "Uacutesmall";
                    case 63483:
                        return "Ucircumflexsmall";
                    case 63484:
                        return "Udieresissmall";
                    case 63485:
                        return "Yacutesmall";
                    case 63486:
                        return "Thornsmall";
                    case 63487:
                        return "Ydieresissmall";
                    case 63620:
                        return "maihanakatleftthai";
                    case 63621:
                        return "saraileftthai";
                    case 63622:
                        return "saraiileftthai";
                    case 63623:
                        return "saraueleftthai";
                    case 63624:
                        return "saraueeleftthai";
                    case 63625:
                        return "maitaikhuleftthai";
                    case 63626:
                        return "maiekupperleftthai";
                    case 63627:
                        return "maieklowrightthai";
                    case 63628:
                        return "maieklowleftthai";
                    case 63629:
                        return "maithoupperleftthai";
                    case 63630:
                        return "maitholowrightthai";
                    case 63631:
                        return "maitholowleftthai";
                    case 63632:
                        return "maitriupperleftthai";
                    case 63633:
                        return "maitrilowrightthai";
                    case 63634:
                        return "maitrilowleftthai";
                    case 63635:
                        return "maichattawaupperleftthai";
                    case 63636:
                        return "maichattawalowrightthai";
                    case 63637:
                        return "maichattawalowleftthai";
                    case 63638:
                        return "thanthakhatupperleftthai";
                    case 63639:
                        return "thanthakhatlowrightthai";
                    case 63640:
                        return "thanthakhatlowleftthai";
                    case 63641:
                        return "nikhahitleftthai";
                    case 63717:
                        return "radicalex";
                    case 63718:
                        return "arrowvertex";
                    case 63719:
                        return "arrowhorizex";
                    case 63720:
                        return "registersans";
                    case 63721:
                        return "copyrightsans";
                    case 63722:
                        return "trademarksans";
                    case 63723:
                        return "parenlefttp";
                    case 63724:
                        return "parenleftex";
                    case 63725:
                        return "parenleftbt";
                    case 63726:
                        return "bracketlefttp";
                    case 63727:
                        return "bracketleftex";
                    case 63728:
                        return "bracketleftbt";
                    case 63729:
                        return "bracelefttp";
                    case 63730:
                        return "braceleftmid";
                    case 63731:
                        return "braceleftbt";
                    case 63732:
                        return "braceex";
                    case 63733:
                        return "integralex";
                    case 63734:
                        return "parenrighttp";
                    case 63735:
                        return "parenrightex";
                    case 63736:
                        return "parenrightbt";
                    case 63737:
                        return "bracketrighttp";
                    case 63738:
                        return "bracketrightex";
                    case 63739:
                        return "bracketrightbt";
                    case 63740:
                        return "bracerighttp";
                    case 63741:
                        return "bracerightmid";
                    case 63742:
                        return "bracerightbt";
                    case 63743:
                        return "apple";
                    case 64256:
                        return "ff";
                    case 64257:
                        return TranslateLanguage.FINNISH;
                    case 64258:
                        return "fl";
                    case 64259:
                        return "ffi";
                    case 64260:
                        return "ffl";
                    case 64287:
                        return "afii57705";
                    case 64288:
                        return "ayinaltonehebrew";
                    case 64298:
                        return "afii57694";
                    case 64299:
                        return "afii57695";
                    case 64300:
                        return "shindageshshindot";
                    case 64301:
                        return "shindageshsindot";
                    case 64302:
                        return "alefpatahhebrew";
                    case 64303:
                        return "alefqamatshebrew";
                    case 64304:
                        return "alefdageshhebrew";
                    case 64305:
                        return "betdagesh";
                    case 64306:
                        return "gimeldagesh";
                    case 64307:
                        return "daletdagesh";
                    case 64308:
                        return "hedagesh";
                    case 64309:
                        return "afii57723";
                    case 64310:
                        return "zayindagesh";
                    case 64312:
                        return "tetdagesh";
                    case 64313:
                        return "yoddagesh";
                    case 64314:
                        return "finalkafdagesh";
                    case 64315:
                        return "kafdagesh";
                    case 64316:
                        return "lameddagesh";
                    case 64318:
                        return "memdagesh";
                    case 64320:
                        return "nundagesh";
                    case 64321:
                        return "samekhdagesh";
                    case 64323:
                        return "pefinaldageshhebrew";
                    case 64324:
                        return "pedagesh";
                    case 64326:
                        return "tsadidagesh";
                    case 64327:
                        return "qofdagesh";
                    case 64328:
                        return "reshdageshhebrew";
                    case 64329:
                        return "shindagesh";
                    case 64330:
                        return "tavdages";
                    case 64331:
                        return "afii57700";
                    case 64332:
                        return "betrafehebrew";
                    case 64333:
                        return "kafrafehebrew";
                    case 64334:
                        return "perafehebrew";
                    case 64335:
                        return "aleflamedhebrew";
                    case 64343:
                        return "pehfinalarabic";
                    case 64344:
                        return "pehinitialarabic";
                    case 64345:
                        return "pehmedialarabic";
                    case 64359:
                        return "ttehfinalarabic";
                    case 64360:
                        return "ttehinitialarabic";
                    case 64361:
                        return "ttehmedialarabic";
                    case 64363:
                        return "vehfinalarabic";
                    case 64364:
                        return "vehinitialarabic";
                    case 64365:
                        return "vehmedialarabic";
                    case 64379:
                        return "tchehfinalarabic";
                    case 64380:
                        return "tchehinitialarabic";
                    case 64381:
                        return "tchehmedialarabic";
                    case 64393:
                        return "ddalfinalarabic";
                    case 64395:
                        return "jehfinalarabic";
                    case 64397:
                        return "rrehfinalarabic";
                    case 64403:
                        return "gaffinalarabic";
                    case 64404:
                        return "gafinitialarabic";
                    case 64405:
                        return "gafmedialarabic";
                    case 64415:
                        return "noonghunnafinalarabic";
                    case 64420:
                        return "hehhamzaaboveisolatedarabic";
                    case 64421:
                        return "hehhamzaabovefinalarabic";
                    case 64423:
                        return "hehfinalaltonearabic";
                    case 64424:
                        return "hehinitialaltonearabic";
                    case 64425:
                        return "hehmedialaltonearabic";
                    case 64431:
                        return "yehbarreefinalarabic";
                    case 64520:
                        return "behmeemisolatedarabic";
                    case 64523:
                        return "tehjeemisolatedarabic";
                    case 64524:
                        return "tehhahisolatedarabic";
                    case 64526:
                        return "tehmeemisolatedarabic";
                    case 64584:
                        return "meemmeemisolatedarabic";
                    case 64587:
                        return "noonjeemisolatedarabic";
                    case 64590:
                        return "noonmeemisolatedarabic";
                    case 64600:
                        return "yehmeemisolatedarabic";
                    case 64606:
                        return "shaddadammatanarabic";
                    case 64607:
                        return "shaddakasratanarabic";
                    case 64608:
                        return "shaddafathaarabic";
                    case 64609:
                        return "shaddadammaarabic";
                    case 64610:
                        return "shaddakasraarabic";
                    case 64621:
                        return "behnoonfinalarabic";
                    case 64627:
                        return "tehnoonfinalarabic";
                    case 64653:
                        return "noonnoonfinalarabic";
                    case 64660:
                        return "yehnoonfinalarabic";
                    case 64671:
                        return "behmeeminitialarabic";
                    case 64673:
                        return "tehjeeminitialarabic";
                    case 64674:
                        return "tehhahinitialarabic";
                    case 64676:
                        return "tehmeeminitialarabic";
                    case 64713:
                        return "lamjeeminitialarabic";
                    case 64714:
                        return "lamhahinitialarabic";
                    case 64715:
                        return "lamkhahinitialarabic";
                    case 64716:
                        return "lammeeminitialarabic";
                    case 64721:
                        return "meemmeeminitialarabic";
                    case 64722:
                        return "noonjeeminitialarabic";
                    case 64725:
                        return "noonmeeminitialarabic";
                    case 64733:
                        return "yehmeeminitialarabic";
                    case 64830:
                        return "parenleftaltonearabic";
                    case 64831:
                        return "parenrightaltonearabic";
                    case 64904:
                        return "lammeemhahinitialarabic";
                    case 65010:
                        return "lamlamhehisolatedarabic";
                    case 65018:
                        return "sallallahoualayhewasallamarabic";
                    case 65072:
                        return "twodotleadervertical";
                    case 65073:
                        return "emdashvertical";
                    case 65074:
                        return "endashvertical";
                    case 65075:
                        return "underscorevertical";
                    case 65076:
                        return "wavyunderscorevertical";
                    case 65077:
                        return "parenleftvertical";
                    case 65078:
                        return "parenrightvertical";
                    case 65079:
                        return "braceleftvertical";
                    case 65080:
                        return "bracerightvertical";
                    case 65081:
                        return "tortoiseshellbracketleftvertical";
                    case 65082:
                        return "tortoiseshellbracketrightvertical";
                    case 65083:
                        return "blacklenticularbracketleftvertical";
                    case 65084:
                        return "blacklenticularbracketrightvertical";
                    case 65085:
                        return "dblanglebracketleftvertical";
                    case 65086:
                        return "dblanglebracketrightvertical";
                    case 65087:
                        return "anglebracketleftvertical";
                    case 65088:
                        return "anglebracketrightvertical";
                    case 65089:
                        return "cornerbracketleftvertical";
                    case 65090:
                        return "cornerbracketrightvertical";
                    case 65091:
                        return "whitecornerbracketleftvertical";
                    case 65092:
                        return "whitecornerbracketrightvertical";
                    case 65097:
                        return "overlinedashed";
                    case 65098:
                        return "overlinecenterline";
                    case 65099:
                        return "overlinewavy";
                    case 65100:
                        return "overlinedblwavy";
                    case 65101:
                        return "lowlinedashed";
                    case 65102:
                        return "lowlinecenterline";
                    case 65103:
                        return "underscorewavy";
                    case 65104:
                        return "commasmall";
                    case 65106:
                        return "periodsmall";
                    case 65108:
                        return "semicolonsmall";
                    case 65109:
                        return "colonsmall";
                    case 65113:
                        return "parenleftsmall";
                    case 65114:
                        return "parenrightsmall";
                    case 65115:
                        return "braceleftsmall";
                    case 65116:
                        return "bracerightsmall";
                    case 65117:
                        return "tortoiseshellbracketleftsmall";
                    case 65118:
                        return "tortoiseshellbracketrightsmall";
                    case 65119:
                        return "numbersignsmall";
                    case 65121:
                        return "asterisksmall";
                    case 65122:
                        return "plussmall";
                    case 65123:
                        return "hyphensmall";
                    case 65124:
                        return "lesssmall";
                    case 65125:
                        return "greatersmall";
                    case 65126:
                        return "equalsmall";
                    case 65129:
                        return "dollarsmall";
                    case 65130:
                        return "percentsmall";
                    case 65131:
                        return "atsmall";
                    case 65154:
                        return "alefmaddaabovefinalarabic";
                    case 65156:
                        return "alefhamzaabovefinalarabic";
                    case 65158:
                        return "wawhamzaabovefinalarabic";
                    case 65160:
                        return "alefhamzabelowfinalarabic";
                    case 65162:
                        return "yehhamzaabovefinalarabic";
                    case 65163:
                        return "yehhamzaaboveinitialarabic";
                    case 65164:
                        return "yehhamzaabovemedialarabic";
                    case 65166:
                        return "aleffinalarabic";
                    case 65168:
                        return "behfinalarabic";
                    case 65169:
                        return "behinitialarabic";
                    case 65170:
                        return "behmedialarabic";
                    case 65172:
                        return "tehmarbutafinalarabic";
                    case 65174:
                        return "tehfinalarabic";
                    case 65175:
                        return "tehinitialarabic";
                    case 65176:
                        return "tehmedialarabic";
                    case 65178:
                        return "thehfinalarabic";
                    case 65179:
                        return "thehinitialarabic";
                    case 65180:
                        return "thehmedialarabic";
                    case 65182:
                        return "jeemfinalarabic";
                    case 65183:
                        return "jeeminitialarabic";
                    case 65184:
                        return "jeemmedialarabic";
                    case 65186:
                        return "hahfinalarabic";
                    case 65187:
                        return "hahinitialarabic";
                    case 65188:
                        return "hahmedialarabic";
                    case 65190:
                        return "khahfinalarabic";
                    case 65191:
                        return "khahinitialarabic";
                    case 65192:
                        return "khahmedialarabic";
                    case 65194:
                        return "dalfinalarabic";
                    case 65196:
                        return "thalfinalarabic";
                    case 65198:
                        return "rehfinalarabic";
                    case 65200:
                        return "zainfinalarabic";
                    case 65202:
                        return "seenfinalarabic";
                    case 65203:
                        return "seeninitialarabic";
                    case 65204:
                        return "seenmedialarabic";
                    case 65206:
                        return "sheenfinalarabic";
                    case 65207:
                        return "sheeninitialarabic";
                    case 65208:
                        return "sheenmedialarabic";
                    case 65210:
                        return "sadfinalarabic";
                    case 65211:
                        return "sadinitialarabic";
                    case 65212:
                        return "sadmedialarabic";
                    case 65214:
                        return "dadfinalarabic";
                    case 65215:
                        return "dadinitialarabic";
                    case 65216:
                        return "dadmedialarabic";
                    case 65218:
                        return "tahfinalarabic";
                    case 65219:
                        return "tahinitialarabic";
                    case 65220:
                        return "tahmedialarabic";
                    case 65222:
                        return "zahfinalarabic";
                    case 65223:
                        return "zahinitialarabic";
                    case 65224:
                        return "zahmedialarabic";
                    case 65226:
                        return "ainfinalarabic";
                    case 65227:
                        return "aininitialarabic";
                    case 65228:
                        return "ainmedialarabic";
                    case 65230:
                        return "ghainfinalarabic";
                    case 65231:
                        return "ghaininitialarabic";
                    case 65232:
                        return "ghainmedialarabic";
                    case 65234:
                        return "fehfinalarabic";
                    case 65235:
                        return "fehinitialarabic";
                    case 65236:
                        return "fehmedialarabic";
                    case 65238:
                        return "qaffinalarabic";
                    case 65239:
                        return "qafinitialarabic";
                    case 65240:
                        return "qafmedialarabic";
                    case 65242:
                        return "kaffinalarabic";
                    case 65243:
                        return "kafinitialarabic";
                    case 65244:
                        return "kafmedialarabic";
                    case 65246:
                        return "lamfinalarabic";
                    case 65247:
                        return "laminitialarabic";
                    case 65248:
                        return "lammedialarabic";
                    case 65250:
                        return "meemfinalarabic";
                    case 65251:
                        return "meeminitialarabic";
                    case 65252:
                        return "lammeemjeeminitialarabic";
                    case 65254:
                        return "noonfinalarabic";
                    case 65255:
                        return "noonhehinitialarabic";
                    case 65256:
                        return "noonmedialarabic";
                    case 65258:
                        return "hehfinalalttwoarabic";
                    case 65259:
                        return "hehinitialarabic";
                    case 65260:
                        return "hehmedialarabic";
                    case 65262:
                        return "wawfinalarabic";
                    case 65264:
                        return "alefmaksurafinalarabic";
                    case 65266:
                        return "yehfinalarabic";
                    case 65267:
                        return "alefmaksurainitialarabic";
                    case 65268:
                        return "alefmaksuramedialarabic";
                    case 65269:
                        return "lamalefmaddaaboveisolatedarabic";
                    case 65270:
                        return "lamalefmaddaabovefinalarabic";
                    case 65271:
                        return "lamalefhamzaaboveisolatedarabic";
                    case 65272:
                        return "lamalefhamzaabovefinalarabic";
                    case 65273:
                        return "lamalefhamzabelowisolatedarabic";
                    case 65274:
                        return "lamalefhamzabelowfinalarabic";
                    case 65275:
                        return "lamalefisolatedarabic";
                    case 65276:
                        return "lamaleffinalarabic";
                    case 65279:
                        return "zerowidthjoiner";
                    case 65281:
                        return "exclammonospace";
                    case 65282:
                        return "quotedblmonospace";
                    case 65283:
                        return "numbersignmonospace";
                    case 65284:
                        return "dollarmonospace";
                    case 65285:
                        return "percentmonospace";
                    case 65286:
                        return "ampersandmonospace";
                    case 65287:
                        return "quotesinglemonospace";
                    case 65288:
                        return "parenleftmonospace";
                    case 65289:
                        return "parenrightmonospace";
                    case 65290:
                        return "asteriskmonospace";
                    case 65291:
                        return "plusmonospace";
                    case 65292:
                        return "commamonospace";
                    case 65293:
                        return "hyphenmonospace";
                    case 65294:
                        return "periodmonospace";
                    case 65295:
                        return "slashmonospace";
                    case 65296:
                        return "zeromonospace";
                    case 65297:
                        return "onemonospace";
                    case 65298:
                        return "twomonospace";
                    case 65299:
                        return "threemonospace";
                    case 65300:
                        return "fourmonospace";
                    case 65301:
                        return "fivemonospace";
                    case 65302:
                        return "sixmonospace";
                    case 65303:
                        return "sevenmonospace";
                    case 65304:
                        return "eightmonospace";
                    case 65305:
                        return "ninemonospace";
                    case 65306:
                        return "colonmonospace";
                    case 65307:
                        return "semicolonmonospace";
                    case 65308:
                        return "lessmonospace";
                    case 65309:
                        return "equalmonospace";
                    case 65310:
                        return "greatermonospace";
                    case 65311:
                        return "questionmonospace";
                    case 65312:
                        return "atmonospace";
                    case 65313:
                        return "Amonospace";
                    case 65314:
                        return "Bmonospace";
                    case 65315:
                        return "Cmonospace";
                    case 65316:
                        return "Dmonospace";
                    case 65317:
                        return "Emonospace";
                    case 65318:
                        return "Fmonospace";
                    case 65319:
                        return "Gmonospace";
                    case 65320:
                        return "Hmonospace";
                    case 65321:
                        return "Imonospace";
                    case 65322:
                        return "Jmonospace";
                    case 65323:
                        return "Kmonospace";
                    case 65324:
                        return "Lmonospace";
                    case 65325:
                        return "Mmonospace";
                    case 65326:
                        return "Nmonospace";
                    case 65327:
                        return "Omonospace";
                    case 65328:
                        return "Pmonospace";
                    case 65329:
                        return "Qmonospace";
                    case 65330:
                        return "Rmonospace";
                    case 65331:
                        return "Smonospace";
                    case 65332:
                        return "Tmonospace";
                    case 65333:
                        return "Umonospace";
                    case 65334:
                        return "Vmonospace";
                    case 65335:
                        return "Wmonospace";
                    case 65336:
                        return "Xmonospace";
                    case 65337:
                        return "Ymonospace";
                    case 65338:
                        return "Zmonospace";
                    case 65339:
                        return "bracketleftmonospace";
                    case 65340:
                        return "backslashmonospace";
                    case 65341:
                        return "bracketrightmonospace";
                    case 65342:
                        return "asciicircummonospace";
                    case 65343:
                        return "underscoremonospace";
                    case 65344:
                        return "gravemonospace";
                    case 65345:
                        return "amonospace";
                    case 65346:
                        return "bmonospace";
                    case 65347:
                        return "cmonospace";
                    case 65348:
                        return "dmonospace";
                    case 65349:
                        return "emonospace";
                    case 65350:
                        return "fmonospace";
                    case 65351:
                        return "gmonospace";
                    case 65352:
                        return "hmonospace";
                    case 65353:
                        return "imonospace";
                    case 65354:
                        return "jmonospace";
                    case 65355:
                        return "kmonospace";
                    case 65356:
                        return "lmonospace";
                    case 65357:
                        return "mmonospace";
                    case 65358:
                        return "nmonospace";
                    case 65359:
                        return "omonospace";
                    case 65360:
                        return "pmonospace";
                    case 65361:
                        return "qmonospace";
                    case 65362:
                        return "rmonospace";
                    case 65363:
                        return "smonospace";
                    case 65364:
                        return "tmonospace";
                    case 65365:
                        return "umonospace";
                    case 65366:
                        return "vmonospace";
                    case 65367:
                        return "wmonospace";
                    case 65368:
                        return "xmonospace";
                    case 65369:
                        return "ymonospace";
                    case 65370:
                        return "zmonospace";
                    case 65371:
                        return "braceleftmonospace";
                    case 65372:
                        return "barmonospace";
                    case 65373:
                        return "bracerightmonospace";
                    case 65374:
                        return "asciitildemonospace";
                    case 65377:
                        return "periodhalfwidth";
                    case 65378:
                        return "cornerbracketlefthalfwidth";
                    case 65379:
                        return "cornerbracketrighthalfwidth";
                    case 65380:
                        return "ideographiccommaleft";
                    case 65381:
                        return "middledotkatakanahalfwidth";
                    case 65382:
                        return "wokatakanahalfwidth";
                    case 65383:
                        return "asmallkatakanahalfwidth";
                    case 65384:
                        return "ismallkatakanahalfwidth";
                    case 65385:
                        return "usmallkatakanahalfwidth";
                    case 65386:
                        return "esmallkatakanahalfwidth";
                    case 65387:
                        return "osmallkatakanahalfwidth";
                    case 65388:
                        return "yasmallkatakanahalfwidth";
                    case 65389:
                        return "yusmallkatakanahalfwidth";
                    case 65390:
                        return "yosmallkatakanahalfwidth";
                    case 65391:
                        return "tusmallkatakanahalfwidth";
                    case 65392:
                        return "katahiraprolongmarkhalfwidth";
                    case 65393:
                        return "akatakanahalfwidth";
                    case 65394:
                        return "ikatakanahalfwidth";
                    case 65395:
                        return "ukatakanahalfwidth";
                    case 65396:
                        return "ekatakanahalfwidth";
                    case 65397:
                        return "okatakanahalfwidth";
                    case 65398:
                        return "kakatakanahalfwidth";
                    case 65399:
                        return "kikatakanahalfwidth";
                    case 65400:
                        return "kukatakanahalfwidth";
                    case 65401:
                        return "kekatakanahalfwidth";
                    case 65402:
                        return "kokatakanahalfwidth";
                    case 65403:
                        return "sakatakanahalfwidth";
                    case 65404:
                        return "sikatakanahalfwidth";
                    case 65405:
                        return "sukatakanahalfwidth";
                    case 65406:
                        return "sekatakanahalfwidth";
                    case 65407:
                        return "sokatakanahalfwidth";
                    case 65408:
                        return "takatakanahalfwidth";
                    case 65409:
                        return "tikatakanahalfwidth";
                    case 65410:
                        return "tukatakanahalfwidth";
                    case 65411:
                        return "tekatakanahalfwidth";
                    case 65412:
                        return "tokatakanahalfwidth";
                    case 65413:
                        return "nakatakanahalfwidth";
                    case 65414:
                        return "nikatakanahalfwidth";
                    case 65415:
                        return "nukatakanahalfwidth";
                    case 65416:
                        return "nekatakanahalfwidth";
                    case 65417:
                        return "nokatakanahalfwidth";
                    case 65418:
                        return "hakatakanahalfwidth";
                    case 65419:
                        return "hikatakanahalfwidth";
                    case 65420:
                        return "hukatakanahalfwidth";
                    case 65421:
                        return "hekatakanahalfwidth";
                    case 65422:
                        return "hokatakanahalfwidth";
                    case 65423:
                        return "makatakanahalfwidth";
                    case 65424:
                        return "mikatakanahalfwidth";
                    case 65425:
                        return "mukatakanahalfwidth";
                    case 65426:
                        return "mekatakanahalfwidth";
                    case 65427:
                        return "mokatakanahalfwidth";
                    case 65428:
                        return "yakatakanahalfwidth";
                    case 65429:
                        return "yukatakanahalfwidth";
                    case 65430:
                        return "yokatakanahalfwidth";
                    case 65431:
                        return "rakatakanahalfwidth";
                    case 65432:
                        return "rikatakanahalfwidth";
                    case 65433:
                        return "rukatakanahalfwidth";
                    case 65434:
                        return "rekatakanahalfwidth";
                    case 65435:
                        return "rokatakanahalfwidth";
                    case 65436:
                        return "wakatakanahalfwidth";
                    case 65437:
                        return "nkatakanahalfwidth";
                    case 65438:
                        return "voicedmarkkanahalfwidth";
                    case 65439:
                        return "semivoicedmarkkanahalfwidth";
                    case 65504:
                        return "centmonospace";
                    case 65505:
                        return "sterlingmonospace";
                    case 65507:
                        return "macronmonospace";
                    case 65509:
                        return "yenmonospace";
                    case 65510:
                        return "wonmonospace";
                    default:
                        switch (c) {
                            case 506:
                                return "Aringacute";
                            case 507:
                                return "aringacute";
                            case 508:
                                return "AEacute";
                            case 509:
                                return "aeacute";
                            case 510:
                                return "Oslashacute";
                            case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                                return "oslashacute";
                            case 512:
                                return "Adblgrave";
                            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                                return "adblgrave";
                            case 514:
                                return "Ainvertedbreve";
                            case 515:
                                return "ainvertedbreve";
                            case 516:
                                return "Edblgrave";
                            case 517:
                                return "edblgrave";
                            case 518:
                                return "Einvertedbreve";
                            case 519:
                                return "einvertedbreve";
                            case 520:
                                return "Idblgrave";
                            case 521:
                                return "idblgrave";
                            case 522:
                                return "Iinvertedbreve";
                            case 523:
                                return "iinvertedbreve";
                            case 524:
                                return "Odblgrave";
                            case 525:
                                return "odblgrave";
                            case 526:
                                return "Oinvertedbreve";
                            case 527:
                                return "oinvertedbreve";
                            case 528:
                                return "Rdblgrave";
                            case 529:
                                return "rdblgrave";
                            case 530:
                                return "Rinvertedbreve";
                            case 531:
                                return "rinvertedbreve";
                            case 532:
                                return "Udblgrave";
                            case 533:
                                return "udblgrave";
                            case 534:
                                return "Uinvertedbreve";
                            case 535:
                                return "uinvertedbreve";
                            case 536:
                                return "Scommaaccent";
                            case 537:
                                return "scommaaccent";
                            default:
                                switch (c) {
                                    case 592:
                                        return "aturned";
                                    case 593:
                                        return "ascript";
                                    case 594:
                                        return "ascriptturned";
                                    case 595:
                                        return "bhook";
                                    case 596:
                                        return "oopen";
                                    case 597:
                                        return "ccurl";
                                    case 598:
                                        return "dtail";
                                    case 599:
                                        return "dhook";
                                    case 600:
                                        return "ereversed";
                                    case 601:
                                        return "schwa";
                                    case 602:
                                        return "schwahook";
                                    case 603:
                                        return "eopen";
                                    case 604:
                                        return "eopenreversed";
                                    case 605:
                                        return "eopenreversedhook";
                                    case 606:
                                        return "eopenreversedclosed";
                                    case 607:
                                        return "jdotlessstroke";
                                    case 608:
                                        return "ghook";
                                    case 609:
                                        return "gscript";
                                    default:
                                        switch (c) {
                                            case 611:
                                                return "gammalatinsmall";
                                            case 612:
                                                return "ramshorn";
                                            case 613:
                                                return "hturned";
                                            case 614:
                                                return "hhook";
                                            case 615:
                                                return "henghook";
                                            case 616:
                                                return "istroke";
                                            case 617:
                                                return "iotalatin";
                                            default:
                                                switch (c) {
                                                    case 619:
                                                        return "lmiddletilde";
                                                    case 620:
                                                        return "lbelt";
                                                    case 621:
                                                        return "lhookretroflex";
                                                    case 622:
                                                        return "lezh";
                                                    case 623:
                                                        return "mturned";
                                                    case 624:
                                                        return "mlonglegturned";
                                                    case 625:
                                                        return "mhook";
                                                    case 626:
                                                        return "nhookleft";
                                                    case 627:
                                                        return "nhookretroflex";
                                                    default:
                                                        switch (c) {
                                                            case 631:
                                                                return "omegalatinclosed";
                                                            case 632:
                                                                return "philatin";
                                                            case 633:
                                                                return "rturned";
                                                            case 634:
                                                                return "rlonglegturned";
                                                            case 635:
                                                                return "rhookturned";
                                                            case 636:
                                                                return "rlongleg";
                                                            case 637:
                                                                return "rhook";
                                                            case 638:
                                                                return "rfishhook";
                                                            case 639:
                                                                return "rfishhookreversed";
                                                            default:
                                                                switch (c) {
                                                                    case 641:
                                                                        return "Rsmallinverted";
                                                                    case 642:
                                                                        return "shook";
                                                                    case 643:
                                                                        return "esh";
                                                                    case 644:
                                                                        return "dotlessjstrokehook";
                                                                    case 645:
                                                                        return "eshsquatreversed";
                                                                    case 646:
                                                                        return "eshcurl";
                                                                    case 647:
                                                                        return "tturned";
                                                                    case 648:
                                                                        return "tretroflexhook";
                                                                    case 649:
                                                                        return "ubar";
                                                                    case 650:
                                                                        return "upsilonlatin";
                                                                    case 651:
                                                                        return "vhook";
                                                                    case 652:
                                                                        return "vturned";
                                                                    case 653:
                                                                        return "wturned";
                                                                    case 654:
                                                                        return "yturned";
                                                                    default:
                                                                        switch (c) {
                                                                            case 656:
                                                                                return "zretroflexhook";
                                                                            case 657:
                                                                                return "zcurl";
                                                                            case 658:
                                                                                return "ezh";
                                                                            case 659:
                                                                                return "ezhcurl";
                                                                            case 660:
                                                                                return "glottalstop";
                                                                            case 661:
                                                                                return "glottalstopreversed";
                                                                            case 662:
                                                                                return "glottalstopinverted";
                                                                            case 663:
                                                                                return "cstretched";
                                                                            case 664:
                                                                                return "bilabialclick";
                                                                            default:
                                                                                return C14113y2.f47374k4;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2110h9
    /* JADX INFO: renamed from: k4 */
    public final int mo10661k4(char c) {
        switch (c) {
            case ' ':
            case '|':
            case 160:
            case 173:
            case 175:
            case 181:
            case 183:
            case StyleIdentifier.TOC_HEADING /* 266 */:
            case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
            case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
            case StyleIdentifier.GRID_TABLE_1_LIGHT /* 273 */:
            case StyleIdentifier.GRID_TABLE_6_COLORFUL /* 278 */:
            case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
            case StyleIdentifier.GRID_TABLE_2_ACCENT_2 /* 288 */:
            case StyleIdentifier.GRID_TABLE_3_ACCENT_2 /* 289 */:
            case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2 /* 291 */:
            case 304:
            case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
            case StyleIdentifier.GRID_TABLE_4_ACCENT_5 /* 311 */:
            case 315:
            case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4 /* 354 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 /* 355 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6 /* 368 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6 /* 369 */:
            case 379:
            case 380:
            case 383:
            case 510:
            case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
            case ALERT_VALUE:
            case 701:
            case 732:
            case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
            case 769:
            case 771:
            case 777:
            case 803:
            case 901:
            case 962:
            case 977:
            case 978:
            case 981:
            case 982:
            case 1025:
            case EditingLanguage.BULGARIAN /* 1026 */:
            case EditingLanguage.CATALAN /* 1027 */:
            case EditingLanguage.CHINESE_TAIWAN /* 1028 */:
            case EditingLanguage.CZECH /* 1029 */:
            case EditingLanguage.DANISH /* 1030 */:
            case EditingLanguage.GERMAN_GERMANY /* 1031 */:
            case EditingLanguage.GREEK /* 1032 */:
            case EditingLanguage.ENGLISH_US /* 1033 */:
            case EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT /* 1034 */:
            case EditingLanguage.FINNISH /* 1035 */:
            case EditingLanguage.FRENCH_FRANCE /* 1036 */:
            case EditingLanguage.HUNGARIAN /* 1038 */:
            case EditingLanguage.ICELANDIC /* 1039 */:
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
            case EditingLanguage.JAPANESE /* 1041 */:
            case EditingLanguage.KOREAN /* 1042 */:
            case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
            case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
            case EditingLanguage.POLISH /* 1045 */:
            case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
            case EditingLanguage.ROMANSH /* 1047 */:
            case EditingLanguage.ROMANIAN /* 1048 */:
            case 1049:
            case 1050:
            case 1051:
            case 1052:
            case 1053:
            case EditingLanguage.THAI /* 1054 */:
            case 1055:
            case EditingLanguage.URDU /* 1056 */:
            case EditingLanguage.INDONESIAN /* 1057 */:
            case EditingLanguage.UKRAINIAN /* 1058 */:
            case EditingLanguage.BELARUSIAN /* 1059 */:
            case EditingLanguage.SLOVENIAN /* 1060 */:
            case EditingLanguage.ESTONIAN /* 1061 */:
            case EditingLanguage.LATVIAN /* 1062 */:
            case EditingLanguage.LITHUANIAN /* 1063 */:
            case EditingLanguage.TAJIK /* 1064 */:
            case EditingLanguage.PERSIAN /* 1065 */:
            case EditingLanguage.VIETNAMESE /* 1066 */:
            case EditingLanguage.ARMENIAN /* 1067 */:
            case EditingLanguage.AZERBAIJANI_LATIN /* 1068 */:
            case EditingLanguage.BASQUE /* 1069 */:
            case EditingLanguage.SORBIAN /* 1070 */:
            case EditingLanguage.MACEDONIAN /* 1071 */:
            case EditingLanguage.SUTU /* 1072 */:
            case EditingLanguage.TSONGA /* 1073 */:
            case EditingLanguage.TSWANA /* 1074 */:
            case EditingLanguage.VENDA /* 1075 */:
            case EditingLanguage.ISI_XHOSA /* 1076 */:
            case EditingLanguage.ISI_ZULU /* 1077 */:
            case EditingLanguage.AFRIKAANS /* 1078 */:
            case EditingLanguage.GEORGIAN /* 1079 */:
            case EditingLanguage.FAEROESE /* 1080 */:
            case EditingLanguage.HINDI /* 1081 */:
            case EditingLanguage.MALTESE /* 1082 */:
            case EditingLanguage.NORTHERN_SAMI_NORWAY /* 1083 */:
            case 1084:
            case EditingLanguage.YIDDISH /* 1085 */:
            case EditingLanguage.MALAY_MALAYSIA /* 1086 */:
            case EditingLanguage.KAZAKH /* 1087 */:
            case EditingLanguage.KYRGYZ /* 1088 */:
            case EditingLanguage.KISWAHILI /* 1089 */:
            case EditingLanguage.TURKMEN /* 1090 */:
            case EditingLanguage.UZBEK_LATIN /* 1091 */:
            case EditingLanguage.TATAR /* 1092 */:
            case EditingLanguage.BANGLA_INDIA /* 1093 */:
            case EditingLanguage.PUNJABI_INDIA /* 1094 */:
            case EditingLanguage.GUJARATI /* 1095 */:
            case EditingLanguage.ORIYA /* 1096 */:
            case EditingLanguage.TAMIL /* 1097 */:
            case EditingLanguage.TELUGU /* 1098 */:
            case EditingLanguage.KANNADA /* 1099 */:
            case EditingLanguage.MALAYALAM /* 1100 */:
            case EditingLanguage.ASSAMESE /* 1101 */:
            case EditingLanguage.MARATHI /* 1102 */:
            case EditingLanguage.SANSKRIT /* 1103 */:
            case EditingLanguage.TIBETAN_CHINA /* 1105 */:
            case EditingLanguage.WELSH /* 1106 */:
            case EditingLanguage.KHMER /* 1107 */:
            case EditingLanguage.LAO /* 1108 */:
            case EditingLanguage.BURMESE /* 1109 */:
            case EditingLanguage.GALICIAN /* 1110 */:
            case EditingLanguage.KONKANI /* 1111 */:
            case EditingLanguage.MANIPURI /* 1112 */:
            case EditingLanguage.SINDHI_DEVANAGARIC /* 1113 */:
            case EditingLanguage.SYRIAC /* 1114 */:
            case EditingLanguage.SINHALESE /* 1115 */:
            case EditingLanguage.CHEROKEE /* 1116 */:
            case EditingLanguage.AMHARIC /* 1118 */:
            case EditingLanguage.TAMAZIGHT /* 1119 */:
            case EditingLanguage.FRISIAN /* 1122 */:
            case EditingLanguage.PASHTO /* 1123 */:
            case EditingLanguage.OROMO /* 1138 */:
            case EditingLanguage.TIGRIGNA_ETHIOPIA /* 1139 */:
            case EditingLanguage.GUARANI /* 1140 */:
            case EditingLanguage.HAWAIIAN /* 1141 */:
            case 1168:
            case EditingLanguage.SCOTTISH_GAELIC /* 1169 */:
            case 1241:
            case 1430:
            case 1431:
            case 1435:
            case 1443:
            case 1444:
            case 1445:
            case 1446:
            case 1447:
            case 1450:
            case 1470:
            case 1472:
            case 1473:
            case 1474:
            case 1475:
            case 1520:
            case 1521:
            case 1522:
            case 1548:
            case 1563:
            case 1567:
            case 1570:
            case 1571:
            case 1572:
            case 1573:
            case 1574:
            case 1575:
            case 1576:
            case 1577:
            case 1578:
            case 1579:
            case 1580:
            case 1581:
            case 1582:
            case 1583:
            case 1584:
            case 1586:
            case 1587:
            case 1588:
            case 1589:
            case 1590:
            case 1591:
            case 1592:
            case 1593:
            case 1594:
            case 1601:
            case 1602:
            case 1603:
            case 1605:
            case 1606:
            case 1607:
            case 1608:
            case 1609:
            case 1610:
            case 1642:
            case 1643:
            case 1644:
            case 1657:
            case 1662:
            case 1670:
            case 1672:
            case 1681:
            case 1688:
            case 1700:
            case 1711:
            case 1722:
            case 1729:
            case 1746:
            case 8204:
            case 8213:
            case 8215:
            case 8219:
            case 8229:
            case 8353:
            case 8356:
            case 8364:
            case 8453:
            case 8467:
            case 8470:
            case 8486:
            case 8616:
            case 8656:
            case 8658:
            case 8660:
            case 8704:
            case 8707:
            case 8710:
            case 8711:
            case 8713:
            case 8735:
            case 8764:
            case 8773:
            case 8834:
            case 8835:
            case 8838:
            case 8839:
            case 8853:
            case 8855:
            case 8976:
            case 8992:
            case 8993:
            case 9617:
            case 9618:
            case 9619:
            case 9632:
            case 9633:
            case 9642:
            case 9643:
            case 9644:
            case 9650:
            case 9658:
            case 9660:
            case 9668:
            case 9675:
            case 9679:
            case 9688:
            case 9689:
            case 9702:
            case 9786:
            case 9787:
            case 9788:
            case 9792:
            case 9794:
            case 9824:
            case 9827:
            case 9829:
            case 9835:
            case 64300:
            case 64301:
            case 64305:
            case 64306:
            case 64307:
            case 64308:
            case 64310:
            case 64312:
            case 64313:
            case 64314:
            case 64315:
            case 64316:
            case 64318:
            case 64320:
            case 64321:
            case 64324:
            case 64326:
            case 64327:
            case 64329:
            case 64380:
            case 65166:
            case 65184:
            case 65192:
            case 65255:
            case 65258:
            case 65260:
            case 65268:
                return 2;
            case 1425:
            case 1600:
            case 1611:
            case 1612:
            case 1614:
            case 1615:
            case 8362:
            case 64287:
            case 64309:
            case 65252:
                return 4;
            case 1456:
                return 18;
            case 1457:
            case 1458:
            case 1460:
            case 1461:
            case 1462:
            case 1463:
            case 1467:
                return 15;
            case 1459:
                return 9;
            case 1464:
                return 25;
            case 1465:
                return 19;
            case 1468:
                return 5;
            case 1469:
            case 1471:
            case 1488:
            case 1489:
            case 1490:
            case 1492:
            case 1493:
            case 1494:
            case 1495:
            case 1496:
            case 1497:
            case 1499:
            case 1501:
            case 1502:
            case 1503:
            case 1504:
            case 1505:
            case 1506:
            case 1507:
            case 1508:
            case 1509:
            case 1510:
            case 1513:
            case 1514:
            case 1585:
            case 1604:
            case 1613:
            case 1616:
            case 1617:
            case 1618:
            case 1632:
            case 1633:
            case 1634:
            case 1635:
            case 1636:
            case 1637:
            case 1638:
            case 1639:
            case 1640:
            case 1641:
            case 1645:
            case 64298:
            case 64299:
            case 64330:
            case 64331:
            case 65247:
            case 65267:
                return 3;
            case 1491:
            case 1511:
            case 1512:
                return 23;
            case 1498:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return 7;
            case 1569:
                return 10;
            default:
                return !C14113y2.m67411k4(m10663x1(c)) ? 1 : 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:3371:0x1615 A[RETURN] */
    @Override // com.aspose.slides.internal.p060ca.InterfaceC2110h9
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo10662k4(char c, int i) {
        String str = C14113y2.f47374k4;
        switch (c) {
            case ' ':
                return i != 0 ? i != 1 ? str : "spacehackarabic" : "space";
            case '|':
                if (i == 0) {
                    return "bar";
                }
                if (i == 1) {
                    return "verticalbar";
                }
                break;
            case 160:
                if (i == 0) {
                    return "nbspace";
                }
                if (i == 1) {
                    return "nonbreakingspace";
                }
                break;
            case 173:
                if (i == 0) {
                    return "sfthyphen";
                }
                if (i == 1) {
                    return "softhyphen";
                }
                break;
            case 175:
                if (i == 0) {
                    return "macron";
                }
                if (i == 1) {
                    return "overscore";
                }
                break;
            case 181:
                if (i == 0) {
                    return "mu";
                }
                if (i == 1) {
                    return "mu1";
                }
                break;
            case 183:
                if (i == 0) {
                    return "middot";
                }
                if (i == 1) {
                    return "periodcentered";
                }
                break;
            case StyleIdentifier.TOC_HEADING /* 266 */:
                if (i == 0) {
                    return "Cdot";
                }
                if (i == 1) {
                    return "Cdotaccent";
                }
                break;
            case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                if (i == 0) {
                    return "cdot";
                }
                if (i == 1) {
                    return "cdotaccent";
                }
                break;
            case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
                if (i == 0) {
                    return "Dcroat";
                }
                if (i == 1) {
                    return "Dslash";
                }
                break;
            case StyleIdentifier.GRID_TABLE_1_LIGHT /* 273 */:
                if (i == 0) {
                    return "dcroat";
                }
                if (i == 1) {
                    return "dmacron";
                }
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL /* 278 */:
                if (i == 0) {
                    return "Edot";
                }
                if (i == 1) {
                    return "Edotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
                if (i == 0) {
                    return "edot";
                }
                if (i == 1) {
                    return "edotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_2 /* 288 */:
                if (i == 0) {
                    return "Gdot";
                }
                if (i == 1) {
                    return "Gdotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_2 /* 289 */:
                if (i == 0) {
                    return "gdot";
                }
                if (i == 1) {
                    return "gdotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                if (i == 0) {
                    return "Gcedilla";
                }
                if (i == 1) {
                    return "Gcommaaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2 /* 291 */:
                if (i == 0) {
                    return "gcedilla";
                }
                if (i == 1) {
                    return "gcommaaccent";
                }
                break;
            case 304:
                if (i == 0) {
                    return "Idot";
                }
                if (i == 1) {
                    return "Idotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                if (i == 0) {
                    return "Kcedilla";
                }
                if (i == 1) {
                    return "Kcommaaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_5 /* 311 */:
                if (i == 0) {
                    return "kcedilla";
                }
                if (i == 1) {
                    return "kcommaaccent";
                }
                break;
            case 315:
                if (i == 0) {
                    return "Lcedilla";
                }
                if (i == 1) {
                    return "Lcommaaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
                if (i == 0) {
                    return "lcedilla";
                }
                if (i == 1) {
                    return "lcommaaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                if (i == 0) {
                    return "Ldot";
                }
                if (i == 1) {
                    return "Ldotaccent";
                }
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                if (i == 0) {
                    return "ldot";
                }
                if (i == 1) {
                    return "ldotaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                if (i == 0) {
                    return "Ncedilla";
                }
                if (i == 1) {
                    return "Ncommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                if (i == 0) {
                    return "ncedilla";
                }
                if (i == 1) {
                    return "ncommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                if (i == 0) {
                    return "napostrophe";
                }
                if (i == 1) {
                    return "quoterightn";
                }
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                if (i == 0) {
                    return "Odblacute";
                }
                if (i == 1) {
                    return "Ohungarumlaut";
                }
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                if (i == 0) {
                    return "odblacute";
                }
                if (i == 1) {
                    return "ohungarumlaut";
                }
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                if (i == 0) {
                    return "Rcedilla";
                }
                if (i == 1) {
                    return "Rcommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                if (i == 0) {
                    return "rcedilla";
                }
                if (i == 1) {
                    return "rcommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4 /* 354 */:
                if (i == 0) {
                    return "Tcedilla";
                }
                if (i == 1) {
                    return "Tcommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 /* 355 */:
                if (i == 0) {
                    return "tcedilla";
                }
                if (i == 1) {
                    return "tcommaaccent";
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6 /* 368 */:
                if (i == 0) {
                    return "Udblacute";
                }
                if (i == 1) {
                    return "Uhungarumlaut";
                }
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6 /* 369 */:
                if (i == 0) {
                    return "udblacute";
                }
                if (i == 1) {
                    return "uhungarumlaut";
                }
                break;
            case 379:
                if (i == 0) {
                    return "Zdot";
                }
                if (i == 1) {
                    return "Zdotaccent";
                }
                break;
            case 380:
                if (i == 0) {
                    return "zdot";
                }
                if (i == 1) {
                    return "zdotaccent";
                }
                break;
            case 383:
                if (i == 0) {
                    return "longs";
                }
                if (i == 1) {
                    return "slong";
                }
                break;
            case 510:
                if (i == 0) {
                    return "Oslashacute";
                }
                if (i == 1) {
                    return "Ostrokeacute";
                }
                break;
            case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                if (i == 0) {
                    return "oslashacute";
                }
                if (i == 1) {
                    return "ostrokeacute";
                }
                break;
            case ALERT_VALUE:
                if (i == 0) {
                    return "afii57929";
                }
                if (i == 1) {
                    return "apostrophemod";
                }
                break;
            case 701:
                if (i == 0) {
                    return "afii64937";
                }
                if (i == 1) {
                    return "commareversedmod";
                }
                break;
            case 732:
                if (i == 0) {
                    return "ilde";
                }
                if (i == 1) {
                    return "tilde";
                }
                break;
            case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                if (i == 0) {
                    return "gravecmb";
                }
                if (i == 1) {
                    return "gravecomb";
                }
                break;
            case 769:
                if (i == 0) {
                    return "acutecmb";
                }
                if (i == 1) {
                    return "acutecomb";
                }
                break;
            case 771:
                if (i == 0) {
                    return "tildecmb";
                }
                if (i == 1) {
                    return "tildecomb";
                }
                break;
            case 777:
                if (i == 0) {
                    return "hookabovecomb";
                }
                if (i == 1) {
                    return "hookcmb";
                }
                break;
            case 803:
                if (i == 0) {
                    return "dotbelowcmb";
                }
                if (i == 1) {
                    return "dotbelowcomb";
                }
                break;
            case 901:
                if (i == 0) {
                    return "dialytikatonos";
                }
                if (i == 1) {
                    return "dieresistonos";
                }
                break;
            case 962:
                if (i == 0) {
                    return "sigma1";
                }
                if (i == 1) {
                    return "sigmafinal";
                }
                break;
            case 977:
                if (i == 0) {
                    return "theta1";
                }
                if (i == 1) {
                    return "thetasymbolgreek";
                }
                break;
            case 978:
                if (i == 0) {
                    return "Upsilon1";
                }
                if (i == 1) {
                    return "Upsilonhooksymbol";
                }
                break;
            case 981:
                if (i == 0) {
                    return "phi1";
                }
                if (i == 1) {
                    return "phisymbolgreek";
                }
                break;
            case 982:
                if (i == 0) {
                    return "omega1";
                }
                if (i == 1) {
                    return "pisymbolgreek";
                }
                break;
            case 1025:
                if (i == 0) {
                    return "Iocyrillic";
                }
                if (i == 1) {
                    return "afii10023";
                }
                break;
            case EditingLanguage.BULGARIAN /* 1026 */:
                if (i == 0) {
                    return "Djecyrillic";
                }
                if (i == 1) {
                    return "afii10051";
                }
                break;
            case EditingLanguage.CATALAN /* 1027 */:
                if (i == 0) {
                    return "Gjecyrillic";
                }
                if (i == 1) {
                    return "afii10052";
                }
                break;
            case EditingLanguage.CHINESE_TAIWAN /* 1028 */:
                if (i == 0) {
                    return "Ecyrillic";
                }
                if (i == 1) {
                    return "afii10053";
                }
                break;
            case EditingLanguage.CZECH /* 1029 */:
                if (i == 0) {
                    return "Dzecyrillic";
                }
                if (i == 1) {
                    return "afii10054";
                }
                break;
            case EditingLanguage.DANISH /* 1030 */:
                if (i == 0) {
                    return "Icyrillic";
                }
                if (i == 1) {
                    return "afii10055";
                }
                break;
            case EditingLanguage.GERMAN_GERMANY /* 1031 */:
                if (i == 0) {
                    return "Yicyrillic";
                }
                if (i == 1) {
                    return "afii10056";
                }
                break;
            case EditingLanguage.GREEK /* 1032 */:
                if (i == 0) {
                    return "Jecyrillic";
                }
                if (i == 1) {
                    return "afii10057";
                }
                break;
            case EditingLanguage.ENGLISH_US /* 1033 */:
                if (i == 0) {
                    return "Ljecyrillic";
                }
                if (i == 1) {
                    return "afii10058";
                }
                break;
            case EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT /* 1034 */:
                if (i == 0) {
                    return "Njecyrillic";
                }
                if (i == 1) {
                    return "afii10059";
                }
                break;
            case EditingLanguage.FINNISH /* 1035 */:
                if (i == 0) {
                    return "Tshecyrillic";
                }
                if (i == 1) {
                    return "afii10060";
                }
                break;
            case EditingLanguage.FRENCH_FRANCE /* 1036 */:
                if (i == 0) {
                    return "Kjecyrillic";
                }
                if (i == 1) {
                    return "afii10061";
                }
                break;
            case EditingLanguage.HUNGARIAN /* 1038 */:
                if (i == 0) {
                    return "Ushortcyrillic";
                }
                if (i == 1) {
                    return "afii10062";
                }
                break;
            case EditingLanguage.ICELANDIC /* 1039 */:
                if (i == 0) {
                    return "Dzhecyrillic";
                }
                if (i == 1) {
                    return "afii10145";
                }
                break;
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                if (i == 0) {
                    return "Acyrillic";
                }
                if (i == 1) {
                    return "afii10017";
                }
                break;
            case EditingLanguage.JAPANESE /* 1041 */:
                if (i == 0) {
                    return "Becyrillic";
                }
                if (i == 1) {
                    return "afii10018";
                }
                break;
            case EditingLanguage.KOREAN /* 1042 */:
                if (i == 0) {
                    return "Vecyrillic";
                }
                if (i == 1) {
                    return "afii10019";
                }
                break;
            case EditingLanguage.DUTCH_NETHERLANDS /* 1043 */:
                if (i == 0) {
                    return "Gecyrillic";
                }
                if (i == 1) {
                    return "afii10020";
                }
                break;
            case EditingLanguage.NORWEGIAN_BOKMAL /* 1044 */:
                if (i == 0) {
                    return "Decyrillic";
                }
                if (i == 1) {
                    return "afii10021";
                }
                break;
            case EditingLanguage.POLISH /* 1045 */:
                if (i == 0) {
                    return "Iecyrillic";
                }
                if (i == 1) {
                    return "afii10022";
                }
                break;
            case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
                if (i == 0) {
                    return "Zhecyrillic";
                }
                if (i == 1) {
                    return "afii10024";
                }
                break;
            case EditingLanguage.ROMANSH /* 1047 */:
                if (i == 0) {
                    return "Zecyrillic";
                }
                if (i == 1) {
                    return "afii10025";
                }
                break;
            case EditingLanguage.ROMANIAN /* 1048 */:
                if (i == 0) {
                    return "Iicyrillic";
                }
                if (i == 1) {
                    return "afii10026";
                }
                break;
            case 1049:
                if (i == 0) {
                    return "Iishortcyrillic";
                }
                if (i == 1) {
                    return "afii10027";
                }
                break;
            case 1050:
                if (i == 0) {
                    return "Kacyrillic";
                }
                if (i == 1) {
                    return "afii10028";
                }
                break;
            case 1051:
                if (i == 0) {
                    return "Elcyrillic";
                }
                if (i == 1) {
                    return "afii10029";
                }
                break;
            case 1052:
                if (i == 0) {
                    return "Emcyrillic";
                }
                if (i == 1) {
                    return "afii10030";
                }
                break;
            case 1053:
                if (i == 0) {
                    return "Encyrillic";
                }
                if (i == 1) {
                    return "afii10031";
                }
                break;
            case EditingLanguage.THAI /* 1054 */:
                if (i == 0) {
                    return "Ocyrillic";
                }
                if (i == 1) {
                    return "afii10032";
                }
                break;
            case 1055:
                if (i == 0) {
                    return "Pecyrillic";
                }
                if (i == 1) {
                    return "afii10033";
                }
                break;
            case EditingLanguage.URDU /* 1056 */:
                if (i == 0) {
                    return "Ercyrillic";
                }
                if (i == 1) {
                    return "afii10034";
                }
                break;
            case EditingLanguage.INDONESIAN /* 1057 */:
                if (i == 0) {
                    return "Escyrillic";
                }
                if (i == 1) {
                    return "afii10035";
                }
                break;
            case EditingLanguage.UKRAINIAN /* 1058 */:
                if (i == 0) {
                    return "Tecyrillic";
                }
                if (i == 1) {
                    return "afii10036";
                }
                break;
            case EditingLanguage.BELARUSIAN /* 1059 */:
                if (i == 0) {
                    return "Ucyrillic";
                }
                if (i == 1) {
                    return "afii10037";
                }
                break;
            case EditingLanguage.SLOVENIAN /* 1060 */:
                if (i == 0) {
                    return "Efcyrillic";
                }
                if (i == 1) {
                    return "afii10038";
                }
                break;
            case EditingLanguage.ESTONIAN /* 1061 */:
                if (i == 0) {
                    return "Khacyrillic";
                }
                if (i == 1) {
                    return "afii10039";
                }
                break;
            case EditingLanguage.LATVIAN /* 1062 */:
                if (i == 0) {
                    return "Tsecyrillic";
                }
                if (i == 1) {
                    return "afii10040";
                }
                break;
            case EditingLanguage.LITHUANIAN /* 1063 */:
                if (i == 0) {
                    return "Checyrillic";
                }
                if (i == 1) {
                    return "afii10041";
                }
                break;
            case EditingLanguage.TAJIK /* 1064 */:
                if (i == 0) {
                    return "Shacyrillic";
                }
                if (i == 1) {
                    return "afii10042";
                }
                break;
            case EditingLanguage.PERSIAN /* 1065 */:
                if (i == 0) {
                    return "Shchacyrillic";
                }
                if (i == 1) {
                    return "afii10043";
                }
                break;
            case EditingLanguage.VIETNAMESE /* 1066 */:
                if (i == 0) {
                    return "Hardsigncyrillic";
                }
                if (i == 1) {
                    return "afii10044";
                }
                break;
            case EditingLanguage.ARMENIAN /* 1067 */:
                if (i == 0) {
                    return "Yericyrillic";
                }
                if (i == 1) {
                    return "afii10045";
                }
                break;
            case EditingLanguage.AZERBAIJANI_LATIN /* 1068 */:
                if (i == 0) {
                    return "Softsigncyrillic";
                }
                if (i == 1) {
                    return "afii10046";
                }
                break;
            case EditingLanguage.BASQUE /* 1069 */:
                if (i == 0) {
                    return "Ereversedcyrillic";
                }
                if (i == 1) {
                    return "afii10047";
                }
                break;
            case EditingLanguage.SORBIAN /* 1070 */:
                if (i == 0) {
                    return "IUcyrillic";
                }
                if (i == 1) {
                    return "afii10048";
                }
                break;
            case EditingLanguage.MACEDONIAN /* 1071 */:
                if (i == 0) {
                    return "IAcyrillic";
                }
                if (i == 1) {
                    return "afii10049";
                }
                break;
            case EditingLanguage.SUTU /* 1072 */:
                if (i == 0) {
                    return "acyrillic";
                }
                if (i == 1) {
                    return "afii10065";
                }
                break;
            case EditingLanguage.TSONGA /* 1073 */:
                if (i == 0) {
                    return "afii10066";
                }
                if (i == 1) {
                    return "becyrillic";
                }
                break;
            case EditingLanguage.TSWANA /* 1074 */:
                if (i == 0) {
                    return "afii10067";
                }
                if (i == 1) {
                    return "vecyrillic";
                }
                break;
            case EditingLanguage.VENDA /* 1075 */:
                if (i == 0) {
                    return "afii10068";
                }
                if (i == 1) {
                    return "gecyrillic";
                }
                break;
            case EditingLanguage.ISI_XHOSA /* 1076 */:
                if (i == 0) {
                    return "afii10069";
                }
                if (i == 1) {
                    return "decyrillic";
                }
                break;
            case EditingLanguage.ISI_ZULU /* 1077 */:
                if (i == 0) {
                    return "afii10070";
                }
                if (i == 1) {
                    return "iecyrillic";
                }
                break;
            case EditingLanguage.AFRIKAANS /* 1078 */:
                if (i == 0) {
                    return "afii10072";
                }
                if (i == 1) {
                    return "zhecyrillic";
                }
                break;
            case EditingLanguage.GEORGIAN /* 1079 */:
                if (i == 0) {
                    return "afii10073";
                }
                if (i == 1) {
                    return "zecyrillic";
                }
                break;
            case EditingLanguage.FAEROESE /* 1080 */:
                if (i == 0) {
                    return "afii10074";
                }
                if (i == 1) {
                    return "iicyrillic";
                }
                break;
            case EditingLanguage.HINDI /* 1081 */:
                if (i == 0) {
                    return "afii10075";
                }
                if (i == 1) {
                    return "iishortcyrillic";
                }
                break;
            case EditingLanguage.MALTESE /* 1082 */:
                if (i == 0) {
                    return "afii10076";
                }
                if (i == 1) {
                    return "kacyrillic";
                }
                break;
            case EditingLanguage.NORTHERN_SAMI_NORWAY /* 1083 */:
                if (i == 0) {
                    return "afii10077";
                }
                if (i == 1) {
                    return "elcyrillic";
                }
                break;
            case 1084:
                if (i == 0) {
                    return "afii10078";
                }
                if (i == 1) {
                    return "emcyrillic";
                }
                break;
            case EditingLanguage.YIDDISH /* 1085 */:
                if (i == 0) {
                    return "afii10079";
                }
                if (i == 1) {
                    return "encyrillic";
                }
                break;
            case EditingLanguage.MALAY_MALAYSIA /* 1086 */:
                if (i == 0) {
                    return "afii10080";
                }
                if (i == 1) {
                    return "ocyrillic";
                }
                break;
            case EditingLanguage.KAZAKH /* 1087 */:
                if (i == 0) {
                    return "afii10081";
                }
                if (i == 1) {
                    return "pecyrillic";
                }
                break;
            case EditingLanguage.KYRGYZ /* 1088 */:
                if (i == 0) {
                    return "afii10082";
                }
                if (i == 1) {
                    return "ercyrillic";
                }
                break;
            case EditingLanguage.KISWAHILI /* 1089 */:
                if (i == 0) {
                    return "afii10083";
                }
                if (i == 1) {
                    return "escyrillic";
                }
                break;
            case EditingLanguage.TURKMEN /* 1090 */:
                if (i == 0) {
                    return "afii10084";
                }
                if (i == 1) {
                    return "tecyrillic";
                }
                break;
            case EditingLanguage.UZBEK_LATIN /* 1091 */:
                if (i == 0) {
                    return "afii10085";
                }
                if (i == 1) {
                    return "ucyrillic";
                }
                break;
            case EditingLanguage.TATAR /* 1092 */:
                if (i == 0) {
                    return "afii10086";
                }
                if (i == 1) {
                    return "efcyrillic";
                }
                break;
            case EditingLanguage.BANGLA_INDIA /* 1093 */:
                if (i == 0) {
                    return "afii10087";
                }
                if (i == 1) {
                    return "khacyrillic";
                }
                break;
            case EditingLanguage.PUNJABI_INDIA /* 1094 */:
                if (i == 0) {
                    return "afii10088";
                }
                if (i == 1) {
                    return "tsecyrillic";
                }
                break;
            case EditingLanguage.GUJARATI /* 1095 */:
                if (i == 0) {
                    return "afii10089";
                }
                if (i == 1) {
                    return "checyrillic";
                }
                break;
            case EditingLanguage.ORIYA /* 1096 */:
                if (i == 0) {
                    return "afii10090";
                }
                if (i == 1) {
                    return "shacyrillic";
                }
                break;
            case EditingLanguage.TAMIL /* 1097 */:
                if (i == 0) {
                    return "afii10091";
                }
                if (i == 1) {
                    return "shchacyrillic";
                }
                break;
            case EditingLanguage.TELUGU /* 1098 */:
                if (i == 0) {
                    return "afii10092";
                }
                if (i == 1) {
                    return "hardsigncyrillic";
                }
                break;
            case EditingLanguage.KANNADA /* 1099 */:
                if (i == 0) {
                    return "afii10093";
                }
                if (i == 1) {
                    return "yericyrillic";
                }
                break;
            case EditingLanguage.MALAYALAM /* 1100 */:
                if (i == 0) {
                    return "afii10094";
                }
                if (i == 1) {
                    return "softsigncyrillic";
                }
                break;
            case EditingLanguage.ASSAMESE /* 1101 */:
                if (i == 0) {
                    return "afii10095";
                }
                if (i == 1) {
                    return "ereversedcyrillic";
                }
                break;
            case EditingLanguage.MARATHI /* 1102 */:
                if (i == 0) {
                    return "afii10096";
                }
                if (i == 1) {
                    return "iucyrillic";
                }
                break;
            case EditingLanguage.SANSKRIT /* 1103 */:
                if (i == 0) {
                    return "afii10097";
                }
                if (i == 1) {
                    return "iacyrillic";
                }
                break;
            case EditingLanguage.TIBETAN_CHINA /* 1105 */:
                if (i == 0) {
                    return "afii10071";
                }
                if (i == 1) {
                    return "iocyrillic";
                }
                break;
            case EditingLanguage.WELSH /* 1106 */:
                if (i == 0) {
                    return "afii10099";
                }
                if (i == 1) {
                    return "djecyrillic";
                }
                break;
            case EditingLanguage.KHMER /* 1107 */:
                if (i == 0) {
                    return "afii10100";
                }
                if (i == 1) {
                    return "gjecyrillic";
                }
                break;
            case EditingLanguage.LAO /* 1108 */:
                if (i == 0) {
                    return "afii10101";
                }
                if (i == 1) {
                    return "ecyrillic";
                }
                break;
            case EditingLanguage.BURMESE /* 1109 */:
                if (i == 0) {
                    return "afii10102";
                }
                if (i == 1) {
                    return "dzecyrillic";
                }
                break;
            case EditingLanguage.GALICIAN /* 1110 */:
                if (i == 0) {
                    return "afii10103";
                }
                if (i == 1) {
                    return "icyrillic";
                }
                break;
            case EditingLanguage.KONKANI /* 1111 */:
                if (i == 0) {
                    return "afii10104";
                }
                if (i == 1) {
                    return "yicyrillic";
                }
                break;
            case EditingLanguage.MANIPURI /* 1112 */:
                if (i == 0) {
                    return "afii10105";
                }
                if (i == 1) {
                    return "jecyrillic";
                }
                break;
            case EditingLanguage.SINDHI_DEVANAGARIC /* 1113 */:
                if (i == 0) {
                    return "afii10106";
                }
                if (i == 1) {
                    return "ljecyrillic";
                }
                break;
            case EditingLanguage.SYRIAC /* 1114 */:
                if (i == 0) {
                    return "afii10107";
                }
                if (i == 1) {
                    return "njecyrillic";
                }
                break;
            case EditingLanguage.SINHALESE /* 1115 */:
                if (i == 0) {
                    return "afii10108";
                }
                if (i == 1) {
                    return "tshecyrillic";
                }
                break;
            case EditingLanguage.CHEROKEE /* 1116 */:
                if (i == 0) {
                    return "afii10109";
                }
                if (i == 1) {
                    return "kjecyrillic";
                }
                break;
            case EditingLanguage.AMHARIC /* 1118 */:
                if (i == 0) {
                    return "afii10110";
                }
                if (i == 1) {
                    return "ushortcyrillic";
                }
                break;
            case EditingLanguage.TAMAZIGHT /* 1119 */:
                if (i == 0) {
                    return "afii10193";
                }
                if (i == 1) {
                    return "dzhecyrillic";
                }
                break;
            case EditingLanguage.FRISIAN /* 1122 */:
                if (i == 0) {
                    return "Yatcyrillic";
                }
                if (i == 1) {
                    return "afii10146";
                }
                break;
            case EditingLanguage.PASHTO /* 1123 */:
                if (i == 0) {
                    return "afii10194";
                }
                if (i == 1) {
                    return "yatcyrillic";
                }
                break;
            case EditingLanguage.OROMO /* 1138 */:
                if (i == 0) {
                    return "Fitacyrillic";
                }
                if (i == 1) {
                    return "afii10147";
                }
                break;
            case EditingLanguage.TIGRIGNA_ETHIOPIA /* 1139 */:
                if (i == 0) {
                    return "afii10195";
                }
                if (i == 1) {
                    return "fitacyrillic";
                }
                break;
            case EditingLanguage.GUARANI /* 1140 */:
                if (i == 0) {
                    return "Izhitsacyrillic";
                }
                if (i == 1) {
                    return "afii10148";
                }
                break;
            case EditingLanguage.HAWAIIAN /* 1141 */:
                if (i == 0) {
                    return "afii10196";
                }
                if (i == 1) {
                    return "izhitsacyrillic";
                }
                break;
            case 1168:
                if (i == 0) {
                    return "Gheupturncyrillic";
                }
                if (i == 1) {
                    return "afii10050";
                }
                break;
            case EditingLanguage.SCOTTISH_GAELIC /* 1169 */:
                if (i == 0) {
                    return "afii10098";
                }
                if (i == 1) {
                    return "gheupturncyrillic";
                }
                break;
            case 1241:
                if (i == 0) {
                    return "afii10846";
                }
                if (i == 1) {
                    return "schwacyrillic";
                }
                break;
            case 1425:
                if (i == 0) {
                    return "etnahtafoukhhebrew";
                }
                if (i == 1) {
                    return "etnahtafoukhlefthebrew";
                }
                if (i == 2) {
                    return "etnahtahebrew";
                }
                if (i == 3) {
                    return "etnahtalefthebrew";
                }
                break;
            case 1430:
                if (i == 0) {
                    return "tipehahebrew";
                }
                if (i == 1) {
                    return "tipehalefthebrew";
                }
                break;
            case 1431:
                if (i == 0) {
                    return "reviahebrew";
                }
                if (i == 1) {
                    return "reviamugrashhebrew";
                }
                break;
            case 1435:
                if (i == 0) {
                    return "tevirhebrew";
                }
                if (i == 1) {
                    return "tevirlefthebrew";
                }
                break;
            case 1443:
                if (i == 0) {
                    return "munahhebrew";
                }
                if (i == 1) {
                    return "munahlefthebrew";
                }
                break;
            case 1444:
                if (i == 0) {
                    return "mahapakhhebrew";
                }
                if (i == 1) {
                    return "mahapakhlefthebrew";
                }
                break;
            case 1445:
                if (i == 0) {
                    return "merkhahebrew";
                }
                if (i == 1) {
                    return "merkhalefthebrew";
                }
                break;
            case 1446:
                if (i == 0) {
                    return "merkhakefulahebrew";
                }
                if (i == 1) {
                    return "merkhakefulalefthebrew";
                }
                break;
            case 1447:
                if (i == 0) {
                    return "dargahebrew";
                }
                if (i == 1) {
                    return "dargalefthebrew";
                }
                break;
            case 1450:
                if (i == 0) {
                    return "yerahbenyomohebrew";
                }
                if (i == 1) {
                    return "yerahbenyomolefthebrew";
                }
                break;
            case 1456:
                switch (i) {
                    case 0:
                        return "afii57799";
                    case 1:
                        return "daletsheva";
                    case 2:
                        return "daletshevahebrew";
                    case 3:
                        return "finalkafsheva";
                    case 4:
                        return "finalkafshevahebrew";
                    case 5:
                        return "qofsheva";
                    case 6:
                        return "qofshevahebrew";
                    case 7:
                        return "reshsheva";
                    case 8:
                        return "reshshevahebrew";
                    case 9:
                        return "sheva";
                    case 10:
                        return "sheva115";
                    case 11:
                        return "sheva15";
                    case 12:
                        return "sheva22";
                    case 13:
                        return "sheva2e";
                    case 14:
                        return "shevahebrew";
                    case 15:
                        return "shevanarrowhebrew";
                    case 16:
                        return "shevaquarterhebrew";
                    case 17:
                        return "shevawidehebrew";
                }
            case 1457:
                switch (i) {
                    case 0:
                        return "afii57801";
                    case 1:
                        return "dalethatafsegol";
                    case 2:
                        return "dalethatafsegolhebrew";
                    case 3:
                        return "hatafsegol";
                    case 4:
                        return "hatafsegol17";
                    case 5:
                        return "hatafsegol24";
                    case 6:
                        return "hatafsegol30";
                    case 7:
                        return "hatafsegolhebrew";
                    case 8:
                        return "hatafsegolnarrowhebrew";
                    case 9:
                        return "hatafsegolquarterhebrew";
                    case 10:
                        return "hatafsegolwidehebrew";
                    case 11:
                        return "qofhatafsegol";
                    case 12:
                        return "qofhatafsegolhebrew";
                    case 13:
                        return "reshhatafsegol";
                    case 14:
                        return "reshhatafsegolhebrew";
                }
            case 1458:
                switch (i) {
                    case 0:
                        return "afii57800";
                    case 1:
                        return "dalethatafpatah";
                    case 2:
                        return "dalethatafpatahhebrew";
                    case 3:
                        return "hatafpatah";
                    case 4:
                        return "hatafpatah16";
                    case 5:
                        return "hatafpatah23";
                    case 6:
                        return "hatafpatah2f";
                    case 7:
                        return "hatafpatahhebrew";
                    case 8:
                        return "hatafpatahnarrowhebrew";
                    case 9:
                        return "hatafpatahquarterhebrew";
                    case 10:
                        return "hatafpatahwidehebrew";
                    case 11:
                        return "qofhatafpatah";
                    case 12:
                        return "qofhatafpatahhebrew";
                    case 13:
                        return "reshhatafpatah";
                    case 14:
                        return "reshhatafpatahhebrew";
                }
            case 1459:
                switch (i) {
                    case 0:
                        return "afii57802";
                    case 1:
                        return "hatafqamats";
                    case 2:
                        return "hatafqamats1b";
                    case 3:
                        return "hatafqamats28";
                    case 4:
                        return "hatafqamats34";
                    case 5:
                        return "hatafqamatshebrew";
                    case 6:
                        return "hatafqamatsnarrowhebrew";
                    case 7:
                        return "hatafqamatsquarterhebrew";
                    case 8:
                        return "hatafqamatswidehebrew";
                }
            case 1460:
                switch (i) {
                    case 0:
                        return "afii57793";
                    case 1:
                        return "dalethiriq";
                    case 2:
                        return "dalethiriqhebrew";
                    case 3:
                        return "hiriq";
                    case 4:
                        return "hiriq14";
                    case 5:
                        return "hiriq21";
                    case 6:
                        return "hiriq2d";
                    case 7:
                        return "hiriqhebrew";
                    case 8:
                        return "hiriqnarrowhebrew";
                    case 9:
                        return "hiriqquarterhebrew";
                    case 10:
                        return "hiriqwidehebrew";
                    case 11:
                        return "qofhiriq";
                    case 12:
                        return "qofhiriqhebrew";
                    case 13:
                        return "reshhiriq";
                    case 14:
                        return "reshhiriqhebrew";
                }
            case 1461:
                switch (i) {
                    case 0:
                        return "afii57794";
                    case 1:
                        return "dalettsere";
                    case 2:
                        return "dalettserehebrew";
                    case 3:
                        return "qoftsere";
                    case 4:
                        return "qoftserehebrew";
                    case 5:
                        return "reshtsere";
                    case 6:
                        return "reshtserehebrew";
                    case 7:
                        return "tsere";
                    case 8:
                        return "tsere12";
                    case 9:
                        return "tsere1e";
                    case 10:
                        return "tsere2b";
                    case 11:
                        return "tserehebrew";
                    case 12:
                        return "tserenarrowhebrew";
                    case 13:
                        return "tserequarterhebrew";
                    case 14:
                        return "tserewidehebrew";
                }
            case 1462:
                switch (i) {
                    case 0:
                        return "afii57795";
                    case 1:
                        return "daletsegol";
                    case 2:
                        return "daletsegolhebrew";
                    case 3:
                        return "qofsegol";
                    case 4:
                        return "qofsegolhebrew";
                    case 5:
                        return "reshsegol";
                    case 6:
                        return "reshsegolhebrew";
                    case 7:
                        return "segol";
                    case 8:
                        return "segol13";
                    case 9:
                        return "segol1f";
                    case 10:
                        return "segol2c";
                    case 11:
                        return "segolhebrew";
                    case 12:
                        return "segolnarrowhebrew";
                    case 13:
                        return "segolquarterhebrew";
                    case 14:
                        return "segolwidehebrew";
                }
            case 1463:
                switch (i) {
                    case 0:
                        return "afii57798";
                    case 1:
                        return "daletpatah";
                    case 2:
                        return "daletpatahhebrew";
                    case 3:
                        return "patah";
                    case 4:
                        return "patah11";
                    case 5:
                        return "patah1d";
                    case 6:
                        return "patah2a";
                    case 7:
                        return "patahhebrew";
                    case 8:
                        return "patahnarrowhebrew";
                    case 9:
                        return "patahquarterhebrew";
                    case 10:
                        return "patahwidehebrew";
                    case 11:
                        return "qofpatah";
                    case 12:
                        return "qofpatahhebrew";
                    case 13:
                        return "reshpatah";
                    case 14:
                        return "reshpatahhebrew";
                }
            case 1464:
                switch (i) {
                    case 0:
                        return "afii57797";
                    case 1:
                        return "daletqamats";
                    case 2:
                        return "daletqamatshebrew";
                    case 3:
                        return "finalkafqamats";
                    case 4:
                        return "finalkafqamatshebrew";
                    case 5:
                        return "qamats";
                    case 6:
                        return "qamats10";
                    case 7:
                        return "qamats1a";
                    case 8:
                        return "qamats1c";
                    case 9:
                        return "qamats27";
                    case 10:
                        return "qamats29";
                    case 11:
                        return "qamats33";
                    case 12:
                        return "qamatsde";
                    case 13:
                        return "qamatshebrew";
                    case 14:
                        return "qamatsnarrowhebrew";
                    case 15:
                        return "qamatsqatanhebrew";
                    case 16:
                        return "qamatsqatannarrowhebrew";
                    case 17:
                        return "qamatsqatanquarterhebrew";
                    case 18:
                        return "qamatsqatanwidehebrew";
                    case 19:
                        return "qamatsquarterhebrew";
                    case 20:
                        return "qamatswidehebrew";
                    case 21:
                        return "qofqamats";
                    case 22:
                        return "qofqamatshebrew";
                    case 23:
                        return "reshqamats";
                    case 24:
                        return "reshqamatshebrew";
                }
            case 1465:
                switch (i) {
                    case 0:
                        return "afii57806";
                    case 1:
                        return "daletholam";
                    case 2:
                        return "daletholamhebrew";
                    case 3:
                        return "holam";
                    case 4:
                        return "holam19";
                    case 5:
                        return "holam26";
                    case 6:
                        return "holam32";
                    case 7:
                        return "holamhebrew";
                    case 8:
                        return "holamnarrowhebrew";
                    case 9:
                        return "holamquarterhebrew";
                    case 10:
                        return "holamwidehebrew";
                    case 11:
                        return "lamedholam";
                    case 12:
                        return "lamedholamdagesh";
                    case 13:
                        return "lamedholamdageshhebrew";
                    case 14:
                        return "lamedholamhebrew";
                    case 15:
                        return "qofholam";
                    case 16:
                        return "qofholamhebrew";
                    case 17:
                        return "reshholam";
                    case 18:
                        return "reshholamhebrew";
                }
            case 1467:
                switch (i) {
                    case 0:
                        return "afii57796";
                    case 1:
                        return "daletqubuts";
                    case 2:
                        return "daletqubutshebrew";
                    case 3:
                        return "qofqubuts";
                    case 4:
                        return "qofqubutshebrew";
                    case 5:
                        return "qubuts";
                    case 6:
                        return "qubuts18";
                    case 7:
                        return "qubuts25";
                    case 8:
                        return "qubuts31";
                    case 9:
                        return "qubutshebrew";
                    case 10:
                        return "qubutsnarrowhebrew";
                    case 11:
                        return "qubutsquarterhebrew";
                    case 12:
                        return "qubutswidehebrew";
                    case 13:
                        return "reshqubuts";
                    case 14:
                        return "reshqubutshebrew";
                }
            case 1468:
                if (i == 0) {
                    return "afii57807";
                }
                if (i == 1) {
                    return "dagesh";
                }
                if (i == 2) {
                    return "dageshhebrew";
                }
                if (i == 3) {
                    return "lamedholamdagesh";
                }
                if (i == 4) {
                    return "lamedholamdageshhebrew";
                }
                break;
            case 1469:
                if (i == 0) {
                    return "afii57839";
                }
                if (i == 1) {
                    return "siluqhebrew";
                }
                if (i == 2) {
                    return "siluqlefthebrew";
                }
                break;
            case 1470:
                if (i == 0) {
                    return "afii57645";
                }
                if (i == 1) {
                    return "maqafhebrew";
                }
                break;
            case 1471:
                if (i == 0) {
                    return "afii57841";
                }
                if (i == 1) {
                    return "rafe";
                }
                if (i == 2) {
                    return "rafehebrew";
                }
                break;
            case 1472:
                if (i == 0) {
                    return "afii57842";
                }
                if (i == 1) {
                    return "paseqhebrew";
                }
                break;
            case 1473:
                if (i == 0) {
                    return "afii57804";
                }
                if (i == 1) {
                    return "shindothebrew";
                }
                break;
            case 1474:
                if (i == 0) {
                    return "afii57803";
                }
                if (i == 1) {
                    return "sindothebrew";
                }
                break;
            case 1475:
                if (i == 0) {
                    return "afii57658";
                }
                if (i == 1) {
                    return "sofpasuqhebrew";
                }
                break;
            case 1488:
                if (i == 0) {
                    return "afii57664";
                }
                if (i == 1) {
                    return "alef";
                }
                if (i == 2) {
                    return "alefhebrew";
                }
                break;
            case 1489:
                if (i == 0) {
                    return "afii57665";
                }
                if (i == 1) {
                    return "bet";
                }
                if (i == 2) {
                    return "bethebrew";
                }
                break;
            case 1490:
                if (i == 0) {
                    return "afii57666";
                }
                if (i == 1) {
                    return "gimel";
                }
                if (i == 2) {
                    return "gimelhebrew";
                }
                break;
            case 1491:
                switch (i) {
                    case 0:
                        return "afii57667";
                    case 1:
                        return "dalet";
                    case 2:
                        return "dalethatafpatah";
                    case 3:
                        return "dalethatafpatahhebrew";
                    case 4:
                        return "dalethatafsegol";
                    case 5:
                        return "dalethatafsegolhebrew";
                    case 6:
                        return "dalethebrew";
                    case 7:
                        return "dalethiriq";
                    case 8:
                        return "dalethiriqhebrew";
                    case 9:
                        return "daletholam";
                    case 10:
                        return "daletholamhebrew";
                    case 11:
                        return "daletpatah";
                    case 12:
                        return "daletpatahhebrew";
                    case 13:
                        return "daletqamats";
                    case 14:
                        return "daletqamatshebrew";
                    case 15:
                        return "daletqubuts";
                    case 16:
                        return "daletqubutshebrew";
                    case 17:
                        return "daletsegol";
                    case 18:
                        return "daletsegolhebrew";
                    case 19:
                        return "daletsheva";
                    case 20:
                        return "daletshevahebrew";
                    case 21:
                        return "dalettsere";
                    case 22:
                        return "dalettserehebrew";
                }
            case 1492:
                if (i == 0) {
                    return "afii57668";
                }
                if (i == 1) {
                    return TranslateLanguage.HEBREW;
                }
                if (i == 2) {
                    return "hehebrew";
                }
                break;
            case 1493:
                if (i == 0) {
                    return "afii57669";
                }
                if (i == 1) {
                    return "vav";
                }
                if (i == 2) {
                    return "vavhebrew";
                }
                break;
            case 1494:
                if (i == 0) {
                    return "afii57670";
                }
                if (i == 1) {
                    return "zayin";
                }
                if (i == 2) {
                    return "zayinhebrew";
                }
                break;
            case 1495:
                if (i == 0) {
                    return "afii57671";
                }
                if (i == 1) {
                    return "het";
                }
                if (i == 2) {
                    return "hethebrew";
                }
                break;
            case 1496:
                if (i == 0) {
                    return "afii57672";
                }
                if (i == 1) {
                    return "tet";
                }
                if (i == 2) {
                    return "tethebrew";
                }
                break;
            case 1497:
                if (i == 0) {
                    return "afii57673";
                }
                if (i == 1) {
                    return "yod";
                }
                if (i == 2) {
                    return "yodhebrew";
                }
                break;
            case 1498:
                switch (i) {
                    case 0:
                        return "afii57674";
                    case 1:
                        return "finalkaf";
                    case 2:
                        return "finalkafhebrew";
                    case 3:
                        return "finalkafqamats";
                    case 4:
                        return "finalkafqamatshebrew";
                    case 5:
                        return "finalkafsheva";
                    case 6:
                        return "finalkafshevahebrew";
                }
            case 1499:
                if (i == 0) {
                    return "afii57675";
                }
                if (i == 1) {
                    return "kaf";
                }
                if (i == 2) {
                    return "kafhebrew";
                }
                break;
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                switch (i) {
                    case 0:
                        return "afii57676";
                    case 1:
                        return "lamed";
                    case 2:
                        return "lamedhebrew";
                    case 3:
                        return "lamedholam";
                    case 4:
                        return "lamedholamdagesh";
                    case 5:
                        return "lamedholamdageshhebrew";
                    case 6:
                        return "lamedholamhebrew";
                }
            case 1501:
                if (i == 0) {
                    return "afii57677";
                }
                if (i == 1) {
                    return "finalmem";
                }
                if (i == 2) {
                    return "finalmemhebrew";
                }
                break;
            case 1502:
                if (i == 0) {
                    return "afii57678";
                }
                if (i == 1) {
                    return "mem";
                }
                if (i == 2) {
                    return "memhebrew";
                }
                break;
            case 1503:
                if (i == 0) {
                    return "afii57679";
                }
                if (i == 1) {
                    return "finalnun";
                }
                if (i == 2) {
                    return "finalnunhebrew";
                }
                break;
            case 1504:
                if (i == 0) {
                    return "afii57680";
                }
                if (i == 1) {
                    return "nun";
                }
                if (i == 2) {
                    return "nunhebrew";
                }
                break;
            case 1505:
                if (i == 0) {
                    return "afii57681";
                }
                if (i == 1) {
                    return "samekh";
                }
                if (i == 2) {
                    return "samekhhebrew";
                }
                break;
            case 1506:
                if (i == 0) {
                    return "afii57682";
                }
                if (i == 1) {
                    return "ayin";
                }
                if (i == 2) {
                    return "ayinhebrew";
                }
                break;
            case 1507:
                if (i == 0) {
                    return "afii57683";
                }
                if (i == 1) {
                    return "finalpe";
                }
                if (i == 2) {
                    return "finalpehebrew";
                }
                break;
            case 1508:
                if (i == 0) {
                    return "afii57684";
                }
                if (i == 1) {
                    return "pe";
                }
                if (i == 2) {
                    return "pehebrew";
                }
                break;
            case 1509:
                if (i == 0) {
                    return "afii57685";
                }
                if (i == 1) {
                    return "finaltsadi";
                }
                if (i == 2) {
                    return "finaltsadihebrew";
                }
                break;
            case 1510:
                if (i == 0) {
                    return "afii57686";
                }
                if (i == 1) {
                    return "tsadi";
                }
                if (i == 2) {
                    return "tsadihebrew";
                }
                break;
            case 1511:
                switch (i) {
                    case 0:
                        return "afii57687";
                    case 1:
                        return "qof";
                    case 2:
                        return "qofhatafpatah";
                    case 3:
                        return "qofhatafpatahhebrew";
                    case 4:
                        return "qofhatafsegol";
                    case 5:
                        return "qofhatafsegolhebrew";
                    case 6:
                        return "qofhebrew";
                    case 7:
                        return "qofhiriq";
                    case 8:
                        return "qofhiriqhebrew";
                    case 9:
                        return "qofholam";
                    case 10:
                        return "qofholamhebrew";
                    case 11:
                        return "qofpatah";
                    case 12:
                        return "qofpatahhebrew";
                    case 13:
                        return "qofqamats";
                    case 14:
                        return "qofqamatshebrew";
                    case 15:
                        return "qofqubuts";
                    case 16:
                        return "qofqubutshebrew";
                    case 17:
                        return "qofsegol";
                    case 18:
                        return "qofsegolhebrew";
                    case 19:
                        return "qofsheva";
                    case 20:
                        return "qofshevahebrew";
                    case 21:
                        return "qoftsere";
                    case 22:
                        return "qoftserehebrew";
                }
            case 1512:
                switch (i) {
                    case 0:
                        return "afii57688";
                    case 1:
                        return "resh";
                    case 2:
                        return "reshhatafpatah";
                    case 3:
                        return "reshhatafpatahhebrew";
                    case 4:
                        return "reshhatafsegol";
                    case 5:
                        return "reshhatafsegolhebrew";
                    case 6:
                        return "reshhebrew";
                    case 7:
                        return "reshhiriq";
                    case 8:
                        return "reshhiriqhebrew";
                    case 9:
                        return "reshholam";
                    case 10:
                        return "reshholamhebrew";
                    case 11:
                        return "reshpatah";
                    case 12:
                        return "reshpatahhebrew";
                    case 13:
                        return "reshqamats";
                    case 14:
                        return "reshqamatshebrew";
                    case 15:
                        return "reshqubuts";
                    case 16:
                        return "reshqubutshebrew";
                    case 17:
                        return "reshsegol";
                    case 18:
                        return "reshsegolhebrew";
                    case 19:
                        return "reshsheva";
                    case 20:
                        return "reshshevahebrew";
                    case 21:
                        return "reshtsere";
                    case 22:
                        return "reshtserehebrew";
                }
            case 1513:
                if (i == 0) {
                    return "afii57689";
                }
                if (i == 1) {
                    return "shin";
                }
                if (i == 2) {
                    return "shinhebrew";
                }
                break;
            case 1514:
                if (i == 0) {
                    return "afii57690";
                }
                if (i == 1) {
                    return "tav";
                }
                if (i == 2) {
                    return "tavhebrew";
                }
                break;
            case 1520:
                if (i == 0) {
                    return "afii57716";
                }
                if (i == 1) {
                    return "vavvavhebrew";
                }
                break;
            case 1521:
                if (i == 0) {
                    return "afii57717";
                }
                if (i == 1) {
                    return "vavyodhebrew";
                }
                break;
            case 1522:
                if (i == 0) {
                    return "afii57718";
                }
                if (i == 1) {
                    return "yodyodhebrew";
                }
                break;
            case 1548:
                if (i == 0) {
                    return "afii57388";
                }
                if (i == 1) {
                    return "commaarabic";
                }
                break;
            case 1563:
                if (i == 0) {
                    return "afii57403";
                }
                if (i == 1) {
                    return "semicolonarabic";
                }
                break;
            case 1567:
                if (i == 0) {
                    return "afii57407";
                }
                if (i == 1) {
                    return "questionarabic";
                }
                break;
            case 1569:
                switch (i) {
                    case 0:
                        return "afii57409";
                    case 1:
                        return "hamzaarabic";
                    case 2:
                        return "hamzadammaarabic";
                    case 3:
                        return "hamzadammatanarabic";
                    case 4:
                        return "hamzafathaarabic";
                    case 5:
                        return "hamzafathatanarabic";
                    case 6:
                        return "hamzalowarabic";
                    case 7:
                        return "hamzalowkasraarabic";
                    case 8:
                        return "hamzalowkasratanarabic";
                    case 9:
                        return "hamzasukunarabic";
                }
            case 1570:
                if (i == 0) {
                    return "afii57410";
                }
                if (i == 1) {
                    return "alefmaddaabovearabic";
                }
                break;
            case 1571:
                if (i == 0) {
                    return "afii57411";
                }
                if (i == 1) {
                    return "alefhamzaabovearabic";
                }
                break;
            case 1572:
                if (i == 0) {
                    return "afii57412";
                }
                if (i == 1) {
                    return "wawhamzaabovearabic";
                }
                break;
            case 1573:
                if (i == 0) {
                    return "afii57413";
                }
                if (i == 1) {
                    return "alefhamzabelowarabic";
                }
                break;
            case 1574:
                if (i == 0) {
                    return "afii57414";
                }
                if (i == 1) {
                    return "yehhamzaabovearabic";
                }
                break;
            case 1575:
                if (i == 0) {
                    return "afii57415";
                }
                if (i == 1) {
                    return "alefarabic";
                }
                break;
            case 1576:
                if (i == 0) {
                    return "afii57416";
                }
                if (i == 1) {
                    return "beharabic";
                }
                break;
            case 1577:
                if (i == 0) {
                    return "afii57417";
                }
                if (i == 1) {
                    return "tehmarbutaarabic";
                }
                break;
            case 1578:
                if (i == 0) {
                    return "afii57418";
                }
                if (i == 1) {
                    return "teharabic";
                }
                break;
            case 1579:
                if (i == 0) {
                    return "afii57419";
                }
                if (i == 1) {
                    return "theharabic";
                }
                break;
            case 1580:
                if (i == 0) {
                    return "afii57420";
                }
                if (i == 1) {
                    return "jeemarabic";
                }
                break;
            case 1581:
                if (i == 0) {
                    return "afii57421";
                }
                if (i == 1) {
                    return "haharabic";
                }
                break;
            case 1582:
                if (i == 0) {
                    return "afii57422";
                }
                if (i == 1) {
                    return "khaharabic";
                }
                break;
            case 1583:
                if (i == 0) {
                    return "afii57423";
                }
                if (i == 1) {
                    return "dalarabic";
                }
                break;
            case 1584:
                if (i == 0) {
                    return "afii57424";
                }
                if (i == 1) {
                    return "thalarabic";
                }
                break;
            case 1585:
                if (i == 0) {
                    return "afii57425";
                }
                if (i == 1) {
                    return "reharabic";
                }
                if (i == 2) {
                    return "rehyehaleflamarabic";
                }
                break;
            case 1586:
                if (i == 0) {
                    return "afii57426";
                }
                if (i == 1) {
                    return "zainarabic";
                }
                break;
            case 1587:
                if (i == 0) {
                    return "afii57427";
                }
                if (i == 1) {
                    return "seenarabic";
                }
                break;
            case 1588:
                if (i == 0) {
                    return "afii57428";
                }
                if (i == 1) {
                    return "sheenarabic";
                }
                break;
            case 1589:
                if (i == 0) {
                    return "afii57429";
                }
                if (i == 1) {
                    return "sadarabic";
                }
                break;
            case 1590:
                if (i == 0) {
                    return "afii57430";
                }
                if (i == 1) {
                    return "dadarabic";
                }
                break;
            case 1591:
                if (i == 0) {
                    return "afii57431";
                }
                if (i == 1) {
                    return "taharabic";
                }
                break;
            case 1592:
                if (i == 0) {
                    return "afii57432";
                }
                if (i == 1) {
                    return "zaharabic";
                }
                break;
            case 1593:
                if (i == 0) {
                    return "afii57433";
                }
                if (i == 1) {
                    return "ainarabic";
                }
                break;
            case 1594:
                if (i == 0) {
                    return "afii57434";
                }
                if (i == 1) {
                    return "ghainarabic";
                }
                break;
            case 1600:
                if (i == 0) {
                    return "afii57440";
                }
                if (i == 1) {
                    return "kashidaautoarabic";
                }
                if (i == 2) {
                    return "kashidaautonosidebearingarabic";
                }
                if (i == 3) {
                    return "tatweelarabic";
                }
                break;
            case 1601:
                if (i == 0) {
                    return "afii57441";
                }
                if (i == 1) {
                    return "feharabic";
                }
                break;
            case 1602:
                if (i == 0) {
                    return "afii57442";
                }
                if (i == 1) {
                    return "qafarabic";
                }
                break;
            case 1603:
                if (i == 0) {
                    return "afii57443";
                }
                if (i == 1) {
                    return "kafarabic";
                }
                break;
            case 1604:
                if (i == 0) {
                    return "afii57444";
                }
                if (i == 1) {
                    return "lamarabic";
                }
                if (i == 2) {
                    return "rehyehaleflamarabic";
                }
                break;
            case 1605:
                if (i == 0) {
                    return "afii57445";
                }
                if (i == 1) {
                    return "meemarabic";
                }
                break;
            case 1606:
                if (i == 0) {
                    return "afii57446";
                }
                if (i == 1) {
                    return "noonarabic";
                }
                break;
            case 1607:
                if (i == 0) {
                    return "afii57470";
                }
                if (i == 1) {
                    return "heharabic";
                }
                break;
            case 1608:
                if (i == 0) {
                    return "afii57448";
                }
                if (i == 1) {
                    return "wawarabic";
                }
                break;
            case 1609:
                if (i == 0) {
                    return "afii57449";
                }
                if (i == 1) {
                    return "alefmaksuraarabic";
                }
                break;
            case 1610:
                if (i == 0) {
                    return "afii57450";
                }
                if (i == 1) {
                    return "yeharabic";
                }
                break;
            case 1611:
                if (i == 0) {
                    return "afii57451";
                }
                if (i == 1) {
                    return "fathatanarabic";
                }
                if (i == 2) {
                    return "hamzafathatanarabic";
                }
                if (i == 3) {
                    return "shaddafathatanarabic";
                }
                break;
            case 1612:
                if (i == 0) {
                    return "afii57452";
                }
                if (i == 1) {
                    return "dammatanaltonearabic";
                }
                if (i == 2) {
                    return "dammatanarabic";
                }
                if (i == 3) {
                    return "hamzadammatanarabic";
                }
                break;
            case 1613:
                if (i == 0) {
                    return "afii57453";
                }
                if (i == 1) {
                    return "hamzalowkasratanarabic";
                }
                if (i == 2) {
                    return "kasratanarabic";
                }
                break;
            case 1614:
                if (i == 0) {
                    return "afii57454";
                }
                if (i == 1) {
                    return "fathaarabic";
                }
                if (i == 2) {
                    return "fathalowarabic";
                }
                if (i == 3) {
                    return "hamzafathaarabic";
                }
                break;
            case 1615:
                if (i == 0) {
                    return "afii57455";
                }
                if (i == 1) {
                    return "dammaarabic";
                }
                if (i == 2) {
                    return "dammalowarabic";
                }
                if (i == 3) {
                    return "hamzadammaarabic";
                }
                break;
            case 1616:
                if (i == 0) {
                    return "afii57456";
                }
                if (i == 1) {
                    return "hamzalowkasraarabic";
                }
                if (i == 2) {
                    return "kasraarabic";
                }
                break;
            case 1617:
                if (i == 0) {
                    return "afii57457";
                }
                if (i == 1) {
                    return "shaddaarabic";
                }
                if (i == 2) {
                    return "shaddafathatanarabic";
                }
                break;
            case 1618:
                if (i == 0) {
                    return "afii57458";
                }
                if (i == 1) {
                    return "hamzasukunarabic";
                }
                if (i == 2) {
                    return "sukunarabic";
                }
                break;
            case 1632:
                if (i == 0) {
                    return "afii57392";
                }
                if (i == 1) {
                    return "zeroarabic";
                }
                if (i == 2) {
                    return "zerohackarabic";
                }
                break;
            case 1633:
                if (i == 0) {
                    return "afii57393";
                }
                if (i == 1) {
                    return "onearabic";
                }
                if (i == 2) {
                    return "onehackarabic";
                }
                break;
            case 1634:
                if (i == 0) {
                    return "afii57394";
                }
                if (i == 1) {
                    return "twoarabic";
                }
                if (i == 2) {
                    return "twohackarabic";
                }
                break;
            case 1635:
                if (i == 0) {
                    return "afii57395";
                }
                if (i == 1) {
                    return "threearabic";
                }
                if (i == 2) {
                    return "threehackarabic";
                }
                break;
            case 1636:
                if (i == 0) {
                    return "afii57396";
                }
                if (i == 1) {
                    return "fourarabic";
                }
                if (i == 2) {
                    return "fourhackarabic";
                }
                break;
            case 1637:
                if (i == 0) {
                    return "afii57397";
                }
                if (i == 1) {
                    return "fivearabic";
                }
                if (i == 2) {
                    return "fivehackarabic";
                }
                break;
            case 1638:
                if (i == 0) {
                    return "afii57398";
                }
                if (i == 1) {
                    return "sixarabic";
                }
                if (i == 2) {
                    return "sixhackarabic";
                }
                break;
            case 1639:
                if (i == 0) {
                    return "afii57399";
                }
                if (i == 1) {
                    return "sevenarabic";
                }
                if (i == 2) {
                    return "sevenhackarabic";
                }
                break;
            case 1640:
                if (i == 0) {
                    return "afii57400";
                }
                if (i == 1) {
                    return "eightarabic";
                }
                if (i == 2) {
                    return "eighthackarabic";
                }
                break;
            case 1641:
                if (i == 0) {
                    return "afii57401";
                }
                if (i == 1) {
                    return "ninearabic";
                }
                if (i == 2) {
                    return "ninehackarabic";
                }
                break;
            case 1642:
                if (i == 0) {
                    return "afii57381";
                }
                if (i == 1) {
                    return "percentarabic";
                }
                break;
            case 1643:
                if (i == 0) {
                    return "decimalseparatorarabic";
                }
                if (i == 1) {
                    return "decimalseparatorpersian";
                }
                break;
            case 1644:
                if (i == 0) {
                    return "thousandsseparatorarabic";
                }
                if (i == 1) {
                    return "thousandsseparatorpersian";
                }
                break;
            case 1645:
                if (i == 0) {
                    return "afii63167";
                }
                if (i == 1) {
                    return "asteriskaltonearabic";
                }
                if (i == 2) {
                    return "asteriskarabic";
                }
                break;
            case 1657:
                if (i == 0) {
                    return "afii57511";
                }
                if (i == 1) {
                    return "tteharabic";
                }
                break;
            case 1662:
                if (i == 0) {
                    return "afii57506";
                }
                if (i == 1) {
                    return "peharabic";
                }
                break;
            case 1670:
                if (i == 0) {
                    return "afii57507";
                }
                if (i == 1) {
                    return "tcheharabic";
                }
                break;
            case 1672:
                if (i == 0) {
                    return "afii57512";
                }
                if (i == 1) {
                    return "ddalarabic";
                }
                break;
            case 1681:
                if (i == 0) {
                    return "afii57513";
                }
                if (i == 1) {
                    return "rreharabic";
                }
                break;
            case 1688:
                if (i == 0) {
                    return "afii57508";
                }
                if (i == 1) {
                    return "jeharabic";
                }
                break;
            case 1700:
                if (i == 0) {
                    return "afii57505";
                }
                if (i == 1) {
                    return "veharabic";
                }
                break;
            case 1711:
                if (i == 0) {
                    return "afii57509";
                }
                if (i == 1) {
                    return "gafarabic";
                }
                break;
            case 1722:
                if (i == 0) {
                    return "afii57514";
                }
                if (i == 1) {
                    return "noonghunnaarabic";
                }
                break;
            case 1729:
                if (i == 0) {
                    return "haaltonearabic";
                }
                if (i == 1) {
                    return "hehaltonearabic";
                }
                break;
            case 1746:
                if (i == 0) {
                    return "afii57519";
                }
                if (i == 1) {
                    return "yehbarreearabic";
                }
                break;
            case 8204:
                if (i == 0) {
                    return "afii61664";
                }
                if (i == 1) {
                    return "zerowidthnonjoiner";
                }
                break;
            case 8213:
                if (i == 0) {
                    return "afii00208";
                }
                if (i == 1) {
                    return "horizontalbar";
                }
                break;
            case 8215:
                if (i == 0) {
                    return "dbllowline";
                }
                if (i == 1) {
                    return "underscoredbl";
                }
                break;
            case 8219:
                if (i == 0) {
                    return "quoteleftreversed";
                }
                if (i == 1) {
                    return "quotereversed";
                }
                break;
            case 8229:
                if (i == 0) {
                    return "twodotenleader";
                }
                if (i == 1) {
                    return "twodotleader";
                }
                break;
            case 8353:
                if (i == 0) {
                    return "colonmonetary";
                }
                if (i == 1) {
                    return "colonsign";
                }
                break;
            case 8356:
                if (i == 0) {
                    return "afii08941";
                }
                if (i == 1) {
                    return "lira";
                }
                break;
            case 8362:
                if (i == 0) {
                    return "afii57636";
                }
                if (i == 1) {
                    return "newsheqelsign";
                }
                if (i == 2) {
                    return "sheqel";
                }
                if (i == 3) {
                    return "sheqelhebrew";
                }
                break;
            case 8364:
                if (i == 0) {
                    return "Euro";
                }
                if (i == 1) {
                    return "euro";
                }
                break;
            case 8453:
                if (i == 0) {
                    return "afii61248";
                }
                if (i == 1) {
                    return "careof";
                }
                break;
            case 8467:
                if (i == 0) {
                    return "afii61289";
                }
                if (i == 1) {
                    return "lsquare";
                }
                break;
            case 8470:
                if (i == 0) {
                    return "afii61352";
                }
                if (i == 1) {
                    return "numero";
                }
                break;
            case 8486:
                if (i == 0) {
                    return "Ohm";
                }
                if (i == 1) {
                    return "Omega";
                }
                break;
            case 8616:
                if (i == 0) {
                    return "arrowupdnbse";
                }
                if (i == 1) {
                    return "arrowupdownbase";
                }
                break;
            case 8656:
                if (i == 0) {
                    return "arrowdblleft";
                }
                if (i == 1) {
                    return "arrowleftdbl";
                }
                break;
            case 8658:
                if (i == 0) {
                    return "arrowdblright";
                }
                if (i == 1) {
                    return "dblarrowright";
                }
                break;
            case 8660:
                if (i == 0) {
                    return "arrowdblboth";
                }
                if (i == 1) {
                    return "dblarrowleft";
                }
                break;
            case 8704:
                if (i == 0) {
                    return "forall";
                }
                if (i == 1) {
                    return "universal";
                }
                break;
            case 8707:
                if (i == 0) {
                    return "existential";
                }
                if (i == 1) {
                    return "thereexists";
                }
                break;
            case 8710:
                if (i == 0) {
                    return "Delta";
                }
                if (i == 1) {
                    return "increment";
                }
                break;
            case 8711:
                if (i == 0) {
                    return "gradient";
                }
                if (i == 1) {
                    return "nabla";
                }
                break;
            case 8713:
                if (i == 0) {
                    return "notelement";
                }
                if (i == 1) {
                    return "notelementof";
                }
                break;
            case 8735:
                if (i == 0) {
                    return "orthogonal";
                }
                if (i == 1) {
                    return "rightangle";
                }
                break;
            case 8764:
                if (i == 0) {
                    return "similar";
                }
                if (i == 1) {
                    return "tildeoperator";
                }
                break;
            case 8773:
                if (i == 0) {
                    return "approximatelyequal";
                }
                if (i == 1) {
                    return "congruent";
                }
                break;
            case 8834:
                if (i == 0) {
                    return "propersubset";
                }
                if (i == 1) {
                    return "subset";
                }
                break;
            case 8835:
                if (i == 0) {
                    return "propersuperset";
                }
                if (i == 1) {
                    return "superset";
                }
                break;
            case 8838:
                if (i == 0) {
                    return "reflexsubset";
                }
                if (i == 1) {
                    return "subsetorequal";
                }
                break;
            case 8839:
                if (i == 0) {
                    return "reflexsuperset";
                }
                if (i == 1) {
                    return "supersetorequal";
                }
                break;
            case 8853:
                if (i == 0) {
                    return "circleplus";
                }
                if (i == 1) {
                    return "pluscircle";
                }
                break;
            case 8855:
                if (i == 0) {
                    return "circlemultiply";
                }
                if (i == 1) {
                    return "timescircle";
                }
                break;
            case 8976:
                if (i == 0) {
                    return "logicalnotreversed";
                }
                if (i == 1) {
                    return "revlogicalnot";
                }
                break;
            case 8992:
                if (i == 0) {
                    return "integraltop";
                }
                if (i == 1) {
                    return "integraltp";
                }
                break;
            case 8993:
                if (i == 0) {
                    return "integralbottom";
                }
                if (i == 1) {
                    return "integralbt";
                }
                break;
            case 9617:
                if (i == 0) {
                    return "ltshade";
                }
                if (i == 1) {
                    return "shadelight";
                }
                break;
            case 9618:
                if (i == 0) {
                    return "shade";
                }
                if (i == 1) {
                    return "shademedium";
                }
                break;
            case 9619:
                if (i == 0) {
                    return "dkshade";
                }
                if (i == 1) {
                    return "shadedark";
                }
                break;
            case 9632:
                if (i == 0) {
                    return "blacksquare";
                }
                if (i == 1) {
                    return "filledbox";
                }
                break;
            case 9633:
                if (i == 0) {
                    return "H22073";
                }
                if (i == 1) {
                    return "whitesquare";
                }
                break;
            case 9642:
                if (i == 0) {
                    return "H18543";
                }
                if (i == 1) {
                    return "blacksmallsquare";
                }
                break;
            case 9643:
                if (i == 0) {
                    return "H18551";
                }
                if (i == 1) {
                    return "whitesmallsquare";
                }
                break;
            case 9644:
                if (i == 0) {
                    return "blackrectangle";
                }
                if (i == 1) {
                    return "filledrect";
                }
                break;
            case 9650:
                if (i == 0) {
                    return "blackuppointingtriangle";
                }
                if (i == 1) {
                    return "triagup";
                }
                break;
            case 9658:
                if (i == 0) {
                    return "blackrightpointingpointer";
                }
                if (i == 1) {
                    return "triagrt";
                }
                break;
            case 9660:
                if (i == 0) {
                    return "blackdownpointingtriangle";
                }
                if (i == 1) {
                    return "triagdn";
                }
                break;
            case 9668:
                if (i == 0) {
                    return "blackleftpointingpointer";
                }
                if (i == 1) {
                    return "triaglf";
                }
                break;
            case 9675:
                if (i == 0) {
                    return "circle";
                }
                if (i == 1) {
                    return "whitecircle";
                }
                break;
            case 9679:
                if (i == 0) {
                    return "H18533";
                }
                if (i == 1) {
                    return "blackcircle";
                }
                break;
            case 9688:
                if (i == 0) {
                    return "bulletinverse";
                }
                if (i == 1) {
                    return "invbullet";
                }
                break;
            case 9689:
                if (i == 0) {
                    return "invcircle";
                }
                if (i == 1) {
                    return "whitecircleinverse";
                }
                break;
            case 9702:
                if (i == 0) {
                    return "openbullet";
                }
                if (i == 1) {
                    return "whitebullet";
                }
                break;
            case 9786:
                if (i == 0) {
                    return "smileface";
                }
                if (i == 1) {
                    return "whitesmilingface";
                }
                break;
            case 9787:
                if (i == 0) {
                    return "blacksmilingface";
                }
                if (i == 1) {
                    return "invsmileface";
                }
                break;
            case 9788:
                if (i == 0) {
                    return "compass";
                }
                if (i == 1) {
                    return LocalePreferences.FirstDayOfWeek.SUNDAY;
                }
                break;
            case 9792:
                if (i == 0) {
                    return User.FEMALE;
                }
                if (i == 1) {
                    return "venus";
                }
                break;
            case 9794:
                if (i == 0) {
                    return User.MALE;
                }
                if (i == 1) {
                    return "mars";
                }
                break;
            case 9824:
                if (i == 0) {
                    return "spade";
                }
                if (i == 1) {
                    return "spadesuitblack";
                }
                break;
            case 9827:
                if (i == 0) {
                    return "club";
                }
                if (i == 1) {
                    return "clubsuitblack";
                }
                break;
            case 9829:
                if (i == 0) {
                    return "heart";
                }
                if (i == 1) {
                    return "heartsuitblack";
                }
                break;
            case 9835:
                if (i == 0) {
                    return "eighthnotebeamed";
                }
                if (i == 1) {
                    return "musicalnotedbl";
                }
                break;
            case 64287:
                if (i == 0) {
                    return "afii57705";
                }
                if (i == 1) {
                    return "doubleyodpatah";
                }
                if (i == 2) {
                    return "doubleyodpatahhebrew";
                }
                if (i == 3) {
                    return "yodyodpatahhebrew";
                }
                break;
            case 64298:
                if (i == 0) {
                    return "afii57694";
                }
                if (i == 1) {
                    return "shinshindot";
                }
                if (i == 2) {
                    return "shinshindothebrew";
                }
                break;
            case 64299:
                if (i == 0) {
                    return "afii57695";
                }
                if (i == 1) {
                    return "shinsindot";
                }
                if (i == 2) {
                    return "shinsindothebrew";
                }
                break;
            case 64300:
                if (i == 0) {
                    return "shindageshshindot";
                }
                if (i == 1) {
                    return "shindageshshindothebrew";
                }
                break;
            case 64301:
                if (i == 0) {
                    return "shindageshsindot";
                }
                if (i == 1) {
                    return "shindageshsindothebrew";
                }
                break;
            case 64305:
                if (i == 0) {
                    return "betdagesh";
                }
                if (i == 1) {
                    return "betdageshhebrew";
                }
                break;
            case 64306:
                if (i == 0) {
                    return "gimeldagesh";
                }
                if (i == 1) {
                    return "gimeldageshhebrew";
                }
                break;
            case 64307:
                if (i == 0) {
                    return "daletdagesh";
                }
                if (i == 1) {
                    return "daletdageshhebrew";
                }
                break;
            case 64308:
                if (i == 0) {
                    return "hedagesh";
                }
                if (i == 1) {
                    return "hedageshhebrew";
                }
                break;
            case 64309:
                if (i == 0) {
                    return "afii57723";
                }
                if (i == 1) {
                    return "vavdagesh";
                }
                if (i == 2) {
                    return "vavdagesh65";
                }
                if (i == 3) {
                    return "vavdageshhebrew";
                }
                break;
            case 64310:
                if (i == 0) {
                    return "zayindagesh";
                }
                if (i == 1) {
                    return "zayindageshhebrew";
                }
                break;
            case 64312:
                if (i == 0) {
                    return "tetdagesh";
                }
                if (i == 1) {
                    return "tetdageshhebrew";
                }
                break;
            case 64313:
                if (i == 0) {
                    return "yoddagesh";
                }
                if (i == 1) {
                    return "yoddageshhebrew";
                }
                break;
            case 64314:
                if (i == 0) {
                    return "finalkafdagesh";
                }
                if (i == 1) {
                    return "finalkafdageshhebrew";
                }
                break;
            case 64315:
                if (i == 0) {
                    return "kafdagesh";
                }
                if (i == 1) {
                    return "kafdageshhebrew";
                }
                break;
            case 64316:
                if (i == 0) {
                    return "lameddagesh";
                }
                if (i == 1) {
                    return "lameddageshhebrew";
                }
                break;
            case 64318:
                if (i == 0) {
                    return "memdagesh";
                }
                if (i == 1) {
                    return "memdageshhebrew";
                }
                break;
            case 64320:
                if (i == 0) {
                    return "nundagesh";
                }
                if (i == 1) {
                    return "nundageshhebrew";
                }
                break;
            case 64321:
                if (i == 0) {
                    return "samekhdagesh";
                }
                if (i == 1) {
                    return "samekhdageshhebrew";
                }
                break;
            case 64324:
                if (i == 0) {
                    return "pedagesh";
                }
                if (i == 1) {
                    return "pedageshhebrew";
                }
                break;
            case 64326:
                if (i == 0) {
                    return "tsadidagesh";
                }
                if (i == 1) {
                    return "tsadidageshhebrew";
                }
                break;
            case 64327:
                if (i == 0) {
                    return "qofdagesh";
                }
                if (i == 1) {
                    return "qofdageshhebrew";
                }
                break;
            case 64329:
                if (i == 0) {
                    return "shindagesh";
                }
                if (i == 1) {
                    return "shindageshhebrew";
                }
                break;
            case 64330:
                if (i == 0) {
                    return "tavdages";
                }
                if (i == 1) {
                    return "tavdagesh";
                }
                if (i == 2) {
                    return "tavdageshhebrew";
                }
                break;
            case 64331:
                if (i == 0) {
                    return "afii57700";
                }
                if (i == 1) {
                    return "vavholam";
                }
                if (i == 2) {
                    return "vavholamhebrew";
                }
                break;
            case 64380:
                if (i == 0) {
                    return "tchehinitialarabic";
                }
                if (i == 1) {
                    return "tchehmeeminitialarabic";
                }
                break;
            case 65166:
                if (i == 0) {
                    return "aleffinalarabic";
                }
                if (i == 1) {
                    return "rehyehaleflamarabic";
                }
                break;
            case 65184:
                if (i == 0) {
                    return "jeemmedialarabic";
                }
                if (i == 1) {
                    return "lammeemjeeminitialarabic";
                }
                break;
            case 65192:
                if (i == 0) {
                    return "khahmedialarabic";
                }
                if (i == 1) {
                    return "lammeemkhahinitialarabic";
                }
                break;
            case 65247:
                if (i == 0) {
                    return "laminitialarabic";
                }
                if (i == 1) {
                    return "lammeemjeeminitialarabic";
                }
                if (i == 2) {
                    return "lammeemkhahinitialarabic";
                }
                break;
            case 65252:
                if (i == 0) {
                    return "lammeemjeeminitialarabic";
                }
                if (i == 1) {
                    return "lammeemkhahinitialarabic";
                }
                if (i == 2) {
                    return "meemmedialarabic";
                }
                if (i == 3) {
                    return "tchehmeeminitialarabic";
                }
                break;
            case 65255:
                if (i == 0) {
                    return "noonhehinitialarabic";
                }
                if (i == 1) {
                    return "nooninitialarabic";
                }
                break;
            case 65258:
                if (i == 0) {
                    return "hehfinalalttwoarabic";
                }
                if (i == 1) {
                    return "hehfinalarabic";
                }
                break;
            case 65260:
                if (i == 0) {
                    return "hehmedialarabic";
                }
                if (i == 1) {
                    return "noonhehinitialarabic";
                }
                break;
            case 65267:
                if (i == 0) {
                    return "alefmaksurainitialarabic";
                }
                if (i == 1) {
                    return "rehyehaleflamarabic";
                }
                if (i == 2) {
                    return "yehinitialarabic";
                }
                break;
            case 65268:
                if (i == 0) {
                    return "alefmaksuramedialarabic";
                }
                if (i == 1) {
                    return "yehmedialarabic";
                }
                break;
            default:
                return m10663x1(c);
        }
    }
}
