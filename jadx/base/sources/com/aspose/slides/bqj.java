package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class bqj implements oow {
    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, byte[]> m4301x1(String str) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        String strM13412x1 = C3141rv.m13412x1(str, "Icons");
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "ic_down.png"), C0749ah.m3575k4("xamarinforms/drawable_xxxhdpi/ic_down.png"));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "ic_up.png"), C0749ah.m3575k4("xamarinforms/drawable_xxxhdpi/ic_up.png"));
        return dictionary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.oow
    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, byte[]> mo4303k4(XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionaryM4297k4;
        if (C14113y2.m67411k4(xamlOptions.m3094du())) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "XamlOptions", "SolutionName"));
        }
        if (C14113y2.m67411k4(xamlOptions.m3098h4())) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "XamlOptions", "ProjectName"));
        }
        try {
            Dictionary<String, byte[]> dictionary = new Dictionary<>();
            String strM3094du = xamlOptions.m3094du();
            String strM13412x1 = C3141rv.m13412x1(strM3094du, xamlOptions.m3098h4());
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            C14047bz c14047bzClone2 = C14047bz.m66536x1().Clone();
            try {
                try {
                    KeyValuePair keyValuePairClone = m4299k4(strM3094du, c14047bzClone.Clone(), c14047bzClone2.Clone(), "{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", xamlOptions).Clone();
                    dictionary.addItem(keyValuePairClone.getKey(), keyValuePairClone.getValue());
                    C14318pw.m69319k4(m4295k4(strM13412x1, xamlOptions), dictionary);
                    KeyValuePair keyValuePairClone2 = m4298k4(strM13412x1).Clone();
                    dictionary.addItem(keyValuePairClone2.getKey(), keyValuePairClone2.getValue());
                    C14318pw.m69319k4(m4296k4(strM13412x1, xamlOptions.m3106kk()), dictionary);
                    KeyValuePair keyValuePairClone3 = m4300k4(strM13412x1, c14047bzClone2.Clone(), "{60dc8134-eba5-43b8-bcc9-bb4bc16c2548};{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}", xamlOptions).Clone();
                    dictionary.addItem(keyValuePairClone3.getKey(), keyValuePairClone3.getValue());
                    if (xamlOptions.m3096dy()) {
                        C14318pw.m69319k4(m4302x1(strM13412x1, xamlOptions.m3106kk(), xamlOptions), dictionary);
                        dictionaryM4297k4 = m4301x1(strM13412x1);
                    } else {
                        dictionaryM4297k4 = m4297k4(strM13412x1, xamlOptions.m3106kk(), xamlOptions);
                    }
                    C14318pw.m69319k4(dictionaryM4297k4, dictionary);
                    return dictionary;
                } catch (ArgumentException e) {
                    e = e;
                    throw new yii(C14113y2.m67402k4("Error during save to new solution. Details: {0}", e.getMessage()));
                }
            } catch (ArgumentException e2) {
                e = e2;
            }
        } catch (ArgumentException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> m4295k4(String str, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        String strM13412x1 = C3141rv.m13412x1(str, "Properties");
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "AssemblyInfo.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_AssemblyInfo_cs_Template.txt"), "{ProjectName}", xamlOptions.m3098h4())));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "Resources.Designer.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_Resources_Designer_cs_Template.txt"), "{Namespace}", xamlOptions.m3106kk())));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "Resources.resx"), C14817xt.m73604k4(C0749ah.m3576x1("wpftemplates/BaseProject_Resources_resx_Template.txt")));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "Settings.Designer.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_Settings_Designer_cs_Template.txt"), "{Namespace}", xamlOptions.m3106kk())));
        dictionary.addItem(C3141rv.m13412x1(strM13412x1, "Settings.settings"), C14817xt.m73604k4(C0749ah.m3576x1("wpftemplates/BaseProject_Settings_settings_Template.txt")));
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, byte[]> m4302x1(String str, String str2, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        dictionary.addItem(C3141rv.m13412x1(str, "MainWindow.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_MainWindow_xaml_Template.txt"), "{Namespace}", str2), "{Height}", C14064he.m66704h4(xamlOptions.m3114x1().m56697kk() + 120.0f)), "{Width}", C14064he.m66704h4(xamlOptions.m3114x1().m56699x1()))));
        dictionary.addItem(C3141rv.m13412x1(str, "MainWindow.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_MainWindow_xaml_cs_Frames_Template.txt"), "{Namespace}", str2)));
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> m4296k4(String str, String str2) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        dictionary.addItem(C3141rv.m13412x1(str, "App.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_App_xaml_Template.txt"), "{Namespace}", str2)));
        dictionary.addItem(C3141rv.m13412x1(str, "App.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_App_xaml_cs_Template.txt"), "{Namespace}", str2)));
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, byte[]> m4297k4(String str, String str2, XamlOptions xamlOptions) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        dictionary.addItem(C3141rv.m13412x1(str, "MainWindow.xaml"), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_MainWindow_xaml_Default_Template.txt"), "{Namespace}", str2), "{Height}", C14064he.m66704h4(xamlOptions.m3114x1().m56697kk() + 120.0f)), "{Width}", C14064he.m66704h4(xamlOptions.m3114x1().m56699x1()))));
        dictionary.addItem(C3141rv.m13412x1(str, "MainWindow.xaml.cs"), C14817xt.m73604k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/BaseProject_MainWindow_xaml_cs_Template.txt"), "{Namespace}", str2)));
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m4298k4(String str) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, "App.config"), C14817xt.m73604k4(C0749ah.m3576x1("wpftemplates/BaseProject_App_config_Template.txt")));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m4299k4(String str, C14047bz c14047bz, C14047bz c14047bz2, String str2, XamlOptions xamlOptions) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, C14113y2.m67408k4(xamlOptions.m3094du(), ".sln")), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1("wpftemplates/Solution_Template.txt"), "{ProjectName}", xamlOptions.m3098h4()), "{ProjectGuid}", C14113y2.m67408k4("{", c14047bz2.toString(), "}")), "{SolutionGuid}", C14113y2.m67408k4("{", c14047bz.toString(), "}")), "{ProjectTypeGuidString}", str2)));
    }

    /* JADX INFO: renamed from: k4 */
    private KeyValuePair<String, byte[]> m4300k4(String str, C14047bz c14047bz, String str2, XamlOptions xamlOptions) {
        return new KeyValuePair<>(C3141rv.m13412x1(str, C14113y2.m67408k4(xamlOptions.m3098h4(), ".csproj")), C14817xt.m73604k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C0749ah.m3576x1(xamlOptions.m3096dy() ? "wpftemplates/BaseProject_csproj_Frames_Template.txt" : "wpftemplates/BaseProject_csproj_Template.txt"), "{ProjectGuid}", C14113y2.m67408k4("{", c14047bz.toString(), "}")), "{Namespace}", xamlOptions.m3106kk()), "{AssemblyName}", xamlOptions.m3098h4()), "{ProjectTypeGuids}", str2)));
    }
}
