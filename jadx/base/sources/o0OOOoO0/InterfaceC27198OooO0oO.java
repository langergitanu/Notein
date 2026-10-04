package o0OOOoO0;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34396OooOO0O;
import oOO00oOo.InterfaceC34401OooOOoo;
import oOO00oOo.OooOOOO;

/* JADX INFO: renamed from: o0OOOoO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m80612d2 = {"Lo0OOOoO0/OooO0oO;", "", "Lo0OOOoO0/OooO00o;", "body", "Lo0OOOoO0/OooO0O0;", "OooO0O0", "(Lo0OOOoO0/OooO00o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "taskId", "Lo0OOOoO0/OooO0o0;", "OooO00o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface InterfaceC27198OooO0oO {
    @InterfaceC34396OooOO0O({"Content-Type: application/json"})
    @InterfaceC34391OooO0o("/api/developer/v1/tasks/{taskId}")
    Object OooO00o(@InterfaceC34401OooOOoo("taskId") String str, Continuation<? super C27197OooO0o0> continuation);

    @InterfaceC34396OooOO0O({"Content-Type: application/json"})
    @OooOOOO("/api/developer/v1/office/convert/to/pdf")
    Object OooO0O0(@InterfaceC34387OooO00o C27192OooO00o c27192OooO00o, Continuation<? super C27193OooO0O0> continuation);
}
