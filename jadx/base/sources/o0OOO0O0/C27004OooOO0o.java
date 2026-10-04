package o0OOO0O0;

import com.google.firebase.Firebase;
import com.google.firebase.vertexai.FirebaseVertexAI;
import com.google.firebase.vertexai.FirebaseVertexAIKt;
import com.google.firebase.vertexai.type.ContentKt;
import o0000oOO.AbstractC24338OooO0o0;
import oo0oO0.InterfaceC34994oOooo0o;

/* JADX INFO: renamed from: o0OOO0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27004OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34994oOooo0o f93961OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f93962OooO0O0;

    public C27004OooOO0o(InterfaceC34994oOooo0o dao, o0000o0O.OooOO0<AbstractC24338OooO0o0> datastore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(datastore, "datastore");
        this.f93961OooO00o = dao;
        this.f93962OooO0O0 = datastore;
        FirebaseVertexAI.generativeModel$default(FirebaseVertexAIKt.getVertexAI(Firebase.INSTANCE), "gemini-2.5-flash-lite", null, null, null, null, ContentKt.content$default(null, new OooO(0), 1, null), null, 94, null);
    }
}
