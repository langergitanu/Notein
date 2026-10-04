package o0OOo0o;

import Oooo0oO.C21111o0ooOoO;
import androidx.core.content.C21638OooO0Oo;
import com.orion.notein.domain.models.sticker.StickerCollection;
import com.orion.notein.domain.models.sticker.StickerCollectionErrorCode;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27298OooOOO0;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import o0Oo00o.C28028OooO0o;
import o0oOo00.C30931OooO0OO;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0o.o00o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$exportStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {514, 522}, m80625m = "invokeSuspend")
public final class C27512o00o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<File>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f96418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StickerCollection f96419OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96420OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96421OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f96422OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C30931OooO0OO f96423OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27512o00o0(C27538o00o0o0O c27538o00o0o0O, String str, C30931OooO0OO c30931OooO0OO, Continuation continuation) {
        super(2, continuation);
        this.f96420OooOoO = c27538o00o0o0O;
        this.f96422OooOoOO = str;
        this.f96423OooOoo0 = c30931OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27512o00o0(this.f96420OooOoO, this.f96422OooOoOO, this.f96423OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<File>> continuation) {
        return ((C27512o00o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objOooO;
        StickerCollection stickerCollection;
        Object objOooO0Oo;
        File file;
        boolean zOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96421OooOoO0;
        String str = this.f96422OooOoOO;
        C27538o00o0o0O c27538o00o0o0O = this.f96420OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c27538o00o0o0O.f96550OooO00o;
            String strOooO0Oo = c27538o00o0o0O.f96551OooO0O0.OooO0Oo();
            this.f96421OooOoO0 = 1;
            objOooO = interfaceC27321Oooo0o.OooO(str, strOooO0Oo, this);
            if (objOooO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f96418OooOo;
            stickerCollection = this.f96419OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = obj;
            File file2 = (File) objOooO0Oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o(C21638OooO0Oo.OooO00o(file2, "exportStickerCollection, srcDir: "), new Object[0]);
            Float f = new Float(0.2f);
            C30931OooO0OO c30931OooO0OO = this.f96423OooOoo0;
            c30931OooO0OO.invoke(f);
            zOooO00o = C31190OooO0oo.OooO00o(file2, file);
            c20358OooO00o.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("exportStickerCollection, copy srcDir to cacheDir result: ", zOooO00o), new Object[0]);
            if (zOooO00o) {
                c20358OooO00o.OooOOO0("StickerUseCase");
                c20358OooO00o.OooO0OO("exportStickers failed, copy sticker files failed.", new Object[0]);
                return new C27174OooO0O0(false, null, "100001", null, 10);
            }
            c30931OooO0OO.invoke(new Float(0.4f));
            File file3 = new File(file, "stickerCollection.json");
            String json = C28028OooO0o.OooO00o().toJson(stickerCollection);
            kotlin.jvm.internal.OooOOO0.OooO0o(json, "toJson(...)");
            C32501OooO0oO.OooO(file3, json);
            c20358OooO00o.OooO00o("exportStickerCollection, write stickerCollection.json success.", new Object[0]);
            c30931OooO0OO.invoke(new Float(0.5f));
            File fileOooO0OO = C27538o00o0o0O.OooO0OO(c27538o00o0o0O, str);
            File[] fileArrListFiles = file.listFiles();
            C31193OooOOo.OooO0o(fileArrListFiles != null ? oOo000Oo.OooOOO.OoooOO0(fileArrListFiles) : C34434OooOoO.f123453OooOo0o, fileOooO0OO);
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("exportStickerCollection, zip files success. file size: ", C31430OooO00o.OooO0OO(fileOooO0OO.length())), new Object[0]);
            C32501OooO0oO.OooO0Oo(file);
            c30931OooO0OO.invoke(new Float(0.8f));
            InterfaceC27298OooOOO0 interfaceC27298OooOOO0 = c27538o00o0o0O.f96552OooO0OO;
            File fileOooO00o = interfaceC27298OooOOO0.OooO00o();
            File file4 = new File(fileOooO00o, C31190OooO0oo.OooOOo0(new File(fileOooO00o, C21111o0ooOoO.OooO0Oo(stickerCollection.getName(), ".stickers"))));
            c20358OooO00o.OooO00o(C21638OooO0Oo.OooO00o(file4, "exportStickerCollection, try encrypting zipFile to file: "), new Object[0]);
            interfaceC27298OooOOO0.OooO0O0(fileOooO0OO, file4);
            fileOooO0OO.delete();
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("exportStickerCollection, encrypt zipFile success. file size: ", C31430OooO00o.OooO0OO(file4.length())), new Object[0]);
            c30931OooO0OO.invoke(new Float(1.0f));
            return new C27174OooO0O0(true, file4, null, null, 12);
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO = obj;
        stickerCollection = (StickerCollection) objOooO;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("StickerUseCase");
        c20358OooO00o2.OooO0o0("exportStickerCollection, stickerCollection: " + stickerCollection, new Object[0]);
        if (stickerCollection == null) {
            c20358OooO00o2.OooOOO0("StickerUseCase");
            c20358OooO00o2.OooO0OO("exportStickers failed, can not find stickerCollection.", new Object[0]);
            return new C27174OooO0O0(false, null, StickerCollectionErrorCode.ERROR_STICKER_COLLECTION_NOT_EXISTED, null, 10);
        }
        File fileOooO0O0 = C27538o00o0o0O.OooO0O0(c27538o00o0o0O, str);
        c20358OooO00o2.OooO00o(C21638OooO0Oo.OooO00o(fileOooO0O0, "exportStickerCollection, cacheDir: "), new Object[0]);
        this.f96419OooOo0o = stickerCollection;
        this.f96418OooOo = fileOooO0O0;
        this.f96421OooOoO0 = 2;
        objOooO0Oo = C27538o00o0o0O.OooO0Oo(c27538o00o0o0O, str, this);
        if (objOooO0Oo != enumC32485OooO00o) {
            file = fileOooO0O0;
            File file22 = (File) objOooO0Oo;
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO00o(C21638OooO0Oo.OooO00o(file22, "exportStickerCollection, srcDir: "), new Object[0]);
            Float f2 = new Float(0.2f);
            C30931OooO0OO c30931OooO0OO2 = this.f96423OooOoo0;
            c30931OooO0OO2.invoke(f2);
            zOooO00o = C31190OooO0oo.OooO00o(file22, file);
            c20358OooO00o3.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("exportStickerCollection, copy srcDir to cacheDir result: ", zOooO00o), new Object[0]);
            if (zOooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
