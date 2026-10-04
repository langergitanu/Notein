package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oO.C21111o0ooOoO;
import android.util.Log;
import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.domain.mapper.PdfInfoMapper;
import com.orion.notein.domain.models.note.PdfInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26427Oooo0O0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28125OooOoOO extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26427Oooo0O0 f99720OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final File f99721OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final PdfInfoMapper f99722OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28125OooOoOO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C26427Oooo0O0 c26427Oooo0O0, PdfInfoMapper pdfInfoMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfInfoMapper, "pdfInfoMapper");
        this.f99720OooOo = c26427Oooo0O0;
        this.f99722OooOoO0 = pdfInfoMapper;
        this.f99721OooOoO = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "documents");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:12:0x0036, B:30:0x00d3, B:32:0x00d9, B:34:0x010c, B:35:0x0120, B:25:0x0082, B:26:0x00b1, B:28:0x00b7, B:29:0x00c7), top: B:43:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0160 -> B:38:0x0163). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, Map map, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28123OooOoO c28123OooOoO;
        File file;
        C28125OooOoOO c28125OooOoOO;
        Iterator it;
        Map map2;
        C28123OooOoO c28123OooOoO2;
        String str3;
        if (abstractC32479OooO0OO instanceof C28123OooOoO) {
            c28123OooOoO = (C28123OooOoO) abstractC32479OooO0OO;
            int i = c28123OooOoO.f99717OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28123OooOoO.f99717OooOooO = i - Integer.MIN_VALUE;
            } else {
                c28123OooOoO = new C28123OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28123OooOoO.f99716OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28123OooOoO.f99717OooOooO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File file2 = new File(C21111o0ooOoO.OooO0Oo(str, "/pdf"));
                if (!file2.exists()) {
                    file2.mkdir();
                }
                if (!file2.exists()) {
                    Log.e("pdf", "StorageDir is null. " + file2);
                    return new Integer(0);
                }
                ArrayList arrayListO000000o = o000000o(new File(file2.getAbsolutePath() + "/data"), PdfInfoEntity.class);
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO000000o, 10));
                Iterator it2 = arrayListO000000o.iterator();
                while (it2.hasNext()) {
                    arrayList.add(this.f99722OooOoO0.toPdfInfo((PdfInfoEntity) it2.next()));
                }
                file = file2;
                c28125OooOoOO = this;
                it = arrayList.iterator();
                map2 = map;
                c28123OooOoO2 = c28123OooOoO;
                str3 = str2;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it3 = c28123OooOoO.f99714OooOoOO;
                File file3 = c28123OooOoO.f99712OooOoO;
                String str4 = c28123OooOoO.f99713OooOoO0;
                Map map3 = c28123OooOoO.f99710OooOo;
                c28125OooOoOO = c28123OooOoO.f99711OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c28123OooOoO2 = c28123OooOoO;
                str3 = str4;
                file = file3;
                it = it3;
                map2 = map3;
                if (it.hasNext()) {
                    PdfInfo pdfInfo = (PdfInfo) it.next();
                    File file4 = new File(file.getAbsolutePath() + "/pdf_" + pdfInfo.getId());
                    String string = (String) map2.get(pdfInfo.getId());
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                        map2.put(pdfInfo.getId(), string);
                    }
                    File file5 = new File(c28125OooOoOO.f99721OooOoO, string + ".pdf");
                    C31190OooO0oo.OooO00o(file4, file5);
                    pdfInfo.setId(string);
                    pdfInfo.setPdfPath(file5.getAbsolutePath());
                    pdfInfo.setTnPath("");
                    C26427Oooo0O0 c26427Oooo0O0 = c28125OooOoOO.f99720OooOo;
                    c28123OooOoO2.f99711OooOo0o = c28125OooOoOO;
                    c28123OooOoO2.f99710OooOo = map2;
                    c28123OooOoO2.f99713OooOoO0 = str3;
                    c28123OooOoO2.f99712OooOoO = file;
                    c28123OooOoO2.f99714OooOoOO = it;
                    c28123OooOoO2.f99717OooOooO = 1;
                    if (c26427Oooo0O0.OooO00o(pdfInfo, str3, c28123OooOoO2) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    if (it.hasNext()) {
                        return new Integer(0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("pdf", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
