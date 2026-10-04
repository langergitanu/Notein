package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oO.C21111o0ooOoO;
import android.net.Uri;
import android.util.Log;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.ImageEntity;
import com.orion.notein.domain.mapper.ImageMapper;
import com.orion.notein.domain.models.page.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26596o00O0o0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28111OooOOO extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26596o00O0o0 f99630OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ImageMapper f99631OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28111OooOOO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26596o00O0o0 c26596o00O0o0, ImageMapper imageMapper, C26515OooooO0 c26515OooooO0) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageMapper, "imageMapper");
        this.f99630OooOo = c26596o00O0o0;
        this.f99631OooOoO0 = imageMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0273, code lost:
    
        if (r0.OooO0O0(r11, r3, false, r6) != r4) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002e, B:19:0x0061, B:51:0x01a9, B:55:0x01b6, B:57:0x01d2, B:59:0x01f6, B:63:0x0243, B:39:0x0115, B:41:0x011d, B:44:0x0130, B:47:0x0150, B:66:0x0254, B:28:0x00aa, B:31:0x00d9, B:32:0x00e2, B:34:0x00e8, B:35:0x00fc, B:37:0x0107), top: B:73:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002e, B:19:0x0061, B:51:0x01a9, B:55:0x01b6, B:57:0x01d2, B:59:0x01f6, B:63:0x0243, B:39:0x0115, B:41:0x011d, B:44:0x0130, B:47:0x0150, B:66:0x0254, B:28:0x00aa, B:31:0x00d9, B:32:0x00e2, B:34:0x00e8, B:35:0x00fc, B:37:0x0107), top: B:73:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f6 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002e, B:19:0x0061, B:51:0x01a9, B:55:0x01b6, B:57:0x01d2, B:59:0x01f6, B:63:0x0243, B:39:0x0115, B:41:0x011d, B:44:0x0130, B:47:0x0150, B:66:0x0254, B:28:0x00aa, B:31:0x00d9, B:32:0x00e2, B:34:0x00e8, B:35:0x00fc, B:37:0x0107), top: B:73:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x019a -> B:51:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x023e -> B:60:0x0237). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28112OooOOO0 c28112OooOOO0;
        C28112OooOOO0 c28112OooOOO02;
        List list;
        C28111OooOOO c28111OooOOO;
        String str3;
        File[] fileArr;
        Map map2;
        int i;
        Map map3;
        int i2;
        int i3;
        Map map4;
        String str4 = "getName(...)";
        if (abstractC32479OooO0OO instanceof C28112OooOOO0) {
            c28112OooOOO0 = (C28112OooOOO0) abstractC32479OooO0OO;
            int i4 = c28112OooOOO0.f99646Oooo0OO;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c28112OooOOO0.f99646Oooo0OO = i4 - Integer.MIN_VALUE;
            } else {
                c28112OooOOO0 = new C28112OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28112OooOOO0.f99641Oooo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = c28112OooOOO0.f99646Oooo0OO;
        try {
            if (i5 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File file = new File(C21111o0ooOoO.OooO0Oo(str, "/image"));
                if (!file.exists()) {
                    file.mkdir();
                }
                if (!file.exists()) {
                    Log.e("image", "StorageDir is null. " + file);
                    return new Integer(-999);
                }
                ArrayList<ImageEntity> arrayListO000000o = o000000o(new File(file.getAbsolutePath() + "/data"), ImageEntity.class);
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayListO000000o, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (ImageEntity imageEntity : arrayListO000000o) {
                    linkedHashMap.put(imageEntity.getId(), this.f99631OooOoO0.toImage(imageEntity));
                }
                ArrayList arrayList = new ArrayList();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    fileArr = fileArrListFiles;
                    list = arrayList;
                    map2 = linkedHashMap;
                    i = 0;
                    map3 = map;
                    c28111OooOOO = this;
                    i2 = length;
                    c28112OooOOO02 = c28112OooOOO0;
                    str3 = str2;
                    if (i < i2) {
                    }
                } else {
                    c28112OooOOO02 = c28112OooOOO0;
                    list = arrayList;
                    c28111OooOOO = this;
                    str3 = str2;
                    C26596o00O0o0 c26596o00O0o0 = c28111OooOOO.f99630OooOo;
                    c28112OooOOO02.f99633OooOo0o = null;
                    c28112OooOOO02.f99632OooOo = null;
                    c28112OooOOO02.f99635OooOoO0 = null;
                    c28112OooOOO02.f99634OooOoO = null;
                    c28112OooOOO02.f99636OooOoOO = null;
                    c28112OooOOO02.f99638OooOoo0 = null;
                    c28112OooOOO02.f99637OooOoo = null;
                    c28112OooOOO02.f99639OooOooO = null;
                    c28112OooOOO02.f99640OooOooo = null;
                    c28112OooOOO02.f99642Oooo000 = null;
                    c28112OooOOO02.f99646Oooo0OO = 2;
                    i3 = 0;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    i3 = 0;
                    return new Integer(i3);
                }
                int i6 = c28112OooOOO0.f99644Oooo00o;
                int i7 = c28112OooOOO0.f99643Oooo00O;
                File file2 = c28112OooOOO0.f99642Oooo000;
                String string = c28112OooOOO0.f99640OooOooo;
                Image image = c28112OooOOO0.f99639OooOooO;
                File file3 = c28112OooOOO0.f99637OooOoo;
                File[] fileArr2 = c28112OooOOO0.f99638OooOoo0;
                List list2 = c28112OooOOO0.f99636OooOoOO;
                Map map5 = c28112OooOOO0.f99634OooOoO;
                String str5 = c28112OooOOO0.f99635OooOoO0;
                Map map6 = c28112OooOOO0.f99632OooOo;
                C28111OooOOO c28111OooOOO2 = c28112OooOOO0.f99633OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C28111OooOOO c28111OooOOO3 = c28111OooOOO2;
                Object obj2 = obj;
                String str6 = "getName(...)";
                Map map7 = map6;
                Image image2 = image;
                C28111OooOOO c28111OooOOO4 = c28111OooOOO3;
                File file4 = new File(file2, string + (!((Boolean) obj2).booleanValue() ? ".svg" : ".png"));
                if (C31190OooO0oo.OooO00o(file3, file4)) {
                    Log.e("image", "Couldn't restore img file from " + file3 + " to " + file4);
                    return new Integer(-999);
                }
                String absolutePath = file4.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                Object obj3 = map7.get(image2.getPageId());
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj3);
                list2.add(Image.copy$default(image2, string, (String) obj3, absolutePath, null, null, 0.0f, System.currentTimeMillis(), System.currentTimeMillis(), false, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5, null));
                map3 = map7;
                i = i7;
                list = list2;
                fileArr = fileArr2;
                map2 = map5;
                c28112OooOOO02 = c28112OooOOO0;
                str3 = str5;
                i2 = i6;
                c28111OooOOO = c28111OooOOO4;
                i++;
                str4 = str6;
                if (i < i2) {
                    file3 = fileArr[i];
                    if (file3.exists()) {
                        String name = file3.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name, str4);
                        map4 = map3;
                        if (C33595OooOOo.OooOoO0(name, "img_", false)) {
                            String name2 = file3.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, str4);
                            String strSubstring = name2.substring(4);
                            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                            Image image3 = (Image) map2.get(strSubstring);
                            if (image3 != null) {
                                string = UUID.randomUUID().toString();
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                                File fileOooO = c28111OooOOO.f99630OooOo.OooO(str3);
                                C26596o00O0o0 c26596o00O0o02 = c28111OooOOO.f99630OooOo;
                                str6 = str4;
                                Uri uriFromFile = Uri.fromFile(file3);
                                c28112OooOOO02.f99633OooOo0o = c28111OooOOO;
                                C28111OooOOO c28111OooOOO5 = c28111OooOOO;
                                c28112OooOOO02.f99632OooOo = map4;
                                c28112OooOOO02.f99635OooOoO0 = str3;
                                c28112OooOOO02.f99634OooOoO = map2;
                                c28112OooOOO02.f99636OooOoOO = list;
                                c28112OooOOO02.f99638OooOoo0 = fileArr;
                                c28112OooOOO02.f99637OooOoo = file3;
                                c28112OooOOO02.f99639OooOooO = image3;
                                c28112OooOOO02.f99640OooOooo = string;
                                c28112OooOOO02.f99642Oooo000 = fileOooO;
                                c28112OooOOO02.f99643Oooo00O = i;
                                c28112OooOOO02.f99644Oooo00o = i2;
                                c28112OooOOO02.f99646Oooo0OO = 1;
                                Object objOooOOo0 = c26596o00O0o02.OooOOo0(uriFromFile, c28112OooOOO02);
                                if (objOooOOo0 == enumC32485OooO00o) {
                                    return enumC32485OooO00o;
                                }
                                c28111OooOOO3 = c28111OooOOO5;
                                i6 = i2;
                                str5 = str3;
                                c28112OooOOO0 = c28112OooOOO02;
                                map5 = map2;
                                fileArr2 = fileArr;
                                list2 = list;
                                i7 = i;
                                file2 = fileOooO;
                                obj2 = objOooOOo0;
                                image2 = image3;
                                map7 = map4;
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                                C28111OooOOO c28111OooOOO42 = c28111OooOOO3;
                                File file42 = new File(file2, string + (!((Boolean) obj2).booleanValue() ? ".svg" : ".png"));
                                if (C31190OooO0oo.OooO00o(file3, file42)) {
                                }
                            }
                        }
                    } else {
                        map4 = map3;
                    }
                    str6 = str4;
                    map3 = map4;
                    c28111OooOOO = c28111OooOOO;
                    i++;
                    str4 = str6;
                    if (i < i2) {
                        C26596o00O0o0 c26596o00O0o03 = c28111OooOOO.f99630OooOo;
                        c28112OooOOO02.f99633OooOo0o = null;
                        c28112OooOOO02.f99632OooOo = null;
                        c28112OooOOO02.f99635OooOoO0 = null;
                        c28112OooOOO02.f99634OooOoO = null;
                        c28112OooOOO02.f99636OooOoOO = null;
                        c28112OooOOO02.f99638OooOoo0 = null;
                        c28112OooOOO02.f99637OooOoo = null;
                        c28112OooOOO02.f99639OooOooO = null;
                        c28112OooOOO02.f99640OooOooo = null;
                        c28112OooOOO02.f99642Oooo000 = null;
                        c28112OooOOO02.f99646Oooo0OO = 2;
                        i3 = 0;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("image", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
