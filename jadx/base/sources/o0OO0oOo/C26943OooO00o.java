package o0OO0oOo;

import OooOooO.C20741OooOOoo;
import com.google.firebase.Firebase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.StorageKt;
import com.google.firebase.storage.StorageReference;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.font.FontDownloadServiceImpl$downloadFont$2", m80623f = "FontDownloadServiceImpl.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C26943OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f93590OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f93591OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93592OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26943OooO00o(String str, File file, Continuation<? super C26943OooO00o> continuation) {
        super(2, continuation);
        this.f93592OooOoO0 = str;
        this.f93591OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26943OooO00o(this.f93592OooOoO0, this.f93591OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C26943OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        File fileCreateTempFile;
        File file = this.f93591OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93589OooOo;
        String str = this.f93592OooOoO0;
        boolean zOooO00o = false;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
                OooOOO0.OooO0o(reference, "getReference(...)");
                StorageReference storageReferenceChild = reference.child("fonts/" + str + ".ttf");
                OooOOO0.OooO0o(storageReferenceChild, "child(...)");
                fileCreateTempFile = File.createTempFile("font", "ttf");
                FileDownloadTask file2 = storageReferenceChild.getFile(fileCreateTempFile);
                OooOOO0.OooO0o(file2, "getFile(...)");
                this.f93590OooOo0o = fileCreateTempFile;
                this.f93589OooOo = 1;
                obj = C20741OooOOoo.OooO0o(file2, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileCreateTempFile = this.f93590OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            FileDownloadTask.TaskSnapshot taskSnapshot = (FileDownloadTask.TaskSnapshot) obj;
            if (taskSnapshot.getError() == null) {
                C31190OooO0oo.OooO0o(file);
                zOooO00o = C31190OooO0oo.OooO00o(fileCreateTempFile, new File(file, str.concat(".ttf")));
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FontDownloadService");
                c20358OooO00o.OooO0OO("download font error: " + taskSnapshot.getError(), new Object[0]);
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zOooO00o);
    }
}
