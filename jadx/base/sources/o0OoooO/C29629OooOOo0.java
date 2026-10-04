package o0OoooO;

import OooOooO.C20741OooOOoo;
import android.content.Context;
import android.net.Uri;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.facebook.soloader.OooOo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.storage.StorageException;
import com.google.firebase.storage.StorageKt;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.firebase.vertexai.Chat;
import com.google.firebase.vertexai.FirebaseVertexAI;
import com.google.firebase.vertexai.FirebaseVertexAIKt;
import com.google.firebase.vertexai.GenerativeModel;
import com.google.firebase.vertexai.type.ContentKt;
import com.google.firebase.vertexai.type.CountTokensResponse;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.ServerException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import o000oo0.C24684Oooo;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0Oo.C33736OooOo0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29629OooOOo0 extends AbstractC29615OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final GenerativeModel f105052OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicBoolean f105053OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Chat f105054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Chat f105055OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f105056OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33898OooO0Oo f105057OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f105058OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29629OooOOo0(Context context, String str, File file, String str2) {
        super(file);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f105052OooO0O0 = FirebaseVertexAI.generativeModel$default(FirebaseVertexAIKt.vertexAI$default(Firebase.INSTANCE, null, str2, 1, null), str, null, null, null, null, ContentKt.content$default(null, new C29616OooO0OO(context, 0), 1, null), null, 94, null);
        this.f105053OooO0OO = new AtomicBoolean(false);
        this.f105056OooO0o0 = new AtomicBoolean(false);
        this.f105057OooO0oO = C33900OooO0o0.OooO00o();
    }

    public static String OooO0o(StorageMetadata storageMetadata) {
        return C22237OooO0o0.OooO00o("gs://", storageMetadata.getBucket(), "/", storageMetadata.getPath());
    }

    public static C27174OooO0O0 OooOO0O(Throwable th) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("GeminiAssistant");
        c20358OooO00o.OooOO0O("generateTextFromPdfFile: failed to generate content. " + th, new Object[0]);
        return ((th instanceof ServerException) && C33599OooOo0O.OooOoOO(th.toString(), "UNAUTHENTICATED", false)) ? new C27174OooO0O0("100008", th.getMessage(), null, false) : new C27174OooO0O0("499999", th.getMessage(), null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29626OooOOO0 c29626OooOOO0;
        C29629OooOOo0 c29629OooOOo0;
        if (abstractC32479OooO0OO instanceof C29626OooOOO0) {
            c29626OooOOO0 = (C29626OooOOO0) abstractC32479OooO0OO;
            int i = c29626OooOOO0.f105038OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29626OooOOO0.f105038OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29626OooOOO0 = new C29626OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objStartChat = c29626OooOOO0.f105036OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29626OooOOO0.f105038OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objStartChat);
            if (this.f105053OooO0OO.compareAndSet(false, true)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GeminiAssistant");
                c20358OooO00o.OooO00o("initSummarizationModel", new Object[0]);
                c29626OooOOO0.f105037OooOo0o = this;
                c29626OooOOO0.f105038OooOoO = 1;
                String str = this.f105058OooO0oo;
                if (str == null) {
                    objStartChat = null;
                } else {
                    objStartChat = this.f105052OooO0O0.startChat(OooOo.OooO0oO(ContentKt.content("user", new C29617OooO0Oo(str, 0))));
                }
                if (objStartChat == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c29629OooOOo0 = this;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c29629OooOOo0 = c29626OooOOO0.f105037OooOo0o;
        C32446OooOOOo.OooO0O0(objStartChat);
        c29629OooOOo0.f105054OooO0Oo = (Chat) objStartChat;
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:41:0x00a7, B:43:0x00ab, B:45:0x00b9, B:30:0x0086, B:32:0x008a), top: B:61:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v24, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v14, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.firebase.vertexai.Chat] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29619OooO0o0 c29619OooO0o0;
        C29629OooOOo0 c29629OooOOo0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        ?? r14;
        C29629OooOOo0 c29629OooOOo02;
        ?? r4;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        ?? r142;
        ?? r42;
        Exception e;
        C29629OooOOo0 c29629OooOOo03;
        Object objSendMessage;
        C27174OooO0O0 c27174OooO0O0OooOO0O;
        ?? r15;
        ?? r143;
        if (abstractC32479OooO0OO instanceof C29619OooO0o0) {
            c29619OooO0o0 = (C29619OooO0o0) abstractC32479OooO0OO;
            int i = c29619OooO0o0.f105009OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29619OooO0o0.f105009OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29619OooO0o0 = new C29619OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29619OooO0o0.f105006OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29619OooO0o0.f105009OooOoo0;
        try {
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "GeminiAssistant", "chatWithAiAssistant: ", str), new Object[0]);
                    c29619OooO0o0.f105005OooOo0o = this;
                    c29619OooO0o0.f105004OooOo = str;
                    C33898OooO0Oo c33898OooO0Oo = this.f105057OooO0oO;
                    c29619OooO0o0.f105007OooOoO0 = c33898OooO0Oo;
                    c29619OooO0o0.f105009OooOoo0 = 1;
                    if (c33898OooO0Oo.OooO00o(c29619OooO0o0) != enumC32485OooO00o) {
                        c29629OooOOo0 = this;
                        r14 = str;
                        interfaceC33895OooO00o = c33898OooO0Oo;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (InterfaceC33895OooO00o) c29619OooO0o0.f105004OooOo;
                        c29629OooOOo03 = c29619OooO0o0.f105005OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(obj);
                            str = str;
                            GenerateContentResponse generateContentResponse = (GenerateContentResponse) obj;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GeminiAssistant");
                            c20358OooO00o2.OooO00o("chatWithAiAssistant: response=" + generateContentResponse.getText(), new Object[0]);
                            c27174OooO0O0OooOO0O = new C27174OooO0O0("0", null, generateContentResponse.getText(), true);
                            r143 = str;
                        } catch (Exception e2) {
                            e = e2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("GeminiAssistant");
                            c20358OooO00o3.OooOO0O("chatWithAiAssistant: failed to chat. " + e, new Object[0]);
                            c29629OooOOo03.getClass();
                            c27174OooO0O0OooOO0O = OooOO0O(e);
                            r143 = str;
                        }
                        r15 = r143;
                        r15.OooOOO0(null);
                        return c27174OooO0O0OooOO0O;
                    }
                    InterfaceC33895OooO00o interfaceC33895OooO00o4 = c29619OooO0o0.f105007OooOoO0;
                    String str2 = (String) c29619OooO0o0.f105004OooOo;
                    c29629OooOOo02 = c29619OooO0o0.f105005OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    r4 = str2;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                    r142 = r4;
                    r42 = c29629OooOOo02.f105055OooO0o;
                    if (r42 == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("GeminiAssistant");
                        c20358OooO00o4.OooOO0O("chatWithAiAssistant: chatBot is null", new Object[0]);
                        c27174OooO0O0OooOO0O = null;
                        r15 = interfaceC33895OooO00o3;
                        r15.OooOOO0(null);
                        return c27174OooO0O0OooOO0O;
                    }
                    try {
                        c29619OooO0o0.f105005OooOo0o = c29629OooOOo02;
                        c29619OooO0o0.f105004OooOo = interfaceC33895OooO00o3;
                        c29619OooO0o0.f105007OooOoO0 = null;
                        c29619OooO0o0.f105009OooOoo0 = 3;
                        objSendMessage = r42.sendMessage(r142, c29619OooO0o0);
                    } catch (Exception e3) {
                        InterfaceC33895OooO00o interfaceC33895OooO00o5 = interfaceC33895OooO00o3;
                        e = e3;
                        str = interfaceC33895OooO00o5;
                        c29629OooOOo03 = c29629OooOOo02;
                        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o32.OooOOO0("GeminiAssistant");
                        c20358OooO00o32.OooOO0O("chatWithAiAssistant: failed to chat. " + e, new Object[0]);
                        c29629OooOOo03.getClass();
                        c27174OooO0O0OooOO0O = OooOO0O(e);
                        r143 = str;
                    }
                    if (objSendMessage != enumC32485OooO00o) {
                        InterfaceC33895OooO00o interfaceC33895OooO00o6 = interfaceC33895OooO00o3;
                        obj = objSendMessage;
                        str = interfaceC33895OooO00o6;
                        c29629OooOOo03 = c29629OooOOo02;
                        GenerateContentResponse generateContentResponse2 = (GenerateContentResponse) obj;
                        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o22.OooOOO0("GeminiAssistant");
                        c20358OooO00o22.OooO00o("chatWithAiAssistant: response=" + generateContentResponse2.getText(), new Object[0]);
                        c27174OooO0O0OooOO0O = new C27174OooO0O0("0", null, generateContentResponse2.getText(), true);
                        r143 = str;
                        r15 = r143;
                        r15.OooOOO0(null);
                        return c27174OooO0O0OooOO0O;
                    }
                    return enumC32485OooO00o;
                }
                InterfaceC33895OooO00o interfaceC33895OooO00o7 = c29619OooO0o0.f105007OooOoO0;
                String str3 = (String) c29619OooO0o0.f105004OooOo;
                c29629OooOOo0 = c29619OooO0o0.f105005OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o7;
                r14 = str3;
                if (c29629OooOOo0.f105055OooO0o == null) {
                    c29619OooO0o0.f105005OooOo0o = c29629OooOOo0;
                    c29619OooO0o0.f105004OooOo = r14;
                    c29619OooO0o0.f105007OooOoO0 = interfaceC33895OooO00o;
                    c29619OooO0o0.f105009OooOoo0 = 2;
                    if (c29629OooOOo0.OooO0oo(c29619OooO0o0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    r4 = r14;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    c29629OooOOo02 = c29629OooOOo0;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                    r142 = r4;
                    r42 = c29629OooOOo02.f105055OooO0o;
                    if (r42 == 0) {
                    }
                } else {
                    c29629OooOOo02 = c29629OooOOo0;
                    r142 = r14;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                    r42 = c29629OooOOo02.f105055OooO0o;
                    if (r42 == 0) {
                    }
                }
            } catch (Throwable th) {
                InterfaceC33895OooO00o interfaceC33895OooO00o8 = interfaceC33895OooO00o;
                th = th;
                str = interfaceC33895OooO00o8;
                str.OooOOO0(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #2 {all -> 0x008d, blocks: (B:34:0x008f, B:36:0x0093, B:38:0x00a1, B:41:0x00b6, B:24:0x006f, B:26:0x0073), top: B:51:0x006f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29618OooO0o c29618OooO0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C29629OooOOo0 c29629OooOOo0;
        String str2;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        C29629OooOOo0 c29629OooOOo02;
        Throwable th;
        Chat chat;
        C33736OooOo0 c33736OooOo0;
        if (abstractC32479OooO0OO instanceof C29618OooO0o) {
            c29618OooO0o = (C29618OooO0o) abstractC32479OooO0OO;
            int i = c29618OooO0o.f105003OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29618OooO0o.f105003OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29618OooO0o = new C29618OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29618OooO0o.f105000OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29618OooO0o.f105003OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "GeminiAssistant", "chatWithAiAssistant: ", str), new Object[0]);
                c29618OooO0o.f104999OooOo0o = this;
                c29618OooO0o.f104998OooOo = str;
                interfaceC33895OooO00o = this.f105057OooO0oO;
                c29618OooO0o.f105001OooOoO0 = interfaceC33895OooO00o;
                c29618OooO0o.f105003OooOoo0 = 1;
                if (interfaceC33895OooO00o.OooO00o(c29618OooO0o) != enumC32485OooO00o) {
                    c29629OooOOo0 = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = c29618OooO0o.f105001OooOoO0;
                str2 = c29618OooO0o.f104998OooOo;
                c29629OooOOo02 = c29618OooO0o.f104999OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC33895OooO00o = interfaceC33895OooO00o2;
                    c29629OooOOo0 = c29629OooOOo02;
                    str = str2;
                    chat = c29629OooOOo0.f105055OooO0o;
                    if (chat == null) {
                        try {
                            c33736OooOo0 = new C33736OooOo0(new C29621OooO0oo(chat.sendMessageStream(str)), new C29620OooO0oO(c29629OooOOo0, null));
                        } catch (Exception e) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GeminiAssistant");
                            c20358OooO00o2.OooOO0O("chatWithAiAssistant: failed to chat. " + e, new Object[0]);
                            c33736OooOo0 = null;
                        }
                        interfaceC33895OooO00o.OooOOO0(null);
                        return c33736OooOo0;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("GeminiAssistant");
                    c20358OooO00o3.OooOO0O("chatWithAiAssistantStream: chatBot is null", new Object[0]);
                    c33736OooOo0 = null;
                    interfaceC33895OooO00o.OooOOO0(null);
                    return c33736OooOo0;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = c29618OooO0o.f105001OooOoO0;
            String str3 = c29618OooO0o.f104998OooOo;
            c29629OooOOo0 = c29618OooO0o.f104999OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            str = str3;
            if (c29629OooOOo0.f105055OooO0o == null) {
                c29618OooO0o.f104999OooOo0o = c29629OooOOo0;
                c29618OooO0o.f104998OooOo = str;
                c29618OooO0o.f105001OooOoO0 = interfaceC33895OooO00o;
                c29618OooO0o.f105003OooOoo0 = 2;
                if (c29629OooOOo0.OooO0oo(c29618OooO0o) != enumC32485OooO00o) {
                    str2 = str;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    c29629OooOOo02 = c29629OooOOo0;
                    interfaceC33895OooO00o = interfaceC33895OooO00o2;
                    c29629OooOOo0 = c29629OooOOo02;
                    str = str2;
                }
                return enumC32485OooO00o;
            }
            chat = c29629OooOOo0.f105055OooO0o;
            if (chat == null) {
            }
            c33736OooOo0 = null;
            interfaceC33895OooO00o.OooOOO0(null);
            return c33736OooOo0;
        } catch (Throwable th3) {
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(StorageReference storageReference, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C29613OooO c29613OooO;
        if (abstractC32479OooO0OO instanceof C29613OooO) {
            c29613OooO = (C29613OooO) abstractC32479OooO0OO;
            int i = c29613OooO.f104990OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29613OooO.f104990OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c29613OooO = new C29613OooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29613OooO.f104989OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29613OooO.f104990OooOoO0;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            Task<StorageMetadata> metadata = storageReference.getMetadata();
            kotlin.jvm.internal.OooOOO0.OooO0o(metadata, "getMetadata(...)");
            c29613OooO.f104990OooOoO0 = 1;
            Object objOooO0o = C20741OooOOoo.OooO0o(metadata, c29613OooO);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        } catch (StorageException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GeminiAssistant");
            c20358OooO00o.OooOO0O("checkBlobExisted: failed to get metadata. " + e, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29622OooOO0 c29622OooOO0;
        C29629OooOOo0 c29629OooOOo0;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C29622OooOO0) {
            c29622OooOO0 = (C29622OooOO0) abstractC32479OooO0OO;
            int i = c29622OooOO0.f105023OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29622OooOO0.f105023OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29622OooOO0 = new C29622OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29622OooOO0.f105022OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29622OooOO0.f105023OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c29622OooOO0.f105020OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f105057OooO0oO;
            c29622OooOO0.f105019OooOo = c33898OooO0Oo2;
            c29622OooOO0.f105023OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c29622OooOO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c29629OooOOo0 = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c29622OooOO0.f105019OooOo;
            c29629OooOOo0 = c29622OooOO0.f105020OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            String str = c29629OooOOo0.f105058OooO0oo;
            return str != null ? C33599OooOo0O.Ooooo00(str, "/") : null;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    public final StorageReference OooO0o0() throws NoSuchAlgorithmException, IOException {
        File file = this.f104992OooO00o;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            fileInputStream.close();
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            StorageReference storageReferenceChild = StorageKt.getStorage(Firebase.INSTANCE).getReference().child("multimodal_ai/pdf/".concat(string));
            kotlin.jvm.internal.OooOOO0.OooO0o(storageReferenceChild, "child(...)");
            return storageReferenceChild;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29623OooOO0O c29623OooOO0O;
        if (abstractC32479OooO0OO instanceof C29623OooOO0O) {
            c29623OooOO0O = (C29623OooOO0O) abstractC32479OooO0OO;
            int i = c29623OooOO0O.f105026OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29623OooOO0O.f105026OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c29623OooOO0O = new C29623OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objCountTokens = c29623OooOO0O.f105025OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29623OooOO0O.f105026OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objCountTokens);
                GenerativeModel generativeModel = this.f105052OooO0O0;
                c29623OooOO0O.f105026OooOoO0 = 1;
                objCountTokens = generativeModel.countTokens(str, c29623OooOO0O);
                if (objCountTokens == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objCountTokens);
            }
            return new Integer(((CountTokensResponse) objCountTokens).getTotalTokens());
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOO0O(C24684Oooo.OooO0O0(c20358OooO00o, "GeminiAssistant", "getTotalBillableCharacters: failed to count tokens. ", e), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29624OooOO0o c29624OooOO0o;
        C29629OooOOo0 c29629OooOOo0;
        if (abstractC32479OooO0OO instanceof C29624OooOO0o) {
            c29624OooOO0o = (C29624OooOO0o) abstractC32479OooO0OO;
            int i = c29624OooOO0o.f105029OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29624OooOO0o.f105029OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29624OooOO0o = new C29624OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objStartChat = c29624OooOO0o.f105027OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29624OooOO0o.f105029OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objStartChat);
            if (this.f105056OooO0o0.compareAndSet(false, true)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GeminiAssistant");
                c20358OooO00o.OooO00o("initChatBot", new Object[0]);
                c29624OooOO0o.f105028OooOo0o = this;
                c29624OooOO0o.f105029OooOoO = 1;
                String str = this.f105058OooO0oo;
                if (str == null) {
                    objStartChat = null;
                } else {
                    objStartChat = this.f105052OooO0O0.startChat(OooOo.OooO0oO(ContentKt.content("user", new C29617OooO0Oo(str, 0))));
                }
                if (objStartChat == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c29629OooOOo0 = this;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c29629OooOOo0 = c29624OooOO0o.f105028OooOo0o;
        C32446OooOOOo.OooO0O0(objStartChat);
        c29629OooOOo0.f105055OooO0o = (Chat) objStartChat;
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:41:0x008e, B:43:0x0092, B:45:0x009b, B:49:0x00a1), top: B:56:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29625OooOOO c29625OooOOO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C29629OooOOo0 c29629OooOOo0;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        C29629OooOOo0 c29629OooOOo02;
        C29629OooOOo0 c29629OooOOo03;
        StorageMetadata storageMetadata;
        String strOooO0o;
        if (abstractC32479OooO0OO instanceof C29625OooOOO) {
            c29625OooOOO = (C29625OooOOO) abstractC32479OooO0OO;
            int i = c29625OooOOO.f105035OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29625OooOOO.f105035OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29625OooOOO = new C29625OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c29625OooOOO.f105034OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29625OooOOO.f105035OooOoOO;
        boolean z = true;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                c29625OooOOO.f105032OooOo0o = this;
                interfaceC33895OooO00o = this.f105057OooO0oO;
                c29625OooOOO.f105031OooOo = interfaceC33895OooO00o;
                c29625OooOOO.f105035OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(c29625OooOOO) != enumC32485OooO00o) {
                    c29629OooOOo0 = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = c29625OooOOO.f105031OooOo;
                    c29629OooOOo03 = c29625OooOOO.f105032OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0OO);
                        storageMetadata = (StorageMetadata) objOooO0OO;
                        if (storageMetadata == null) {
                            c29629OooOOo03.getClass();
                            strOooO0o = OooO0o(storageMetadata);
                        } else {
                            strOooO0o = null;
                        }
                        c29629OooOOo03.f105058OooO0oo = strOooO0o;
                        if (strOooO0o != null) {
                            z = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return boolValueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                interfaceC33895OooO00o3 = c29625OooOOO.f105031OooOo;
                c29629OooOOo02 = c29625OooOOO.f105032OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                    c29625OooOOO.f105032OooOo0o = c29629OooOOo02;
                    c29625OooOOO.f105031OooOo = interfaceC33895OooO00o3;
                    c29625OooOOO.f105035OooOoOO = 3;
                    objOooO0OO = c29629OooOOo02.OooO0OO((StorageReference) objOooO0OO, c29625OooOOO);
                    if (objOooO0OO != enumC32485OooO00o) {
                        interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                        c29629OooOOo03 = c29629OooOOo02;
                        storageMetadata = (StorageMetadata) objOooO0OO;
                        if (storageMetadata == null) {
                        }
                        c29629OooOOo03.f105058OooO0oo = strOooO0o;
                        if (strOooO0o != null) {
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return boolValueOf2;
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = c29625OooOOO.f105031OooOo;
            c29629OooOOo0 = c29625OooOOO.f105032OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            if (c29629OooOOo0.f105058OooO0oo != null) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                Boolean boolValueOf22 = Boolean.valueOf(z);
                interfaceC33895OooO00o2.OooOOO0(null);
                return boolValueOf22;
            }
            c29625OooOOO.f105032OooOo0o = c29629OooOOo0;
            c29625OooOOO.f105031OooOo = interfaceC33895OooO00o;
            c29625OooOOO.f105035OooOoOO = 2;
            StorageReference storageReferenceOooO0o0 = c29629OooOOo0.OooO0o0();
            if (storageReferenceOooO0o0 != enumC32485OooO00o) {
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                objOooO0OO = storageReferenceOooO0o0;
                c29629OooOOo02 = c29629OooOOo0;
                c29625OooOOO.f105032OooOo0o = c29629OooOOo02;
                c29625OooOOO.f105031OooOo = interfaceC33895OooO00o3;
                c29625OooOOO.f105035OooOoOO = 3;
                objOooO0OO = c29629OooOOo02.OooO0OO((StorageReference) objOooO0OO, c29625OooOOO);
                if (objOooO0OO != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } catch (Throwable th4) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th4;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:41:0x00a5, B:43:0x00a9, B:45:0x00bf, B:30:0x0084, B:32:0x0088), top: B:59:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v27, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v16, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.firebase.vertexai.Chat] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29627OooOOOO c29627OooOOOO;
        C29629OooOOo0 c29629OooOOo0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        ?? r13;
        C29629OooOOo0 c29629OooOOo02;
        ?? r3;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        ?? r132;
        ?? r32;
        Exception e;
        C29629OooOOo0 c29629OooOOo03;
        Object objSendMessage;
        C27174OooO0O0 c27174OooO0O0;
        ?? r14;
        if (abstractC32479OooO0OO instanceof C29627OooOOOO) {
            c29627OooOOOO = (C29627OooOOOO) abstractC32479OooO0OO;
            int i = c29627OooOOOO.f105045OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29627OooOOOO.f105045OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29627OooOOOO = new C29627OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c29627OooOOOO.f105042OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29627OooOOOO.f105045OooOoo0;
        try {
            try {
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "GeminiAssistant", "summarizePdfContent: ", str), new Object[0]);
                    c29627OooOOOO.f105041OooOo0o = this;
                    c29627OooOOOO.f105040OooOo = str;
                    C33898OooO0Oo c33898OooO0Oo = this.f105057OooO0oO;
                    c29627OooOOOO.f105043OooOoO0 = c33898OooO0Oo;
                    c29627OooOOOO.f105045OooOoo0 = 1;
                    if (c33898OooO0Oo.OooO00o(c29627OooOOOO) != enumC32485OooO00o) {
                        c29629OooOOo0 = this;
                        r13 = str;
                        interfaceC33895OooO00o = c33898OooO0Oo;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (InterfaceC33895OooO00o) c29627OooOOOO.f105040OooOo;
                        c29629OooOOo03 = c29627OooOOOO.f105041OooOo0o;
                        try {
                            C32446OooOOOo.OooO0O0(obj);
                            str = str;
                            C27174OooO0O0 c27174OooO0O02 = new C27174OooO0O0("0", null, ((GenerateContentResponse) obj).getText(), true);
                            r14 = str;
                            c27174OooO0O0 = c27174OooO0O02;
                        } catch (Exception e2) {
                            e = e2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GeminiAssistant");
                            c20358OooO00o2.OooOO0O("generateTextFromPdfFile: failed to generate content. " + e, new Object[0]);
                            c29629OooOOo03.getClass();
                            C27174OooO0O0 c27174OooO0O0OooOO0O = OooOO0O(e);
                            r14 = str;
                            c27174OooO0O0 = c27174OooO0O0OooOO0O;
                        }
                        r14.OooOOO0(null);
                        return c27174OooO0O0;
                    }
                    InterfaceC33895OooO00o interfaceC33895OooO00o4 = c29627OooOOOO.f105043OooOoO0;
                    String str2 = (String) c29627OooOOOO.f105040OooOo;
                    c29629OooOOo02 = c29627OooOOOO.f105041OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    r3 = str2;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o4;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                    r132 = r3;
                    r32 = c29629OooOOo02.f105054OooO0Oo;
                    if (r32 == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("GeminiAssistant");
                        c20358OooO00o3.OooOO0O("summarizePdfContent: summarizationModel is null", new Object[0]);
                        c27174OooO0O0 = new C27174OooO0O0("499999", "summarizationModel is null", null, false);
                        r14 = interfaceC33895OooO00o3;
                        r14.OooOOO0(null);
                        return c27174OooO0O0;
                    }
                    try {
                        c29627OooOOOO.f105041OooOo0o = c29629OooOOo02;
                        c29627OooOOOO.f105040OooOo = interfaceC33895OooO00o3;
                        c29627OooOOOO.f105043OooOoO0 = null;
                        c29627OooOOOO.f105045OooOoo0 = 3;
                        objSendMessage = r32.sendMessage(r132, c29627OooOOOO);
                    } catch (Exception e3) {
                        InterfaceC33895OooO00o interfaceC33895OooO00o5 = interfaceC33895OooO00o3;
                        e = e3;
                        str = interfaceC33895OooO00o5;
                        c29629OooOOo03 = c29629OooOOo02;
                        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o22.OooOOO0("GeminiAssistant");
                        c20358OooO00o22.OooOO0O("generateTextFromPdfFile: failed to generate content. " + e, new Object[0]);
                        c29629OooOOo03.getClass();
                        C27174OooO0O0 c27174OooO0O0OooOO0O2 = OooOO0O(e);
                        r14 = str;
                        c27174OooO0O0 = c27174OooO0O0OooOO0O2;
                    }
                    if (objSendMessage != enumC32485OooO00o) {
                        InterfaceC33895OooO00o interfaceC33895OooO00o6 = interfaceC33895OooO00o3;
                        obj = objSendMessage;
                        str = interfaceC33895OooO00o6;
                        c29629OooOOo03 = c29629OooOOo02;
                        C27174OooO0O0 c27174OooO0O022 = new C27174OooO0O0("0", null, ((GenerateContentResponse) obj).getText(), true);
                        r14 = str;
                        c27174OooO0O0 = c27174OooO0O022;
                        r14.OooOOO0(null);
                        return c27174OooO0O0;
                    }
                    return enumC32485OooO00o;
                }
                InterfaceC33895OooO00o interfaceC33895OooO00o7 = c29627OooOOOO.f105043OooOoO0;
                String str3 = (String) c29627OooOOOO.f105040OooOo;
                c29629OooOOo0 = c29627OooOOOO.f105041OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o7;
                r13 = str3;
                if (c29629OooOOo0.f105054OooO0Oo == null) {
                    c29627OooOOOO.f105041OooOo0o = c29629OooOOo0;
                    c29627OooOOOO.f105040OooOo = r13;
                    c29627OooOOOO.f105043OooOoO0 = interfaceC33895OooO00o;
                    c29627OooOOOO.f105045OooOoo0 = 2;
                    if (c29629OooOOo0.OooO(c29627OooOOOO) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    r3 = r13;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    c29629OooOOo02 = c29629OooOOo0;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o2;
                    r132 = r3;
                    r32 = c29629OooOOo02.f105054OooO0Oo;
                    if (r32 == 0) {
                    }
                } else {
                    c29629OooOOo02 = c29629OooOOo0;
                    r132 = r13;
                    interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                    r32 = c29629OooOOo02.f105054OooO0Oo;
                    if (r32 == 0) {
                    }
                }
            } catch (Throwable th) {
                InterfaceC33895OooO00o interfaceC33895OooO00o8 = interfaceC33895OooO00o;
                th = th;
                str = interfaceC33895OooO00o8;
                str.OooOOO0(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:24:0x0051, B:44:0x00bb, B:46:0x00bf, B:48:0x00cc, B:49:0x00d2, B:29:0x005e, B:40:0x0090), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:24:0x0051, B:44:0x00bb, B:46:0x00bf, B:48:0x00cc, B:49:0x00d2, B:29:0x005e, B:40:0x0090), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[Catch: all -> 0x003d, StorageException -> 0x0040, TryCatch #3 {all -> 0x003d, blocks: (B:15:0x0038, B:53:0x00ec, B:55:0x00f4, B:57:0x00fa, B:59:0x0100, B:63:0x010a, B:69:0x0135, B:68:0x011f), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100 A[Catch: all -> 0x003d, StorageException -> 0x0040, TryCatch #3 {all -> 0x003d, blocks: (B:15:0x0038, B:53:0x00ec, B:55:0x00f4, B:57:0x00fa, B:59:0x0100, B:63:0x010a, B:69:0x0135, B:68:0x011f), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29628OooOOOo c29628OooOOOo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        C29629OooOOo0 c29629OooOOo0;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        C29629OooOOo0 c29629OooOOo02;
        Object objOooO0OO;
        StorageReference storageReference;
        C29629OooOOo0 c29629OooOOo03;
        StorageMetadata storageMetadata;
        C29629OooOOo0 c29629OooOOo04;
        UploadTask.TaskSnapshot taskSnapshot;
        String contentType;
        ?? r1 = "uploadPdfFile: ";
        if (abstractC32479OooO0OO instanceof C29628OooOOOo) {
            c29628OooOOOo = (C29628OooOOOo) abstractC32479OooO0OO;
            int i = c29628OooOOOo.f105051OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29628OooOOOo.f105051OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29628OooOOOo = new C29628OooOOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c29628OooOOOo.f105048OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r4 = c29628OooOOOo.f105051OooOoo0;
        boolean z = false;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r1 = r4;
            }
            try {
                if (r4 == 0) {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    c29628OooOOOo.f105047OooOo0o = this;
                    interfaceC33895OooO00o = this.f105057OooO0oO;
                    c29628OooOOOo.f105046OooOo = interfaceC33895OooO00o;
                    c29628OooOOOo.f105051OooOoo0 = 1;
                    if (interfaceC33895OooO00o.OooO00o(c29628OooOOOo) != enumC32485OooO00o) {
                        c29629OooOOo0 = this;
                    }
                    return enumC32485OooO00o;
                }
                if (r4 == 1) {
                    InterfaceC33895OooO00o interfaceC33895OooO00o3 = c29628OooOOOo.f105046OooOo;
                    c29629OooOOo0 = c29628OooOOOo.f105047OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    interfaceC33895OooO00o = interfaceC33895OooO00o3;
                } else {
                    if (r4 != 2) {
                        if (r4 != 3) {
                            if (r4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r1 = c29628OooOOOo.f105046OooOo;
                            c29629OooOOo04 = c29628OooOOOo.f105047OooOo0o;
                            try {
                                C32446OooOOOo.OooO0O0(objOooO0o);
                                r1 = r1;
                                taskSnapshot = (UploadTask.TaskSnapshot) objOooO0o;
                                StorageMetadata metadata = taskSnapshot.getMetadata();
                                contentType = metadata == null ? metadata.getContentType() : null;
                                StorageMetadata metadata2 = taskSnapshot.getMetadata();
                                String bucket = metadata2 == null ? metadata2.getBucket() : null;
                                if (contentType != null && bucket != null) {
                                    StorageMetadata metadata3 = taskSnapshot.getMetadata();
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(metadata3);
                                    c29629OooOOo04.getClass();
                                    c29629OooOOo04.f105058OooO0oo = OooO0o(metadata3);
                                    r1 = r1;
                                    z = true;
                                }
                            } catch (StorageException e) {
                                e = e;
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("GeminiAssistant");
                                c20358OooO00o.OooOO0O("uploadPdfFile: failed to upload file. " + e, new Object[0]);
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            r1.OooOOO0(null);
                            return boolValueOf;
                        }
                        storageReference = c29628OooOOOo.f105049OooOoO0;
                        interfaceC33895OooO00o2 = c29628OooOOOo.f105046OooOo;
                        c29629OooOOo03 = c29628OooOOOo.f105047OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0o);
                        storageMetadata = (StorageMetadata) objOooO0o;
                        if (storageMetadata == null) {
                            c29629OooOOo03.getClass();
                            c29629OooOOo03.f105058OooO0oo = OooO0o(storageMetadata);
                            r1 = interfaceC33895OooO00o2;
                            z = true;
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            r1.OooOOO0(null);
                            return boolValueOf2;
                        }
                        try {
                            UploadTask uploadTaskPutFile = storageReference.putFile(Uri.fromFile(c29629OooOOo03.f104992OooO00o));
                            kotlin.jvm.internal.OooOOO0.OooO0o(uploadTaskPutFile, "putFile(...)");
                            c29628OooOOOo.f105047OooOo0o = c29629OooOOo03;
                            c29628OooOOOo.f105046OooOo = interfaceC33895OooO00o2;
                            c29628OooOOOo.f105049OooOoO0 = null;
                            c29628OooOOOo.f105051OooOoo0 = 4;
                            objOooO0o = C20741OooOOoo.OooO0o(uploadTaskPutFile, c29628OooOOOo);
                        } catch (StorageException e2) {
                            e = e2;
                            r1 = interfaceC33895OooO00o2;
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GeminiAssistant");
                            c20358OooO00o2.OooOO0O("uploadPdfFile: failed to upload file. " + e, new Object[0]);
                        }
                        if (objOooO0o != enumC32485OooO00o) {
                            r1 = interfaceC33895OooO00o2;
                            c29629OooOOo04 = c29629OooOOo03;
                            taskSnapshot = (UploadTask.TaskSnapshot) objOooO0o;
                            StorageMetadata metadata4 = taskSnapshot.getMetadata();
                            if (metadata4 == null) {
                            }
                            StorageMetadata metadata22 = taskSnapshot.getMetadata();
                            if (metadata22 == null) {
                            }
                            if (contentType != null) {
                                StorageMetadata metadata32 = taskSnapshot.getMetadata();
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(metadata32);
                                c29629OooOOo04.getClass();
                                c29629OooOOo04.f105058OooO0oo = OooO0o(metadata32);
                                r1 = r1;
                                z = true;
                            }
                            Boolean boolValueOf22 = Boolean.valueOf(z);
                            r1.OooOOO0(null);
                            return boolValueOf22;
                        }
                        return enumC32485OooO00o;
                    }
                    interfaceC33895OooO00o2 = c29628OooOOOo.f105046OooOo;
                    c29629OooOOo02 = c29628OooOOOo.f105047OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    StorageReference storageReference2 = (StorageReference) objOooO0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("GeminiAssistant");
                    c20358OooO00o3.OooO00o("uploadPdfFile: " + storageReference2, new Object[0]);
                    c29628OooOOOo.f105047OooOo0o = c29629OooOOo02;
                    c29628OooOOOo.f105046OooOo = interfaceC33895OooO00o2;
                    c29628OooOOOo.f105049OooOoO0 = storageReference2;
                    c29628OooOOOo.f105051OooOoo0 = 3;
                    objOooO0OO = c29629OooOOo02.OooO0OO(storageReference2, c29628OooOOOo);
                    if (objOooO0OO != enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    storageReference = storageReference2;
                    objOooO0o = objOooO0OO;
                    c29629OooOOo03 = c29629OooOOo02;
                    storageMetadata = (StorageMetadata) objOooO0o;
                    if (storageMetadata == null) {
                    }
                }
                c29628OooOOOo.f105047OooOo0o = c29629OooOOo0;
                c29628OooOOOo.f105046OooOo = interfaceC33895OooO00o;
                c29628OooOOOo.f105051OooOoo0 = 2;
                StorageReference storageReferenceOooO0o0 = c29629OooOOo0.OooO0o0();
                if (storageReferenceOooO0o0 != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    objOooO0o = storageReferenceOooO0o0;
                    c29629OooOOo02 = c29629OooOOo0;
                    StorageReference storageReference22 = (StorageReference) objOooO0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("GeminiAssistant");
                    c20358OooO00o32.OooO00o("uploadPdfFile: " + storageReference22, new Object[0]);
                    c29628OooOOOo.f105047OooOo0o = c29629OooOOo02;
                    c29628OooOOOo.f105046OooOo = interfaceC33895OooO00o2;
                    c29628OooOOOo.f105049OooOoO0 = storageReference22;
                    c29628OooOOOo.f105051OooOoo0 = 3;
                    objOooO0OO = c29629OooOOo02.OooO0OO(storageReference22, c29628OooOOOo);
                    if (objOooO0OO != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th2) {
                r1 = interfaceC33895OooO00o;
                th = th2;
                r1.OooOOO0(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
