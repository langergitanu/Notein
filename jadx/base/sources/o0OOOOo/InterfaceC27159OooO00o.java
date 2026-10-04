package o0OOOOo;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import com.orion.notein.domain.models.p605ai.NoteinAiQuotaRecordV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27174OooO0O0;
import oOO00oOo.InterfaceC34386OooO;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34397OooOO0o;
import oOO00oOo.InterfaceC34400OooOOo0;
import oOO00oOo.OooOOOO;
import oOO00oOo.OooOo00;
import okhttp3.MultipartBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0004\u000e\u0013\u000b\u0015JB\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m80612d2 = {"Lo0OOOOo/OooO00o;", "", "", "appCheckToken", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "", "Lokhttp3/MultipartBody$Part;", "files", "LooooOOo0/OooOoO;", "Lo0OOOo0/OooO0O0;", "Lo0OOOOo/OooO00o$OooO0O0;", "OooO0OO", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOOo/OooO00o$OooO00o;", "OooO0O0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOOo/OooO00o$OooO0OO;", "request", "Lo0OOOOo/OooO00o$OooO0Oo;", "OooO00o", "(Lo0OOOOo/OooO00o$OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OooO0Oo", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface InterfaceC27159OooO00o {

    /* JADX INFO: renamed from: o0OOOOo.OooO00o$OooO00o, reason: collision with other inner class name */
    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OOOOo/OooO00o$OooO00o;", "", "", "Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2;", "OooO00o", "Ljava/util/List;", "()Ljava/util/List;", "list", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class C19853OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("list")
        private final List<NoteinAiQuotaRecordV2> list;

        public final List<NoteinAiQuotaRecordV2> OooO00o() {
            return this.list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19853OooO00o) && OooOOO0.OooO0O0(this.list, ((C19853OooO00o) obj).list);
        }

        public final int hashCode() {
            return this.list.hashCode();
        }

        public final String toString() {
            return "GetOcrAiQuotaResponse(list=" + this.list + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOOOo.OooO00o$OooO0O0 */
    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OOOOo/OooO00o$OooO0O0;", "", "", "Lcom/orion/notein/domain/models/ai/ImageToHtmlResult;", "OooO00o", "Ljava/util/List;", "()Ljava/util/List;", "results", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("results")
        private final List<ImageToHtmlResult> results;

        public final List<ImageToHtmlResult> OooO00o() {
            return this.results;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && OooOOO0.OooO0O0(this.results, ((OooO0O0) obj).results);
        }

        public final int hashCode() {
            return this.results.hashCode();
        }

        public final String toString() {
            return "ImageToHtmlResponse(results=" + this.results + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOOOo.OooO00o$OooO0OO */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OOOOo/OooO00o$OooO0OO;", "", "Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2;", "OooO00o", "Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2;", "getRecord", "()Lcom/orion/notein/domain/models/ai/NoteinAiQuotaRecordV2;", "record", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("record")
        private final NoteinAiQuotaRecordV2 record;

        public OooO0OO(NoteinAiQuotaRecordV2 record) {
            OooOOO0.OooO0oO(record, "record");
            this.record = record;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && OooOOO0.OooO0O0(this.record, ((OooO0OO) obj).record);
        }

        public final int hashCode() {
            return this.record.hashCode();
        }

        public final String toString() {
            return "ReportAiQuotaRecordRequest(record=" + this.record + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOOOo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m80612d2 = {"Lo0OOOOo/OooO00o$OooO0Oo;", "", "", "OooO00o", "Z", "()Z", "result", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class C27160OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("result")
        private final boolean result;

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final boolean getResult() {
            return this.result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27160OooO0Oo) && this.result == ((C27160OooO0Oo) obj).result;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.result);
        }

        public final String toString() {
            return "ReportAiQuotaRecordResponse(result=" + this.result + ")";
        }
    }

    @OooOOOO("/v2/report-ai-quota-record")
    Object OooO00o(@InterfaceC34387OooO00o OooO0OO oooO0OO, Continuation<? super C35238OooOoO<C27174OooO0O0<C27160OooO0Oo>>> continuation);

    @OooOOOO("/v2/quota")
    Object OooO0O0(Continuation<? super C35238OooOoO<C27174OooO0O0<C19853OooO00o>>> continuation);

    @InterfaceC34397OooOO0o
    @OooOOOO("/v1/images-to-html")
    Object OooO0OO(@InterfaceC34386OooO("X-Firebase-AppCheck") String str, @OooOo00(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL) String str2, @InterfaceC34400OooOOo0 List<MultipartBody.Part> list, Continuation<? super C35238OooOoO<C27174OooO0O0<OooO0O0>>> continuation);
}
