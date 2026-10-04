package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes3.dex */
class e6q implements oow {
    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, byte[]> m5353x1(String str, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        String strM13412x1 = C3141rv.m13412x1(str, "Properties");
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "AndroidManifest.xml"), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Properties_AndroidManifest_xml_Template.txt"), "{ProjectNameLower}", C14113y2.m67368h4(xamlOptions.m3098h4())), "{ProjectName}", xamlOptions.m3098h4())));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "AssemblyInfo.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Properties_AssemblyInfo_cs_Template.txt"), "{ProjectName}", xamlOptions.m3098h4())));
        return dictionary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.oow
    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, byte[]> mo4303k4(XamlOptions xamlOptions) {
        if (C14113y2.m67411k4(xamlOptions.m3094du())) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "XamlOptions", "xamlOptions.SolutionName"));
        }
        if (C14113y2.m67411k4(xamlOptions.m3098h4())) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "XamlOptions", "xamlOptions.ProjectName"));
        }
        try {
            Dictionary<String, byte[]> dictionary = new Dictionary<>();
            String strM3094du = xamlOptions.m3094du();
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            C14047bz c14047bzClone2 = C14047bz.m66536x1().Clone();
            C14047bz c14047bzClone3 = C14047bz.m66536x1().Clone();
            KeyValuePair keyValuePairClone = m5349k4(strM3094du, c14047bzClone.Clone(), c14047bzClone2.Clone(), c14047bzClone3.Clone(), "{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", xamlOptions).Clone();
            dictionary.addItem(keyValuePairClone.getKey(), keyValuePairClone.getValue());
            String strM13412x1 = C3141rv.m13412x1(strM3094du, xamlOptions.m3098h4());
            String strM13412x12 = C3141rv.m13412x1(strM13412x1, xamlOptions.m3098h4());
            C3141rv.m13403k4(xamlOptions.m3110rv());
            KeyValuePair keyValuePairClone2 = m5355x1(strM13412x12).Clone();
            dictionary.addItem(keyValuePairClone2.getKey(), keyValuePairClone2.getValue());
            C14318pw.m69319k4(m5354x1(strM13412x12, xamlOptions.m3106kk()), dictionary);
            KeyValuePair keyValuePairClone3 = m5351k4(strM13412x12, xamlOptions.m3098h4()).Clone();
            dictionary.addItem(keyValuePairClone3.getKey(), keyValuePairClone3.getValue());
            C14318pw.m69319k4(m5347k4(strM13412x12, xamlOptions.m3106kk(), xamlOptions), dictionary);
            String strM13412x13 = C3141rv.m13412x1(strM13412x1, C14113y2.m67408k4(xamlOptions.m3098h4(), ".Android"));
            KeyValuePair keyValuePairClone4 = m5348k4(strM13412x13).Clone();
            dictionary.addItem(keyValuePairClone4.getKey(), keyValuePairClone4.getValue());
            C14318pw.m69319k4(m5353x1(strM13412x13, xamlOptions), dictionary);
            C14318pw.m69319k4(m5346k4(strM13412x13, xamlOptions), dictionary);
            KeyValuePair keyValuePairClone5 = m5352k4(strM13412x13, xamlOptions.m3106kk(), xamlOptions.m3098h4()).Clone();
            dictionary.addItem(keyValuePairClone5.getKey(), keyValuePairClone5.getValue());
            KeyValuePair keyValuePairClone6 = m5350k4(strM13412x13, c14047bzClone2.Clone(), c14047bzClone3.Clone(), "{EFBA0AD7-5A72-4C68-AF49-83D382785DCF};{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", xamlOptions).Clone();
            dictionary.addItem(keyValuePairClone6.getKey(), keyValuePairClone6.getValue());
            return dictionary;
        } catch (ArgumentException e) {
            throw new yii(C14113y2.m67402k4("Error during save to new solution. Details: {0}", e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> m5346k4(String str, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        String strM13412x1 = C3141rv.m13412x1(str, "Resources");
        if (xamlOptions.m3096dy()) {
            String strM13412x12 = C3141rv.m13412x1(strM13412x1, "drawable-hdpi");
            dictionary.addItem(C3141rv.m13412x1(strM13412x12, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_hdpi/ic_down.png"));
            dictionary.addItem(C3141rv.m13412x1(strM13412x12, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_hdpi/ic_up.png"));
            String strM13412x13 = C3141rv.m13412x1(strM13412x1, "drawable-mdpi");
            dictionary.addItem(C3141rv.m13412x1(strM13412x13, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_mdpi/ic_down.png"));
            dictionary.addItem(C3141rv.m13412x1(strM13412x13, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_mdpi/ic_up.png"));
            String strM13412x14 = C3141rv.m13412x1(strM13412x1, "drawable-xhdpi");
            dictionary.addItem(C3141rv.m13412x1(strM13412x14, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_xhdpi/ic_down.png"));
            dictionary.addItem(C3141rv.m13412x1(strM13412x14, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_xhdpi/ic_up.png"));
            String strM13412x15 = C3141rv.m13412x1(strM13412x1, "drawable-xxhdpi");
            dictionary.addItem(C3141rv.m13412x1(strM13412x15, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_xxhdpi/ic_down.png"));
            dictionary.addItem(C3141rv.m13412x1(strM13412x15, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_xxhdpi/ic_up.png"));
            String strM13412x16 = C3141rv.m13412x1(strM13412x1, "drawable-xxxhdpi");
            dictionary.addItem(C3141rv.m13412x1(strM13412x16, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_xxxhdpi/ic_down.png"));
            dictionary.addItem(C3141rv.m13412x1(strM13412x16, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_xxxhdpi/ic_up.png"));
        }
        String strM13412x17 = C3141rv.m13412x1(strM13412x1, "mipmap-anydpi-v26");
        dictionary.addItem(C3141rv.m13412x1(strM13412x17, "icon.xml"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Resources_mipmap_anydpi_v26_icon_xml_Template.txt")));
        dictionary.addItem(C3141rv.m13412x1(strM13412x17, "icon_round.xml"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Resources_mipmap_anydpi_v26_icon_round_xml_Template.txt")));
        String strM13412x18 = C3141rv.m13412x1(strM13412x1, "mipmap-hdpi");
        dictionary.addItem(C3141rv.m13412x1(strM13412x18, "icon.png"), C0749ah.m3575k4("xamarinforms/mipmap_hdpi/icon.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x18, "launcher_foreground.png"), C0749ah.m3575k4("xamarinforms/mipmap_hdpi/launcher_foreground.png"));
        String strM13412x19 = C3141rv.m13412x1(strM13412x1, "mipmap-mdpi");
        dictionary.addItem(C3141rv.m13412x1(strM13412x19, "icon.png"), C0749ah.m3575k4("xamarinforms/mipmap_mdpi/icon.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x19, "launcher_foreground.png"), C0749ah.m3575k4("xamarinforms/mipmap_mdpi/launcher_foreground.png"));
        String strM13412x110 = C3141rv.m13412x1(strM13412x1, "mipmap-xhdpi");
        dictionary.addItem(C3141rv.m13412x1(strM13412x110, "icon.png"), C0749ah.m3575k4("xamarinforms/mipmap_xhdpi/icon.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x110, "launcher_foreground.png"), C0749ah.m3575k4("xamarinforms/mipmap_xhdpi/launcher_foreground.png"));
        String strM13412x111 = C3141rv.m13412x1(strM13412x1, "mipmap-xxhdpi");
        dictionary.addItem(C3141rv.m13412x1(strM13412x111, "icon.png"), C0749ah.m3575k4("xamarinforms/mipmap_xxhdpi/icon.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x111, "launcher_foreground.png"), C0749ah.m3575k4("xamarinforms/mipmap_xxhdpi/launcher_foreground.png"));
        String strM13412x112 = C3141rv.m13412x1(strM13412x1, "mipmap-xxxhdpi");
        dictionary.addItem(C3141rv.m13412x1(strM13412x112, "icon.png"), C0749ah.m3575k4("xamarinforms/mipmap_xxxhdpi/icon.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x112, "launcher_foreground.png"), C0749ah.m3575k4("xamarinforms/mipmap_xxxhdpi/launcher_foreground.png"));
        String strM13412x113 = C3141rv.m13412x1(strM13412x1, C18437z2.f56756j);
        dictionary.addItem(C3141rv.m13412x1(strM13412x113, "colors.xml"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Resources_values_colors_xml_Template.txt")));
        dictionary.addItem(C3141rv.m13412x1(strM13412x113, "styles.xml"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Resources_values_styles_xml_Template.txt")));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "AboutResources.txt"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_Resources_AboutResources_txt_Template.txt")));
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, byte[]> m5354x1(String str, String str2) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        dictionary.addItem(C3141rv.m13412x1(str, "App.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_App_xaml_Template.txt"), "{Namespace}", str2)));
        dictionary.addItem(C3141rv.m13412x1(str, "App.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_App_xaml_cs_Template.txt"), "{Namespace}", str2)));
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> m5347k4(String str, String str2, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        if (xamlOptions.m3096dy()) {
            dictionary.addItem(C3141rv.m13412x1(str, "MainPage.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_MainPage_xaml_Frames_Template.txt"), "{Namespace}", str2), "{Height}", C14064he.m66704h4(xamlOptions.m3114x1().m56697kk())), "{Width}", C14064he.m66704h4(xamlOptions.m3114x1().m56699x1()))));
            dictionary.addItem(C3141rv.m13412x1(str, "MainPage.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_MainPage_xaml_cs_Frames_Template.txt"), "{Namespace}", str2)));
            return dictionary;
        }
        dictionary.addItem(C3141rv.m13412x1(str, "MainPage.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_MainPage_xaml_Template.txt"), "{Namespace}", str2)));
        dictionary.addItem(C3141rv.m13412x1(str, "MainPage.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_MainPage_xaml_cs_Template.txt"), "{Namespace}", str2)));
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private KeyValuePair<String, byte[]> m5355x1(String str) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, "AssemblyInfo.cs"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_AssemblyInfo_cs_Template.txt")));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m5348k4(String str) {
        return new KeyValuePair<>(C3141rv.m13412x1(C3141rv.m13412x1(str, "Assets"), "AboutAssets.txt"), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_AboutAssets_Template.txt")));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m5349k4(String str, C14047bz c14047bz, C14047bz c14047bz2, C14047bz c14047bz3, String str2, XamlOptions xamlOptions) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, C14113y2.m67408k4(xamlOptions.m3094du(), ".sln")), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/Solution_Template.txt"), "{ProjectName}", xamlOptions.m3098h4()), "{AndroidProjectGuid}", C14113y2.m67408k4("{", c14047bz3.toString(), "}")), "{BaseProjectGuid}", C14113y2.m67408k4("{", c14047bz2.toString(), "}")), "{SolutionGuid}", C14113y2.m67408k4("{", c14047bz.toString(), "}")), "{ProjectTypeGuidString}", str2)));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m5350k4(String str, C14047bz c14047bz, C14047bz c14047bz2, String str2, XamlOptions xamlOptions) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, C14113y2.m67408k4(xamlOptions.m3098h4(), ".Android.csproj")), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1(xamlOptions.m3096dy() ? "xamarinforms/templates/AndroidProject_csproj_Frames_Template.txt" : "xamarinforms/templates/AndroidProject_csproj_Template.txt"), "{ProjectGuid}", C14113y2.m67408k4("{", c14047bz2.toString(), "}")), "{Namespace}", xamlOptions.m3106kk()), "{AssemblyName}", xamlOptions.m3098h4()), "{ProjectName}", xamlOptions.m3098h4()), "{BaseProjectGuid}", C14113y2.m67408k4("{", c14047bz.toString(), "}")), "{ProjectTypeGuids}", str2)));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m5351k4(String str, String str2) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, C14113y2.m67408k4(str2, ".csproj")), C14817xt.m73604k4(C0749ah.m3576x1("xamarinforms/templates/BaseProject_csproj_Template.txt")));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m5352k4(String str, String str2, String str3) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, "MainActivity.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("xamarinforms/templates/AndroidProject_MainActivity_cs_Template.txt"), "{Namespace}", str2), "{ProjectName}", str3)));
    }
}
