package o0OO0oO;

import Oooo0.o000000O;
import Oooo0o0.C21009OooOooO;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.content.ContextCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C21904OooOoo0;
import com.aspose.slides.FontData;
import com.aspose.slides.FontSubstRule;
import com.aspose.slides.FontsLoader;
import com.aspose.slides.IFontData;
import com.aspose.slides.ISlide;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.android.SizeF;
import com.aspose.words.Document;
import com.aspose.words.FontInfo;
import com.aspose.words.FontInfoCollection;
import com.aspose.words.FontSettings;
import com.aspose.words.License;
import com.aspose.words.LoadOptions;
import com.aspose.words.TableSubstitutionRule;
import com.facebook.soloader.OooOo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.global.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Oooo000;
import o000oo0.C24684Oooo;
import o00o00Oo.C25261OooO0o0;
import o00ooO0.C25749OooOoO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.InterfaceC27299OooOOOO;
import o0OOo0o.o0000O00;
import o0oo000O.C31190OooO0oo;
import o0ooO0O0.C31430OooO00o;
import o0ooO0o.C31456OooO0O0;
import o0ooO0oO.C31483OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O00oo.C32519OooO0oO;
import oO0O00oo.C32520OooO0oo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93527OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<String, Integer> f93528OooO0O0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC26934OooOO0o> f93529OooO0OO = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33898OooO0Oo f93530OooO0Oo = C33900OooO0o0.OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f93532OooO0o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f93531OooO0o = new AtomicBoolean(false);

    public OooO0o(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f93527OooO00o = abstractApplicationC26277OooOoOO;
    }

    public static void OooO00o(File file, File file2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            PdfDocument pdfDocument = new PdfDocument();
            PdfDocument.PageInfo pageInfoCreate = new PdfDocument.PageInfo.Builder(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), 1).create();
            kotlin.jvm.internal.OooOOO0.OooO0o(pageInfoCreate, "create(...)");
            PdfDocument.Page pageStartPage = pdfDocument.startPage(pageInfoCreate);
            kotlin.jvm.internal.OooOOO0.OooO0o(pageStartPage, "startPage(...)");
            Canvas canvas = pageStartPage.getCanvas();
            kotlin.jvm.internal.OooOOO0.OooO0o(canvas, "getCanvas(...)");
            canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, (Paint) null);
            pdfDocument.finishPage(pageStartPage);
            pdfDocument.writeTo(new FileOutputStream(file2));
            pdfDocument.close();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "AsposeRemoteDataSource", "convertBitmap to pdf error: ", e), new Object[0]);
        }
    }

    public static Locale OooO0o0() {
        LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
        Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(locale != null ? locale.getLanguage() : null, TranslateLanguage.CHINESE)) {
            Locale locale2 = Locale.ENGLISH;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(locale2);
            return locale2;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(locale.getScript(), "Hant") || kotlin.jvm.internal.OooOOO0.OooO0O0(locale.getCountry(), "TW")) {
            Locale locale3 = Locale.TRADITIONAL_CHINESE;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(locale3);
            return locale3;
        }
        Locale locale4 = Locale.SIMPLIFIED_CHINESE;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(locale4);
        return locale4;
    }

    public static void OooO0oO() throws Exception {
        FontSettings defaultInstance = FontSettings.getDefaultInstance();
        defaultInstance.getSubstitutionSettings().getTableSubstitution().setEnabled(true);
        defaultInstance.getSubstitutionSettings().getTableSubstitution().loadAndroidSettings();
        defaultInstance.getSubstitutionSettings().getTableSubstitution().setSubstitutes("Times New Roman", "Noto Serif CJK SC");
        defaultInstance.getSubstitutionSettings().getTableSubstitution().setSubstitutes("Arial Unicode MS", "Noto Serif CJK SC");
        defaultInstance.getSubstitutionSettings().getTableSubstitution().setSubstitutes("Microsoft Sans Serif", "Noto Serif CJK SC");
        defaultInstance.getSubstitutionSettings().getFontInfoSubstitution().setEnabled(true);
        defaultInstance.getSubstitutionSettings().getDefaultFontSubstitution().setEnabled(true);
        defaultInstance.getSubstitutionSettings().getDefaultFontSubstitution().setDefaultFontName("Noto Serif CJK SC");
        defaultInstance.getFallbackSettings().loadNotoFallbackSettings();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(Uri uri, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        OooO00o oooO00o;
        OooO0o oooO0o;
        Uri uri2;
        C33898OooO0Oo c33898OooO0Oo;
        LoadOptions loadOptions;
        if (abstractC32479OooO0OO instanceof OooO00o) {
            oooO00o = (OooO00o) abstractC32479OooO0OO;
            int i = oooO00o.f93506OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93506OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO00o.f93505OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93506OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o.f93500OooOo0o = this;
            oooO00o.f93499OooOo = uri;
            oooO00o.f93502OooOoO0 = str;
            oooO00o.f93501OooOoO = str2;
            C33898OooO0Oo c33898OooO0Oo2 = this.f93530OooO0Oo;
            oooO00o.f93503OooOoOO = c33898OooO0Oo2;
            oooO00o.f93506OooOooO = 1;
            if (c33898OooO0Oo2.OooO00o(oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0o = this;
            uri2 = uri;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = oooO00o.f93503OooOoOO;
            str2 = oooO00o.f93501OooOoO;
            str = oooO00o.f93502OooOoO0;
            uri2 = oooO00o.f93499OooOo;
            oooO0o = oooO00o.f93500OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            oooO0o.getClass();
            Locale.setDefault(OooO0o0());
            boolean zCompareAndSet = oooO0o.f93532OooO0o0.compareAndSet(false, true);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = oooO0o.f93527OooO00o;
            if (zCompareAndSet) {
                new License().setLicense(abstractApplicationC26277OooOoOO.getAssets().open("apose/Aspose.Words.Android.Java.lic"));
                OooO0oO();
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            if (str2 == null || str2.length() == 0) {
                loadOptions = null;
            } else {
                loadOptions = new LoadOptions();
                loadOptions.setPassword(str2);
            }
            InputStream inputStreamOpenInputStream = abstractApplicationC26277OooOoOO.getContentResolver().openInputStream(uri2);
            if (inputStreamOpenInputStream != null) {
                try {
                    Document document = new Document(inputStreamOpenInputStream, loadOptions);
                    inputStreamOpenInputStream.close();
                    FontSettings defaultInstance = FontSettings.getDefaultInstance();
                    FontInfoCollection fontInfos = document.getFontInfos();
                    kotlin.jvm.internal.OooOOO0.OooO0o(fontInfos, "getFontInfos(...)");
                    ArrayList<FontInfo> arrayList = new ArrayList();
                    for (FontInfo fontInfo : fontInfos) {
                        FontInfo fontInfo2 = fontInfo;
                        int charset = fontInfo2.getCharset();
                        String name = fontInfo2.getName();
                        String altName = fontInfo2.getAltName();
                        int family = fontInfo2.getFamily();
                        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(charset, "fontInfo: ", ", ", name, ", ");
                        sbOooO0OO.append(altName);
                        sbOooO0OO.append(", ");
                        sbOooO0OO.append(family);
                        Log.d("AsposeRemoteDataSource", sbOooO0OO.toString());
                        String name2 = fontInfo2.getName();
                        if (name2 != null && name2.length() != 0) {
                            arrayList.add(fontInfo);
                        }
                    }
                    for (FontInfo fontInfo3 : arrayList) {
                        TableSubstitutionRule tableSubstitution = defaultInstance.getSubstitutionSettings().getTableSubstitution();
                        List listOooO0oO = OooOo.OooO0oO("Noto Serif CJK SC");
                        String name3 = fontInfo3.getName();
                        List list = listOooO0oO;
                        String[] strArr = (String[]) list.toArray(new String[0]);
                        tableSubstitution.setSubstitutes(name3, (String[]) Arrays.copyOf(strArr, strArr.length));
                        String altName2 = fontInfo3.getAltName();
                        if (altName2 != null && altName2.length() != 0) {
                            String altName3 = fontInfo3.getAltName();
                            String[] strArr2 = (String[]) list.toArray(new String[0]);
                            tableSubstitution.setSubstitutes(altName3, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                        }
                    }
                    document.save(str, 40);
                    File file = new File(str);
                    if (file.exists()) {
                        return file;
                    }
                } finally {
                }
            }
            return null;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(Uri uri, String str, String str2, String str3, o0000O00 o0000o00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f93509OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f93509OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        OooO0O0 oooO0O02 = oooO0O0;
        Object objOooO0Oo = oooO0O02.f93508OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O02.f93509OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                oooO0O02.f93509OooOoO0 = 1;
                objOooO0Oo = OooO0Oo(uri, str, str2, str3, o0000o00, oooO0O02);
                if (objOooO0Oo == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            return (File) objOooO0Oo;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AsposeRemoteDataSource");
            c20358OooO00o.OooO0Oo(e, "convertPPTToPdf err.", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(13:12|225|13|14|214|73|74|229|67|(3:69|(7:72|214|73|74|229|67|(27:77|78|(4:81|(2:83|244)(1:245)|84|79)|243|85|86|(2:89|87)|246|91|(3:92|93|(1:95)(1:247))|97|(3:100|249|98)|248|102|223|103|104|105|106|107|108|109|(3:110|111|(24:241|113|114|233|115|(1:117)|120|121|221|122|123|125|219|126|130|217|131|132|227|133|134|149|(5:152|(2:238|154)|155|162|251)(1:252)|163)(1:250))|168|215|169|(3:171|172|173)(6:176|177|(2:180|178)|253|181|(11:183|(2:186|184)|254|187|(2:190|188)|255|191|(1:193)(1:195)|194|196|197)(2:198|199)))(0))|71)(0)|16|210|211)(2:17|18))(1:19))(3:20|(1:23)|71)|240|24|25|(2:236|27)|(1:40)(1:39)|41|(2:43|44)(19:231|45|46|47|(1:49)(1:50)|51|(2:54|52)|256|55|(1:57)|257|58|(4:61|(2:63|259)(1:260)|64|59)|258|65|66|229|67|(0)(0))|16|210|211|(3:(0)|(1:213)|(1:235))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x055e A[Catch: all -> 0x0416, TRY_LEAVE, TryCatch #13 {all -> 0x0416, blocks: (B:115:0x03d7, B:117:0x040e, B:120:0x041b, B:122:0x0429, B:125:0x0440, B:126:0x045e, B:130:0x0492, B:134:0x04cf, B:149:0x0516, B:163:0x05ab, B:152:0x055e, B:162:0x05a5, B:160:0x05a1, B:161:0x05a4, B:145:0x04f6, B:164:0x05db, B:165:0x05de, B:129:0x0476, B:124:0x0430, B:158:0x059f, B:131:0x04c7, B:133:0x04cc, B:144:0x04dc, B:147:0x04fb, B:154:0x0594), top: B:233:0x03d7, inners: #0, #4, #5, #10, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0594 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f3 A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0070, blocks: (B:13:0x0061, B:69:0x01f3, B:81:0x025b, B:83:0x029b, B:89:0x02ba, B:95:0x02ec, B:100:0x030f), top: B:225:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0226 -> B:214:0x0232). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(Uri uri, String str, String str2, String str3, o0000O00 o0000o00, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        OooO0OO oooO0OO;
        boolean z;
        String str4;
        OooO0o oooO0o;
        Uri uri2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String str5;
        InterfaceC27299OooOOOO interfaceC27299OooOOOO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        com.aspose.slides.LoadOptions loadOptions;
        Presentation presentation;
        long j;
        Iterator it;
        File file;
        InterfaceC27299OooOOOO interfaceC27299OooOOOO2;
        Collection collection;
        String str6;
        String str7;
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        long j2;
        Bitmap bitmapOooO0o;
        boolean z2;
        String str8 = str2;
        String str9 = "Convert to pdf exception: ";
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f93524Oooo0OO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f93524Oooo0OO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooO0OO.f93519Oooo0;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f93524Oooo0OO;
        if (i2 == 0) {
            z = false;
            C32446OooOOOo.OooO0O0(objOooO00o);
            this.f93528OooO0O0.put(str8, C25261OooO0o0.OooO0OO(0));
            OooO0oo();
            oooO0OO.f93511OooOo0o = this;
            oooO0OO.f93510OooOo = uri;
            oooO0OO.f93513OooOoO0 = str;
            oooO0OO.f93512OooOoO = str8;
            str4 = str3;
            oooO0OO.f93514OooOoOO = str4;
            oooO0OO.f93516OooOoo0 = o0000o00;
            C33898OooO0Oo c33898OooO0Oo = this.f93530OooO0Oo;
            oooO0OO.f93515OooOoo = c33898OooO0Oo;
            oooO0OO.f93524Oooo0OO = 1;
            if (c33898OooO0Oo.OooO00o(oooO0OO) != enumC32485OooO00o) {
                oooO0o = this;
                uri2 = uri;
                interfaceC33895OooO00o = c33898OooO0Oo;
                str5 = str;
                interfaceC27299OooOOOO = o0000o00;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = oooO0OO.f93522Oooo00o;
            String str10 = oooO0OO.f93521Oooo00O;
            collection = oooO0OO.f93520Oooo000;
            it = oooO0OO.f93518OooOooo;
            Collection collection2 = oooO0OO.f93517OooOooO;
            File file2 = (File) oooO0OO.f93515OooOoo;
            Presentation presentation2 = (Presentation) oooO0OO.f93516OooOoo0;
            interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) oooO0OO.f93514OooOoOO;
            interfaceC27299OooOOOO2 = (InterfaceC27299OooOOOO) oooO0OO.f93512OooOoO;
            String str11 = oooO0OO.f93513OooOoO0;
            String str12 = (String) oooO0OO.f93510OooOo;
            OooO0o oooO0o2 = oooO0OO.f93511OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO00o);
                str6 = str11;
                long j4 = j3;
                OooO0o oooO0o3 = oooO0o2;
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                String str13 = str10;
                String str14 = str12;
                try {
                    try {
                        collection.add(C25749OooOoO0.OooO0Oo(str13, objOooO00o));
                        if (it.hasNext()) {
                            String str15 = (String) it.next();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(str15);
                            oooO0OO.f93511OooOo0o = oooO0o;
                            oooO0OO.f93510OooOo = str5;
                            oooO0OO.f93513OooOoO0 = str6;
                            oooO0OO.f93512OooOoO = interfaceC27299OooOOOO2;
                            oooO0OO.f93514OooOoOO = interfaceC33895OooO00o2;
                            oooO0OO.f93516OooOoo0 = presentation;
                            oooO0OO.f93515OooOoo = file;
                            Presentation presentation3 = presentation;
                            oooO0OO.f93517OooOooO = collection;
                            oooO0OO.f93518OooOooo = it;
                            oooO0OO.f93520Oooo000 = collection;
                            oooO0OO.f93521Oooo00O = str15;
                            oooO0OO.f93522Oooo00o = j;
                            oooO0OO.f93524Oooo0OO = 2;
                            objOooO00o = interfaceC27299OooOOOO2.OooO00o(str15, file, oooO0OO);
                            if (objOooO00o != enumC32485OooO00o) {
                                oooO0o3 = oooO0o;
                                presentation2 = presentation3;
                                j4 = j;
                                interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                                str14 = str5;
                                file2 = file;
                                str13 = str15;
                                collection2 = collection;
                                collection.add(C25749OooOoO0.OooO0Oo(str13, objOooO00o));
                                collection = collection2;
                                file = file2;
                                str5 = str14;
                                presentation = presentation2;
                                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                                oooO0o = oooO0o3;
                                j = j4;
                                if (it.hasNext()) {
                                    Presentation presentation4 = presentation;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it2 = ((List) collection).iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        C32443OooOOO c32443OooOOO = (C32443OooOOO) next;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                        Object objOooO0O0 = c32443OooOOO.OooO0O0();
                                        Object objOooO0OO = c32443OooOOO.OooO0OO();
                                        File file3 = file;
                                        StringBuilder sb = new StringBuilder();
                                        Iterator it3 = it2;
                                        sb.append("fontName: ");
                                        sb.append(objOooO0O0);
                                        sb.append(", downloadResult: ");
                                        sb.append(objOooO0OO);
                                        c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
                                        if (!((Boolean) c32443OooOOO.OooO0OO()).booleanValue()) {
                                            arrayList.add(next);
                                        }
                                        it2 = it3;
                                        file = file3;
                                    }
                                    File file4 = file;
                                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add((String) ((C32443OooOOO) it4.next()).OooO0O0());
                                    }
                                    FontsLoader.loadExternalFonts(new String[]{file4.getAbsolutePath()});
                                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                                    Iterator it5 = arrayList2.iterator();
                                    while (true) {
                                        str7 = "Noto Serif";
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        arrayList3.add(new FontSubstRule(new FontData((String) it5.next()), new FontData("Noto Serif")));
                                    }
                                    Iterator it6 = arrayList3.iterator();
                                    while (it6.hasNext()) {
                                        presentation4.getFontsManager().getFontSubstRuleList().add((FontSubstRule) it6.next());
                                    }
                                    String name = new File(str5).getName();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                                    try {
                                        String strOoooO0O = C33599OooOo0O.OoooO0O(C33599OooOo0O.OoooO0O(name, ".ppt"), ".pptx");
                                        File file5 = new File(oooO0o.f93527OooO00o.getCacheDir(), "ppt_cache");
                                        C31190OooO0oo.OooO0o(file5);
                                        File file6 = new File(file5, "temp_" + strOoooO0O);
                                        File file7 = new File(file6, "temp_pdf_" + strOoooO0O);
                                        C31190OooO0oo.OooO0o(file7);
                                        int size = presentation4.getSlides().size();
                                        Oooo000 oooo000 = new Oooo000();
                                        SizeF size2 = presentation4.getSlideSize().getSize();
                                        long j5 = j;
                                        int type = presentation4.getSlideSize().getType();
                                        C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(0, size), 1);
                                        String str16 = str5;
                                        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo, 10));
                                        Iterator<Integer> it7 = c32519OooO0oOOooO0oo.iterator();
                                        while (true) {
                                            boolean zHasNext = ((C32520OooO0oo) it7).hasNext();
                                            concurrentHashMap = oooO0o.f93528OooO0O0;
                                            Iterator<Integer> it8 = it7;
                                            if (!zHasNext) {
                                                break;
                                            }
                                            try {
                                                int iNextInt = ((oOo000Oo.Oooo000) it8).nextInt();
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                int iMin = Math.min(iNextInt + 1, size);
                                                InterfaceC33895OooO00o interfaceC33895OooO00o4 = interfaceC33895OooO00o2;
                                                try {
                                                    Presentation presentation5 = new Presentation();
                                                    ArrayList arrayList5 = arrayList4;
                                                    String str17 = str6;
                                                    C34406OooO00o.f123390OooO00o.OooO00o("Presentation: start: " + iNextInt + ", end: " + iMin, new Object[0]);
                                                    if (presentation5.getSlides().size() == 1) {
                                                        presentation5.getSlides().removeAt(0);
                                                    }
                                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                    ISlide iSlide = presentation4.getSlides().get_Item(iNextInt);
                                                    try {
                                                        bitmapOooO0o = iSlide.getThumbnail(2.0f, 2.0f);
                                                        j2 = jCurrentTimeMillis2;
                                                    } catch (OutOfMemoryError unused) {
                                                        j2 = jCurrentTimeMillis2;
                                                        bitmapOooO0o = oooO0o.OooO0o((int) size2.getWidth(), (int) size2.getHeight());
                                                    }
                                                    long jCurrentTimeMillis3 = System.currentTimeMillis() - j2;
                                                    OooO0o oooO0o4 = oooO0o;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    int i3 = size;
                                                    sb2.append("Presentation, end generate gene thumbnail: ");
                                                    sb2.append(jCurrentTimeMillis3);
                                                    Log.d("AsposeRemoteDataSource", sb2.toString());
                                                    try {
                                                        presentation5.getSlides().addClone(iSlide);
                                                        presentation5.getSlideSize().setSize(size2.getWidth(), size2.getHeight(), type);
                                                    } catch (Exception e) {
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o2.OooOOO0("AsposeRemoteDataSource");
                                                        c20358OooO00o2.OooO0OO("smallPresentation slides addClone exception: " + e, new Object[0]);
                                                    }
                                                    File file8 = new File(file7, strOoooO0O + C18115b5.CONNECTOR + iNextInt + ".pdf");
                                                    PdfOptions pdfOptions = new PdfOptions();
                                                    pdfOptions.setSaveMetafilesAsPng(false);
                                                    pdfOptions.setJpegQuality(PatternStyle.Vertical);
                                                    pdfOptions.setEmbedFullFonts(false);
                                                    pdfOptions.setCompliance(0);
                                                    pdfOptions.setDefaultRegularFont(str7);
                                                    try {
                                                        try {
                                                            try {
                                                                z2 = true;
                                                            } catch (Exception e2) {
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o3.OooOOO0("AsposeRemoteDataSource");
                                                                c20358OooO00o3.OooO0OO(str9 + e2, new Object[0]);
                                                                z2 = false;
                                                                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                                String strOooO0OO = C31430OooO00o.OooO0OO(file8.length());
                                                                String str18 = str9;
                                                                StringBuilder sb3 = new StringBuilder();
                                                                String str19 = str7;
                                                                sb3.append("Presentation, convert to pdf, index: ");
                                                                sb3.append(iNextInt);
                                                                sb3.append(", cost: ");
                                                                sb3.append(jCurrentTimeMillis4);
                                                                sb3.append(", pdfSize: ");
                                                                sb3.append(strOooO0OO);
                                                                c20358OooO00o4.OooO00o(sb3.toString(), new Object[0]);
                                                                if (file8.length() <= 3145728) {
                                                                    File file9 = new File(file6, "temp_image_" + strOoooO0O);
                                                                    C31190OooO0oo.OooO0o(file9);
                                                                    File file10 = new File(file9, strOoooO0O + ".jpg");
                                                                    FileOutputStream fileOutputStream = new FileOutputStream(file10);
                                                                    if (bitmapOooO0o != null) {
                                                                    }
                                                                    oO0O000.OooO00o.OooO00o(fileOutputStream, null);
                                                                    OooO00o(file10, file8);
                                                                }
                                                                oooo000.f80941OooOo0o += jCurrentTimeMillis4;
                                                                concurrentHashMap.put(str17, C25261OooO0o0.OooO0OO((int) ((iNextInt * 100.0f) / i3)));
                                                                oooO0o4.OooO0oo();
                                                                arrayList5.add(file8);
                                                                interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                                                                str6 = str17;
                                                                size = i3;
                                                                arrayList4 = arrayList5;
                                                                str9 = str18;
                                                                str7 = str19;
                                                                oooO0o = oooO0o4;
                                                                it7 = it8;
                                                            }
                                                            try {
                                                                presentation5.save(file8.getAbsolutePath(), 1, pdfOptions);
                                                            } catch (OutOfMemoryError e3) {
                                                                e = e3;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                                                c20358OooO00o5.OooOOO0("AsposeRemoteDataSource");
                                                                c20358OooO00o5.OooO0OO(str9 + e, new Object[0]);
                                                                z2 = false;
                                                            }
                                                        } finally {
                                                            presentation5.dispose();
                                                        }
                                                    } catch (OutOfMemoryError e4) {
                                                        e = e4;
                                                    }
                                                    long jCurrentTimeMillis42 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                                                    String strOooO0OO2 = C31430OooO00o.OooO0OO(file8.length());
                                                    String str182 = str9;
                                                    StringBuilder sb32 = new StringBuilder();
                                                    String str192 = str7;
                                                    sb32.append("Presentation, convert to pdf, index: ");
                                                    sb32.append(iNextInt);
                                                    sb32.append(", cost: ");
                                                    sb32.append(jCurrentTimeMillis42);
                                                    sb32.append(", pdfSize: ");
                                                    sb32.append(strOooO0OO2);
                                                    c20358OooO00o42.OooO00o(sb32.toString(), new Object[0]);
                                                    if (file8.length() <= 3145728 || !z2) {
                                                        File file92 = new File(file6, "temp_image_" + strOoooO0O);
                                                        C31190OooO0oo.OooO0o(file92);
                                                        File file102 = new File(file92, strOoooO0O + ".jpg");
                                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file102);
                                                        if (bitmapOooO0o != null) {
                                                            try {
                                                                bitmapOooO0o.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                                                            } finally {
                                                            }
                                                        }
                                                        oO0O000.OooO00o.OooO00o(fileOutputStream2, null);
                                                        OooO00o(file102, file8);
                                                    }
                                                    oooo000.f80941OooOo0o += jCurrentTimeMillis42;
                                                    concurrentHashMap.put(str17, C25261OooO0o0.OooO0OO((int) ((iNextInt * 100.0f) / i3)));
                                                    oooO0o4.OooO0oo();
                                                    arrayList5.add(file8);
                                                    interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                                                    str6 = str17;
                                                    size = i3;
                                                    arrayList4 = arrayList5;
                                                    str9 = str182;
                                                    str7 = str192;
                                                    oooO0o = oooO0o4;
                                                    it7 = it8;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                        String str20 = str6;
                                        InterfaceC33895OooO00o interfaceC33895OooO00o5 = interfaceC33895OooO00o2;
                                        OooO0o oooO0o5 = oooO0o;
                                        ArrayList arrayList6 = arrayList4;
                                        try {
                                            if (arrayList6.isEmpty()) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o6.OooOOO0("AsposeRemoteDataSource");
                                                c20358OooO00o6.OooO0OO("Presentation, childPdfFiles is empty", new Object[0]);
                                                interfaceC33895OooO00o5.OooOOO0(null);
                                                return null;
                                            }
                                            ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(arrayList6, 10));
                                            Iterator it9 = arrayList6.iterator();
                                            while (it9.hasNext()) {
                                                arrayList7.add(C25261OooO0o0.OooO0Oo(((File) it9.next()).length()));
                                            }
                                            Iterator it10 = arrayList7.iterator();
                                            if (!it10.hasNext()) {
                                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                            }
                                            Object next2 = it10.next();
                                            while (it10.hasNext()) {
                                                next2 = C25261OooO0o0.OooO0Oo(((Number) next2).longValue() + ((Number) it10.next()).longValue());
                                            }
                                            C34406OooO00o.f123390OooO00o.OooO00o("Presentation, transfer to pdfs cost: " + oooo000.f80941OooOo0o + ", totalSize: " + C31430OooO00o.OooO0OO(((Number) next2).longValue()), new Object[0]);
                                            long jCurrentTimeMillis5 = System.currentTimeMillis();
                                            C31483OooO0O0 c31483OooO0O0 = new C31483OooO0O0();
                                            Iterator it11 = arrayList6.iterator();
                                            while (it11.hasNext()) {
                                                c31483OooO0O0.f112611OooO00o.add((File) it11.next());
                                            }
                                            c31483OooO0O0.OooO0oo(str16);
                                            c31483OooO0O0.OooO0o(new C31456OooO0O0(0L, -1L, false, true));
                                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o7.OooO00o("Presentation, merge cost: " + (System.currentTimeMillis() - jCurrentTimeMillis5), new Object[0]);
                                            C31190OooO0oo.OooO0oo(file6);
                                            presentation4.dispose();
                                            c20358OooO00o7.OooOOO0("AsposeRemoteDataSource");
                                            c20358OooO00o7.OooO0o0("Presentation, total cost: " + (System.currentTimeMillis() - j5), new Object[0]);
                                            concurrentHashMap.put(str20, C25261OooO0o0.OooO0OO(100));
                                            oooO0o5.OooO0oo();
                                            File file11 = new File(str16);
                                            File file12 = file11.exists() ? file11 : null;
                                            interfaceC33895OooO00o5.OooOOO0(null);
                                            return file12;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            interfaceC33895OooO00o3 = interfaceC33895OooO00o5;
                                            interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                                            interfaceC33895OooO00o2.OooOOO0(null);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                                    }
                                }
                            }
                            return enumC32485OooO00o;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                collection = collection2;
                file = file2;
                str5 = str14;
                presentation = presentation2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                oooO0o = oooO0o3;
                j = j4;
            } catch (Throwable th7) {
                th = th7;
            }
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
        z = false;
        InterfaceC33895OooO00o interfaceC33895OooO00o6 = (InterfaceC33895OooO00o) oooO0OO.f93515OooOoo;
        interfaceC27299OooOOOO = (InterfaceC27299OooOOOO) oooO0OO.f93516OooOoo0;
        str4 = (String) oooO0OO.f93514OooOoOO;
        String str21 = (String) oooO0OO.f93512OooOoO;
        str5 = oooO0OO.f93513OooOoO0;
        uri2 = (Uri) oooO0OO.f93510OooOo;
        oooO0o = oooO0OO.f93511OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        interfaceC33895OooO00o = interfaceC33895OooO00o6;
        str8 = str21;
        oooO0o.getClass();
        Locale.setDefault(OooO0o0());
        boolean zCompareAndSet = oooO0o.f93531OooO0o.compareAndSet(z, true);
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = oooO0o.f93527OooO00o;
        if (zCompareAndSet) {
            try {
                new com.aspose.slides.License().setLicense(abstractApplicationC26277OooOoOO.getAssets().open("apose/Aspose.Slides.Android.Java.lic"));
            } catch (Exception e5) {
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("AsposeRemoteDataSource");
                c20358OooO00o8.OooO0Oo(e5, "slidesInitialized err.", new Object[0]);
                interfaceC33895OooO00o.OooOOO0(null);
                return null;
            }
        }
        if (str4 == null || str4.length() == 0) {
            loadOptions = null;
        } else {
            loadOptions = new com.aspose.slides.LoadOptions();
            loadOptions.setPassword(str4);
        }
        long jCurrentTimeMillis6 = System.currentTimeMillis();
        InputStream inputStreamOpenInputStream = abstractApplicationC26277OooOoOO.getContentResolver().openInputStream(uri2);
        if (inputStreamOpenInputStream == null) {
            interfaceC33895OooO00o.OooOOO0(null);
            return null;
        }
        try {
            Presentation presentation6 = new Presentation(inputStreamOpenInputStream, loadOptions);
            oO0O000.OooO00o.OooO00o(inputStreamOpenInputStream, null);
            File file13 = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "ppt_fonts");
            String[] list = file13.list();
            Iterable<String> iterableOoooOO0 = list != null ? oOo000Oo.OooOOO.OoooOO0(list) : C34434OooOoO.f123453OooOo0o;
            String str22 = str8;
            ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(iterableOoooOO0, 10));
            for (String str23 : iterableOoooOO0) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str23);
                arrayList8.add(C33599OooOo0O.OooooOO(str23, ".ttf", str23));
            }
            IFontData[] fonts = presentation6.getFontsManager().getFonts();
            kotlin.jvm.internal.OooOOO0.OooO0o(fonts, "getFonts(...)");
            ArrayList arrayList9 = new ArrayList(fonts.length);
            for (IFontData iFontData : fonts) {
                arrayList9.add(iFontData.getFontName());
            }
            ArrayList arrayList10 = new ArrayList();
            Iterator it12 = arrayList9.iterator();
            while (it12.hasNext()) {
                Object next3 = it12.next();
                Iterator it13 = it12;
                if (!arrayList8.contains((String) next3)) {
                    arrayList10.add(next3);
                }
                it12 = it13;
            }
            ArrayList arrayList11 = new ArrayList(C34428OooOOo.OooOOoo(arrayList10, 10));
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            presentation = presentation6;
            j = jCurrentTimeMillis6;
            it = arrayList10.iterator();
            file = file13;
            interfaceC27299OooOOOO2 = interfaceC27299OooOOOO;
            collection = arrayList11;
            str6 = str22;
            if (it.hasNext()) {
            }
        } finally {
        }
        interfaceC33895OooO00o2.OooOOO0(null);
        throw th;
    }

    public final Bitmap OooO0o(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmapCreateBitmap);
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f93527OooO00o;
        Drawable drawable = ContextCompat.getDrawable(abstractApplicationC26277OooOoOO, R.drawable.bg_deleted_image_placeholder);
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setAlpha(255);
        paint.setTextSize(o000000O.OooO0oo(14.0f));
        paint.setAntiAlias(true);
        paint.setUnderlineText(false);
        String string = abstractApplicationC26277OooOoOO.getString(R.string.ppt_convert_failed_tip);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        canvas.drawText(string, (i - paint.measureText(string)) / 2.0f, i2 / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    public final void OooO0oo() {
        ConcurrentHashMap<String, Integer> concurrentHashMap;
        Iterator<InterfaceC26934OooOO0o> it = this.f93529OooO0OO.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = this.f93528OooO0O0;
            if (!zHasNext) {
                break;
            } else {
                it.next().OooO00o(concurrentHashMap);
            }
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().intValue() != 100) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
