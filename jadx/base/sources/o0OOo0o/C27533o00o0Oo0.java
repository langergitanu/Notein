package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.sticker.StickerCollection;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OOo0o.o00o0Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$importStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {592}, m80625m = "invokeSuspend")
public final class C27533o00o0Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f96506OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f96507OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Uri f96508OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96509OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27533o00o0Oo0(C27538o00o0o0O c27538o00o0o0O, Uri uri, Continuation<? super C27533o00o0Oo0> continuation) {
        super(2, continuation);
        this.f96509OooOoO0 = c27538o00o0o0O;
        this.f96508OooOoO = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27533o00o0Oo0(this.f96509OooOoO0, this.f96508OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27533o00o0Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        File fileOooO0O0;
        Map linkedHashMap;
        Object objOooO0o;
        Uri uri = this.f96508OooOoO;
        C27538o00o0o0O c27538o00o0o0O = this.f96509OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96506OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                File fileOooO0OO = C27538o00o0o0O.OooO0OO(c27538o00o0o0O, string);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO00o("importStickerCollection, try decrypting file: " + uri + " to file: " + fileOooO0OO, new Object[0]);
                c27538o00o0o0O.f96552OooO0OO.OooO0OO(uri, fileOooO0OO);
                fileOooO0O0 = C27538o00o0o0O.OooO0O0(c27538o00o0o0O, string);
                c20358OooO00o.OooO00o("importStickerCollection, try unzip file: " + fileOooO0OO + " to dir: " + fileOooO0O0, new Object[0]);
                C31193OooOOo.OooO0OO(fileOooO0OO, fileOooO0O0);
                fileOooO0OO.delete();
                File[] fileArrListFiles = fileOooO0O0.listFiles();
                c20358OooO00o.OooO00o("importStickerCollection, unzip file success. files: " + (fileArrListFiles != null ? oOo000Oo.OooOOO.Oooo0O0(fileArrListFiles, null, null, null, new C27531o00o0OOo(), 31) : null), new Object[0]);
                File file = new File(fileOooO0O0, "stickerCollection.json");
                if (!file.exists()) {
                    c20358OooO00o.OooOOO0("StickerUseCase");
                    c20358OooO00o.OooO0o0("importStickerCollection, can not find stickerCollection.json file.", new Object[0]);
                    return Boolean.FALSE;
                }
                String strOooO0oo = C32501OooO0oO.OooO0oo(file);
                c20358OooO00o.OooO00o("importStickerCollection, jsonString: ".concat(strOooO0oo), new Object[0]);
                StickerCollection stickerCollection = (StickerCollection) C28028OooO0o.OooO00o().fromJson(strOooO0oo, StickerCollection.class);
                c20358OooO00o.OooOOO0("StickerUseCase");
                c20358OooO00o.OooO0o0("importStickerCollection, stickerCollection: " + stickerCollection, new Object[0]);
                String name = stickerCollection.getName();
                File[] fileArrListFiles2 = fileOooO0O0.listFiles();
                if (fileArrListFiles2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(file2.getName(), "stickerCollection.json")) {
                            arrayList.add(file2);
                        }
                    }
                    int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (Object obj2 : arrayList) {
                        File file3 = (File) obj2;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(file3);
                        linkedHashMap.put(C32501OooO0oO.OooO0o(file3), obj2);
                    }
                } else {
                    linkedHashMap = C34436OooOoOO.f123455OooOo0o;
                }
                List<String> children = stickerCollection.getChildren();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    File file4 = (File) linkedHashMap.get((String) it.next());
                    Uri uriFromFile = file4 != null ? Uri.fromFile(file4) : null;
                    if (uriFromFile != null) {
                        arrayList2.add(uriFromFile);
                    }
                }
                this.f96507OooOo0o = fileOooO0O0;
                this.f96506OooOo = 1;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27522o00o00oO(arrayList2, null, false, c27538o00o0o0O, name, null), this);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOooO0O0 = this.f96507OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
            }
            Boolean bool = (Boolean) objOooO0o;
            boolean zBooleanValue = bool.booleanValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StickerUseCase");
            c20358OooO00o2.OooO0o0("importStickerCollection, createStickerCollection result: " + zBooleanValue, new Object[0]);
            C32501OooO0oO.OooO0Oo(fileOooO0O0);
            return bool;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("StickerUseCase");
            c20358OooO00o3.OooO0Oo(e, "importStickerCollection failed.", new Object[0]);
            return Boolean.FALSE;
        }
    }
}
