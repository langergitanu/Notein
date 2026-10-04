package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzY7 {
    public static char zzW(char c) {
        if (c == '(') {
            return ')';
        }
        if (c == ')') {
            return '(';
        }
        if (c == 5787) {
            return (char) 5788;
        }
        if (c == 5788) {
            return (char) 5787;
        }
        if (c == 8249) {
            return (char) 8250;
        }
        if (c == 8250) {
            return (char) 8249;
        }
        if (c == 8261) {
            return (char) 8262;
        }
        if (c == 8262) {
            return (char) 8261;
        }
        if (c == 8317) {
            return (char) 8318;
        }
        if (c == 8318) {
            return (char) 8317;
        }
        if (c == 8333) {
            return (char) 8334;
        }
        if (c == 8334) {
            return (char) 8333;
        }
        if (c == 8764) {
            return (char) 8765;
        }
        if (c == 8765) {
            return (char) 8764;
        }
        switch (c) {
            case '<':
                return '>';
            case '>':
                return '<';
            case '[':
                return ']';
            case ']':
                return '[';
            case '{':
                return '}';
            case '}':
                return '{';
            case 171:
                return (char) 187;
            case 187:
                return (char) 171;
            case 8712:
                return (char) 8715;
            case 8713:
                return (char) 8716;
            case 8714:
                return (char) 8717;
            case 8715:
                return (char) 8712;
            case 8716:
                return (char) 8713;
            case 8717:
                return (char) 8714;
            case 8725:
                return (char) 10741;
            case 8771:
                return (char) 8909;
            case 8804:
                return (char) 8805;
            case 8805:
                return (char) 8804;
            case 8806:
                return (char) 8807;
            case 8807:
                return (char) 8806;
            case 8808:
                return (char) 8809;
            case 8809:
                return (char) 8808;
            case 8810:
                return (char) 8811;
            case 8811:
                return (char) 8810;
            case 8814:
                return (char) 8815;
            case 8815:
                return (char) 8814;
            case 8816:
                return (char) 8817;
            case 8817:
                return (char) 8816;
            case 8818:
                return (char) 8819;
            case 8819:
                return (char) 8818;
            case 8820:
                return (char) 8821;
            case 8821:
                return (char) 8820;
            case 8822:
                return (char) 8823;
            case 8823:
                return (char) 8822;
            case 8824:
                return (char) 8825;
            case 8825:
                return (char) 8824;
            case 8826:
                return (char) 8827;
            case 8827:
                return (char) 8826;
            case 8828:
                return (char) 8829;
            case 8829:
                return (char) 8828;
            case 8830:
                return (char) 8831;
            case 8831:
                return (char) 8830;
            case 8832:
                return (char) 8833;
            case 8833:
                return (char) 8832;
            case 8834:
                return (char) 8835;
            case 8835:
                return (char) 8834;
            case 8836:
                return (char) 8837;
            case 8837:
                return (char) 8836;
            case 8838:
                return (char) 8839;
            case 8839:
                return (char) 8838;
            case 8840:
                return (char) 8841;
            case 8841:
                return (char) 8840;
            case 8842:
                return (char) 8843;
            case 8843:
                return (char) 8842;
            case 8847:
                return (char) 8848;
            case 8848:
                return (char) 8847;
            case 8849:
                return (char) 8850;
            case 8850:
                return (char) 8849;
            case 8856:
                return (char) 10680;
            case 8866:
                return (char) 8867;
            case 8867:
                return (char) 8866;
            case 8870:
                return (char) 10974;
            case 8872:
                return (char) 10980;
            case 8873:
                return (char) 10979;
            case 8875:
                return (char) 10981;
            case 8880:
                return (char) 8881;
            case 8881:
                return (char) 8880;
            case 8882:
                return (char) 8883;
            case 8883:
                return (char) 8882;
            case 8884:
                return (char) 8885;
            case 8885:
                return (char) 8884;
            case 8886:
                return (char) 8887;
            case 8887:
                return (char) 8886;
            case 8905:
                return (char) 8906;
            case 8906:
                return (char) 8905;
            case 8907:
                return (char) 8908;
            case 8908:
                return (char) 8907;
            case 8909:
                return (char) 8771;
            case 8912:
                return (char) 8913;
            case 8913:
                return (char) 8912;
            case 8918:
                return (char) 8919;
            case 8919:
                return (char) 8918;
            case 8920:
                return (char) 8921;
            case 8921:
                return (char) 8920;
            case 8922:
                return (char) 8923;
            case 8923:
                return (char) 8922;
            case 8924:
                return (char) 8925;
            case 8925:
                return (char) 8924;
            case 8926:
                return (char) 8927;
            case 8927:
                return (char) 8926;
            case 8928:
                return (char) 8929;
            case 8929:
                return (char) 8928;
            case 8930:
                return (char) 8931;
            case 8931:
                return (char) 8930;
            case 8932:
                return (char) 8933;
            case 8933:
                return (char) 8932;
            case 8934:
                return (char) 8935;
            case 8935:
                return (char) 8934;
            case 8936:
                return (char) 8937;
            case 8937:
                return (char) 8936;
            case 8938:
                return (char) 8939;
            case 8939:
                return (char) 8938;
            case 8940:
                return (char) 8941;
            case 8941:
                return (char) 8940;
            case 8944:
                return (char) 8945;
            case 8945:
                return (char) 8944;
            case 8946:
                return (char) 8954;
            case 8947:
                return (char) 8955;
            case 8948:
                return (char) 8956;
            case 8950:
                return (char) 8957;
            case 8951:
                return (char) 8958;
            case 8954:
                return (char) 8946;
            case 8955:
                return (char) 8947;
            case 8956:
                return (char) 8948;
            case 8957:
                return (char) 8950;
            case 8958:
                return (char) 8951;
            case 8968:
                return (char) 8969;
            case 8969:
                return (char) 8968;
            case 8970:
                return (char) 8971;
            case 8971:
                return (char) 8970;
            case ConnectionResult.RESOLUTION_REQUIRED /* 9001 */:
                return (char) 9002;
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 9002 */:
                return (char) 9001;
            case 10088:
                return (char) 10089;
            case 10089:
                return (char) 10088;
            case 10090:
                return (char) 10091;
            case 10091:
                return (char) 10090;
            case 10092:
                return (char) 10093;
            case 10093:
                return (char) 10092;
            case 10094:
                return (char) 10095;
            case 10095:
                return (char) 10094;
            case 10096:
                return (char) 10097;
            case 10097:
                return (char) 10096;
            case 10098:
                return (char) 10099;
            case 10099:
                return (char) 10098;
            case 10100:
                return (char) 10101;
            case 10101:
                return (char) 10100;
            case 10179:
                return (char) 10180;
            case 10180:
                return (char) 10179;
            case 10181:
                return (char) 10182;
            case 10182:
                return (char) 10181;
            case 10184:
                return (char) 10185;
            case 10185:
                return (char) 10184;
            case 10197:
                return (char) 10198;
            case 10198:
                return (char) 10197;
            case 10205:
                return (char) 10206;
            case 10206:
                return (char) 10205;
            case 10210:
                return (char) 10211;
            case 10211:
                return (char) 10210;
            case 10212:
                return (char) 10213;
            case 10213:
                return (char) 10212;
            case 10214:
                return (char) 10215;
            case 10215:
                return (char) 10214;
            case 10216:
                return (char) 10217;
            case 10217:
                return (char) 10216;
            case 10218:
                return (char) 10219;
            case 10219:
                return (char) 10218;
            case 10220:
                return (char) 10221;
            case 10221:
                return (char) 10220;
            case 10222:
                return (char) 10223;
            case 10223:
                return (char) 10222;
            case 10627:
                return (char) 10628;
            case 10628:
                return (char) 10627;
            case 10629:
                return (char) 10630;
            case 10630:
                return (char) 10629;
            case 10631:
                return (char) 10632;
            case 10632:
                return (char) 10631;
            case 10633:
                return (char) 10634;
            case 10634:
                return (char) 10633;
            case 10635:
                return (char) 10636;
            case 10636:
                return (char) 10635;
            case 10637:
                return (char) 10640;
            case 10638:
                return (char) 10639;
            case 10639:
                return (char) 10638;
            case 10640:
                return (char) 10637;
            case 10641:
                return (char) 10642;
            case 10642:
                return (char) 10641;
            case 10643:
                return (char) 10644;
            case 10644:
                return (char) 10643;
            case 10645:
                return (char) 10646;
            case 10646:
                return (char) 10645;
            case 10647:
                return (char) 10648;
            case 10648:
                return (char) 10647;
            case 10680:
                return (char) 8856;
            case 10688:
                return (char) 10689;
            case 10689:
                return (char) 10688;
            case 10692:
                return (char) 10693;
            case 10693:
                return (char) 10692;
            case 10703:
                return (char) 10704;
            case 10704:
                return (char) 10703;
            case 10705:
                return (char) 10706;
            case 10706:
                return (char) 10705;
            case 10708:
                return (char) 10709;
            case 10709:
                return (char) 10708;
            case 10712:
                return (char) 10713;
            case 10713:
                return (char) 10712;
            case 10714:
                return (char) 10715;
            case 10715:
                return (char) 10714;
            case 10741:
                return (char) 8725;
            case 10744:
                return (char) 10745;
            case 10745:
                return (char) 10744;
            case 10748:
                return (char) 10749;
            case 10749:
                return (char) 10748;
            case 10795:
                return (char) 10796;
            case 10796:
                return (char) 10795;
            case 10797:
                return (char) 10798;
            case 10798:
                return (char) 10797;
            case 10804:
                return (char) 10805;
            case 10805:
                return (char) 10804;
            case 10812:
                return (char) 10813;
            case 10813:
                return (char) 10812;
            case 10852:
                return (char) 10853;
            case 10853:
                return (char) 10852;
            case 10873:
                return (char) 10874;
            case 10874:
                return (char) 10873;
            case 10877:
                return (char) 10878;
            case 10878:
                return (char) 10877;
            case 10879:
                return (char) 10880;
            case 10880:
                return (char) 10879;
            case 10881:
                return (char) 10882;
            case 10882:
                return (char) 10881;
            case 10883:
                return (char) 10884;
            case 10884:
                return (char) 10883;
            case 10891:
                return (char) 10892;
            case 10892:
                return (char) 10891;
            case 10897:
                return (char) 10898;
            case 10898:
                return (char) 10897;
            case 10899:
                return (char) 10900;
            case 10900:
                return (char) 10899;
            case 10901:
                return (char) 10902;
            case 10902:
                return (char) 10901;
            case 10903:
                return (char) 10904;
            case 10904:
                return (char) 10903;
            case 10905:
                return (char) 10906;
            case 10906:
                return (char) 10905;
            case 10907:
                return (char) 10908;
            case 10908:
                return (char) 10907;
            case 10913:
                return (char) 10914;
            case 10914:
                return (char) 10913;
            case 10918:
                return (char) 10919;
            case 10919:
                return (char) 10918;
            case 10920:
                return (char) 10921;
            case 10921:
                return (char) 10920;
            case 10922:
                return (char) 10923;
            case 10923:
                return (char) 10922;
            case 10924:
                return (char) 10925;
            case 10925:
                return (char) 10924;
            case 10927:
                return (char) 10928;
            case 10928:
                return (char) 10927;
            case 10931:
                return (char) 10932;
            case 10932:
                return (char) 10931;
            case 10939:
                return (char) 10940;
            case 10940:
                return (char) 10939;
            case 10941:
                return (char) 10942;
            case 10942:
                return (char) 10941;
            case 10943:
                return (char) 10944;
            case 10944:
                return (char) 10943;
            case 10945:
                return (char) 10946;
            case 10946:
                return (char) 10945;
            case 10947:
                return (char) 10948;
            case 10948:
                return (char) 10947;
            case 10949:
                return (char) 10950;
            case 10950:
                return (char) 10949;
            case 10957:
                return (char) 10958;
            case 10958:
                return (char) 10957;
            case 10959:
                return (char) 10960;
            case 10960:
                return (char) 10959;
            case 10961:
                return (char) 10962;
            case 10962:
                return (char) 10961;
            case 10963:
                return (char) 10964;
            case 10964:
                return (char) 10963;
            case 10965:
                return (char) 10966;
            case 10966:
                return (char) 10965;
            case 10974:
                return (char) 8870;
            case 10979:
                return (char) 8873;
            case 10980:
                return (char) 8872;
            case 10981:
                return (char) 8875;
            case 10988:
                return (char) 10989;
            case 10989:
                return (char) 10988;
            case 10999:
                return (char) 11000;
            case 11000:
                return (char) 10999;
            case 11001:
                return (char) 11002;
            case 11002:
                return (char) 11001;
            case 11778:
                return (char) 11779;
            case 11779:
                return (char) 11778;
            case 11780:
                return (char) 11781;
            case 11781:
                return (char) 11780;
            case 11785:
                return (char) 11786;
            case 11786:
                return (char) 11785;
            case 11788:
                return (char) 11789;
            case 11789:
                return (char) 11788;
            case 11804:
                return (char) 11805;
            case 11805:
                return (char) 11804;
            case 11808:
                return (char) 11809;
            case 11809:
                return (char) 11808;
            case 11810:
                return (char) 11811;
            case 11811:
                return (char) 11810;
            case 11812:
                return (char) 11813;
            case 11813:
                return (char) 11812;
            case 11814:
                return (char) 11815;
            case 11815:
                return (char) 11814;
            case 11816:
                return (char) 11817;
            case 11817:
                return (char) 11816;
            case 12296:
                return (char) 12297;
            case EditingLanguage.ENGLISH_ZIMBABWE /* 12297 */:
                return (char) 12296;
            case EditingLanguage.SPANISH_ECUADOR /* 12298 */:
                return (char) 12299;
            case 12299:
                return (char) 12298;
            case 12300:
                return (char) 12301;
            case 12301:
                return (char) 12300;
            case 12302:
                return (char) 12303;
            case 12303:
                return (char) 12302;
            case 12304:
                return (char) 12305;
            case 12305:
                return (char) 12304;
            case 12308:
                return (char) 12309;
            case 12309:
                return (char) 12308;
            case 12310:
                return (char) 12311;
            case 12311:
                return (char) 12310;
            case 12312:
                return (char) 12313;
            case 12313:
                return (char) 12312;
            case 12314:
                return (char) 12315;
            case 12315:
                return (char) 12314;
            case 65113:
                return (char) 65114;
            case 65114:
                return (char) 65113;
            case 65115:
                return (char) 65116;
            case 65116:
                return (char) 65115;
            case 65117:
                return (char) 65118;
            case 65118:
                return (char) 65117;
            case 65124:
                return (char) 65125;
            case 65125:
                return (char) 65124;
            case 65288:
                return (char) 65289;
            case 65289:
                return (char) 65288;
            case 65308:
                return (char) 65310;
            case 65310:
                return (char) 65308;
            case 65339:
                return (char) 65341;
            case 65341:
                return (char) 65339;
            case 65371:
                return (char) 65373;
            case 65373:
                return (char) 65371;
            case 65375:
                return (char) 65376;
            case 65376:
                return (char) 65375;
            case 65378:
                return (char) 65379;
            case 65379:
                return (char) 65378;
            default:
                switch (c) {
                    case 3898:
                        return (char) 3899;
                    case 3899:
                        return (char) 3898;
                    case 3900:
                        return (char) 3901;
                    case 3901:
                        return (char) 3900;
                    default:
                        switch (c) {
                            case 8786:
                                return (char) 8787;
                            case 8787:
                                return (char) 8786;
                            case 8788:
                                return (char) 8789;
                            case 8789:
                                return (char) 8788;
                            default:
                                return c;
                        }
                }
        }
    }
}
