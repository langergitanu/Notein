package o0Oo0OoO;

import Oooo0OO.AbstractC20960OooOOOO;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.mapper.MyTemplateMapper;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o0OOOO00.C27095OooOo0O;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0OoO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28114OooOOOo extends AbstractC20960OooOOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C27095OooOo0O f99650OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final MyTemplateMapper f99651OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28114OooOOOo(C27095OooOo0O c27095OooOo0O, MyTemplateMapper myTemplateMapper) {
        super(2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(myTemplateMapper, "myTemplateMapper");
        this.f99650OooOo = c27095OooOo0O;
        this.f99651OooOoO0 = myTemplateMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28113OooOOOO c28113OooOOOO;
        LinkedHashMap linkedHashMap;
        File file;
        MyTemplate myTemplateCopy$default;
        if (abstractC32479OooO0OO instanceof C28113OooOOOO) {
            c28113OooOOOO = (C28113OooOOOO) abstractC32479OooO0OO;
            int i = c28113OooOOOO.f99649OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28113OooOOOO.f99649OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28113OooOOOO = new C28113OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28113OooOOOO.f99648OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28113OooOOOO.f99649OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                File file2 = new File(str);
                if (!file2.exists()) {
                    Log.e("MyTemplate", "StorageDir is null. " + file2);
                    return new Integer(-999);
                }
                ArrayList arrayListO000000o = o000000o(new File(file2.getAbsolutePath(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE), MyTemplateEntity.class);
                ArrayList<MyTemplate> arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO000000o, 10));
                Iterator it = arrayListO000000o.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f99651OooOoO0.toMyTemplate((MyTemplateEntity) it.next()));
                }
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(fileArrListFiles.length);
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (File file3 : fileArrListFiles) {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(file3);
                        linkedHashMap.put(C32501OooO0oO.OooO0o(file3), file3);
                    }
                } else {
                    linkedHashMap = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (MyTemplate myTemplate : arrayList) {
                    PaperTheme paperTheme = myTemplate.getPaperTheme();
                    if (paperTheme != null) {
                        if (!(paperTheme instanceof LocalUriPaperTheme) && !(paperTheme instanceof PdfPaperTheme)) {
                            myTemplateCopy$default = MyTemplate.copy$default(myTemplate, null, null, null, 0L, System.currentTimeMillis(), null, 47, null);
                        } else if (linkedHashMap == null || (file = (File) linkedHashMap.get(myTemplate.getId())) == null) {
                            myTemplateCopy$default = null;
                        } else {
                            File file4 = new File((paperTheme instanceof LocalUriPaperTheme ? new File(((LocalUriPaperTheme) paperTheme).getUri()) : new File(((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath())).getParent(), file.getName());
                            if (!C31190OooO0oo.OooO00o(file, file4)) {
                                Log.e("MyTemplate", "Couldn't restore template file from " + file + " to " + file4);
                                return new Integer(-999);
                            }
                            if (paperTheme instanceof LocalUriPaperTheme) {
                                LocalUriPaperTheme localUriPaperTheme = (LocalUriPaperTheme) paperTheme;
                                String absolutePath = file4.getAbsolutePath();
                                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                                String absolutePath2 = file4.getAbsolutePath();
                                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                                paperTheme = LocalUriPaperTheme.copy$default(localUriPaperTheme, null, null, null, null, absolutePath, absolutePath2, null, 79, null);
                            } else if (paperTheme instanceof PdfPaperTheme) {
                                PdfInfo pdfInfo = ((PdfPaperTheme) paperTheme).getPdfInfo();
                                String absolutePath3 = file4.getAbsolutePath();
                                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath3, "getAbsolutePath(...)");
                                paperTheme = PdfPaperTheme.copy$default((PdfPaperTheme) paperTheme, null, PdfInfo.copy$default(pdfInfo, null, absolutePath3, null, null, 13, null), 0, null, null, null, 61, null);
                            }
                            myTemplateCopy$default = MyTemplate.copy$default(myTemplate, null, paperTheme, null, 0L, System.currentTimeMillis(), null, 45, null);
                        }
                    }
                    if (myTemplateCopy$default != null) {
                        arrayList2.add(myTemplateCopy$default);
                    }
                }
                C27095OooOo0O c27095OooOo0O = this.f99650OooOo;
                MyTemplate[] myTemplateArr = (MyTemplate[]) arrayList2.toArray(new MyTemplate[0]);
                MyTemplate[] myTemplateArr2 = (MyTemplate[]) Arrays.copyOf(myTemplateArr, myTemplateArr.length);
                c28113OooOOOO.f99649OooOoO0 = 1;
                if (c27095OooOo0O.OooO00o(myTemplateArr2, c28113OooOOOO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(0);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MyTemplate", "Couldn't restore data. " + C32460OooOooO.f116667OooO00o);
            return new Integer(-999);
        }
    }
}
