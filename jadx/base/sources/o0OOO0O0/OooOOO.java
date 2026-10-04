package o0OOO0O0;

import android.graphics.Bitmap;
import com.aspose.slides.C22200OooO0o0;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOOo.InterfaceC27159OooO00o;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.VertexAiRemoteGoogleDataSource$extractTextFromImagesUnsafe$2", m80623f = "VertexAiRemoteGoogleDataSource.kt", m80624l = {80}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends ImageToHtmlResult>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93963OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f93964OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27006OooOOo0 f93965OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<Bitmap> f93966OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93967OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(List list, C27006OooOOo0 c27006OooOOo0, String str, Continuation continuation) {
        super(2, continuation);
        this.f93966OooOoO0 = list;
        this.f93965OooOoO = c27006OooOOo0;
        this.f93967OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f93966OooOoO0, this.f93965OooOoO, this.f93967OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends ImageToHtmlResult>>> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        long j;
        List<ImageToHtmlResult> listOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93963OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<Bitmap> list = this.f93966OooOoO0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    MultipartBody.Part partOooO0O0 = null;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    Bitmap bitmap = (Bitmap) obj2;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            RequestBody.Companion companion = RequestBody.INSTANCE;
                            MediaType.f124148OooO0o0.getClass();
                            MediaType mediaTypeOooO0O0 = MediaType.Companion.OooO0O0("image/jpeg");
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(byteArray);
                            RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2OooO0OO = RequestBody.Companion.OooO0OO(companion, mediaTypeOooO0O0, byteArray, 0, 12);
                            MultipartBody.Part.f124167OooO0OO.getClass();
                            partOooO0O0 = MultipartBody.Part.Companion.OooO0O0("files", "ai_ocr_image_" + i2 + ".jpeg", requestBody$Companion$toRequestBody$2OooO0OO);
                        } finally {
                        }
                    }
                    arrayList.add(partOooO0O0);
                    i2 = i3;
                }
                InterfaceC27159OooO00o interfaceC27159OooO00o = this.f93965OooOoO.f93973OooO00o;
                String str = this.f93967OooOoOO;
                this.f93964OooOo0o = jCurrentTimeMillis;
                this.f93963OooOo = 1;
                obj = interfaceC27159OooO00o.OooO0OO("empty", str, arrayList, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                j = jCurrentTimeMillis;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.f93964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            if (!c35238OooOoO.f126541OooO00o.OooO0OO() || c27174OooO0O0 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiOcrRemoteGoogleDataSource");
                c20358OooO00o.OooO0OO("Unable to convert image to html, response: " + c35238OooOoO, new Object[0]);
                return new C27174OooO0O0(false, null, "100001", "Request error", 2);
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") && c27174OooO0O0.OooO0O0() != null) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AiOcrRemoteGoogleDataSource");
                c20358OooO00o2.OooO00o(C22200OooO0o0.OooO0O0(jCurrentTimeMillis2 - j, "Time taken to extract text from image: ", " ms"), new Object[0]);
                return new C27174OooO0O0(true, ((InterfaceC27159OooO00o.OooO0O0) c27174OooO0O0.OooO0O0()).OooO00o(), "0", null, 8);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooO0OO(OooOOO0.OooO0O0(c20358OooO00o3, "AiOcrRemoteGoogleDataSource", "Unable to convert to html, error: ", c27174OooO0O0), new Object[0]);
            String errorCode = c27174OooO0O0.getErrorCode();
            if (errorCode == null) {
                errorCode = "100001";
            }
            String errorMsg = c27174OooO0O0.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = "Server error";
            }
            InterfaceC27159OooO00o.OooO0O0 oooO0O0 = (InterfaceC27159OooO00o.OooO0O0) c27174OooO0O0.OooO0O0();
            if (oooO0O0 == null || (listOooO00o = oooO0O0.OooO00o()) == null) {
                listOooO00o = C34434OooOoO.f123453OooOo0o;
            }
            return new C27174OooO0O0(errorCode, errorMsg, listOooO00o, false);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("AiOcrRemoteGoogleDataSource");
            c20358OooO00o4.OooO0OO("Unable to convert image to html, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            String message = e.getMessage();
            if (message == null) {
                message = "Network error";
            }
            return new C27174OooO0O0(false, null, "199999", message, 2);
        }
    }
}
