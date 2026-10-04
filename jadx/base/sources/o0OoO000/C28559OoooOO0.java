package o0OoO000;

import OooOooO.C20741OooOOoo;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import o000oo0.C24684Oooo;
import o0OOOo.InterfaceC27172OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: o0OoO000.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$getMicrosoftPhotoUri$2", m80623f = "FirebaseLoginViewModel.kt", m80624l = {138, 144, 146}, m80625m = "invokeSuspend")
public final class C28559OoooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Uri>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f101217OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StorageReference f101218OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101219OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101220OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101221OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28559OoooOO0(C28560OoooOOO c28560OoooOOO, String str, String str2, Continuation<? super C28559OoooOO0> continuation) {
        super(2, continuation);
        this.f101220OooOoO0 = c28560OoooOOO;
        this.f101219OooOoO = str;
        this.f101221OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28559OoooOO0(this.f101220OooOoO0, this.f101219OooOoO, this.f101221OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Uri> continuation) {
        return ((C28559OoooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r11 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:29:0x00b8, B:14:0x0028, B:24:0x0097, B:26:0x00a3, B:31:0x00bb, B:15:0x002c, B:21:0x0054, B:18:0x0033), top: B:36:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:29:0x00b8, B:14:0x0028, B:24:0x0097, B:26:0x00a3, B:31:0x00bb, B:15:0x002c, B:21:0x0054, B:18:0x0033), top: B:36:0x000e }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StorageReference storageReferenceChild;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101217OooOo;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "FirebaseLoginViewModel", "getMicrosoftPhotoUri: failed to get photo: ", e), new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27172OooO00o interfaceC27172OooO00o = (InterfaceC27172OooO00o) this.f101220OooOoO0.f101231OooOOO0.getValue();
            String str = "Bearer " + this.f101219OooOoO;
            this.f101217OooOo = 1;
            obj = interfaceC27172OooO00o.OooO00o(str, this);
            if (obj == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return (Uri) obj;
            }
            storageReferenceChild = this.f101218OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((UploadTask.TaskSnapshot) obj).getTask().isSuccessful()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("FirebaseLoginViewModel");
                c20358OooO00o2.OooO0OO("getMicrosoftPhotoUri: failed to upload photo", new Object[0]);
                return Uri.EMPTY;
            }
            Task<Uri> downloadUrl = storageReferenceChild.getDownloadUrl();
            kotlin.jvm.internal.OooOOO0.OooO0o(downloadUrl, "getDownloadUrl(...)");
            this.f101218OooOo0o = null;
            this.f101217OooOo = 3;
            obj = C20741OooOOoo.OooO0o(downloadUrl, this);
        }
        InputStream inputStreamByteStream = ((ResponseBody) obj).byteStream();
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        kotlin.jvm.internal.OooOOO0.OooO0o(reference, "getReference(...)");
        storageReferenceChild = reference.child("user_photo/" + this.f101221OooOoOO + "}");
        kotlin.jvm.internal.OooOOO0.OooO0o(storageReferenceChild, "child(...)");
        UploadTask uploadTaskPutStream = storageReferenceChild.putStream(inputStreamByteStream);
        kotlin.jvm.internal.OooOOO0.OooO0o(uploadTaskPutStream, "putStream(...)");
        this.f101218OooOo0o = storageReferenceChild;
        this.f101217OooOo = 2;
        obj = C20741OooOOoo.OooO0o(uploadTaskPutStream, this);
        if (obj != enumC32485OooO00o) {
            if (((UploadTask.TaskSnapshot) obj).getTask().isSuccessful()) {
            }
        }
        return enumC32485OooO00o;
    }
}
