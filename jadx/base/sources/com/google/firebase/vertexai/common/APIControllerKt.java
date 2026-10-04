package com.google.firebase.vertexai.common;

import com.aspose.slides.C22218Oooo;
import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.vertexai.type.Candidate;
import com.google.firebase.vertexai.type.FinishReason;
import com.google.firebase.vertexai.type.GRpcErrorResponse;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.PromptFeedback;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32194OooOo0o;
import oO00O0o0.OooOo00;
import oO00Oo00.OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33204OooO0oO;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m80612d2 = {"LoO0Oo0Oo/OooO0OO;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "LoO00ooO/OooOooO;", "validateResponse", "(LoO0Oo0Oo/OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;", "error", "Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "getServiceDisabledErrorDetailsOrNull", "(Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError;)Lcom/google/firebase/vertexai/type/GRpcErrorResponse$GRpcError$GRpcErrorDetails;", "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "validate", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;)Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "LoOo00O0O/OooO0OO;", "JSON", "LoOo00O0O/OooO0OO;", "getJSON", "()LoOo00O0O/OooO0OO;", "getJSON$annotations", "()V", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class APIControllerKt {
    private static final AbstractC34457OooO0OO JSON = C34467OooOo0.OooO00o(APIControllerKt$JSON$1.INSTANCE);

    /* JADX INFO: renamed from: com.google.firebase.vertexai.common.APIControllerKt$validateResponse$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.vertexai.common.APIControllerKt", m80623f = "APIController.kt", m80624l = {StyleIdentifier.SUBTLE_EMPHASIS, StyleIdentifier.INTENSE_REFERENCE}, m80625m = "validateResponse")
    public static final class C172481 extends AbstractC32479OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C172481(Continuation<? super C172481> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return APIControllerKt.validateResponse(null, this);
        }
    }

    public static final AbstractC34457OooO0OO getJSON() {
        return JSON;
    }

    public static /* synthetic */ void getJSON$annotations() {
    }

    private static final GRpcErrorResponse.GRpcError.GRpcErrorDetails getServiceDisabledErrorDetailsOrNull(GRpcErrorResponse.GRpcError gRpcError) {
        List<GRpcErrorResponse.GRpcError.GRpcErrorDetails> details = gRpcError.getDetails();
        Object obj = null;
        if (details == null) {
            return null;
        }
        Iterator<T> it = details.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            GRpcErrorResponse.GRpcError.GRpcErrorDetails gRpcErrorDetails = (GRpcErrorResponse.GRpcError.GRpcErrorDetails) next;
            if (OooOOO0.OooO0O0(gRpcErrorDetails.getReason(), "SERVICE_DISABLED") && OooOOO0.OooO0O0(gRpcErrorDetails.getDomain(), "googleapis.com")) {
                obj = next;
                break;
            }
        }
        return (GRpcErrorResponse.GRpcError.GRpcErrorDetails) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final GenerateContentResponse.Internal validate(GenerateContentResponse.Internal internal) {
        Object next;
        List<Candidate.Internal> candidates = internal.getCandidates();
        int i = 2;
        Throwable th = null;
        Object[] objArr = 0;
        if ((candidates == null || candidates.isEmpty()) && internal.getPromptFeedback() == null) {
            throw new SerializationException("Error deserializing response, found no valid fields", null, 2, null);
        }
        PromptFeedback.Internal promptFeedback = internal.getPromptFeedback();
        if (promptFeedback != null && promptFeedback.getBlockReason() != null) {
            throw new PromptBlockedException(internal, null, null, 6, null);
        }
        List<Candidate.Internal> candidates2 = internal.getCandidates();
        if (candidates2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = candidates2.iterator();
            while (it.hasNext()) {
                FinishReason.Internal finishReason = ((Candidate.Internal) it.next()).getFinishReason();
                if (finishReason != null) {
                    arrayList.add(finishReason);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((FinishReason.Internal) next) != FinishReason.Internal.STOP) {
                    break;
                }
            }
            if (((FinishReason.Internal) next) != null) {
                throw new ResponseStoppedException(internal, th, i, objArr == true ? 1 : 0);
            }
        }
        return internal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object validateResponse(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        C172481 c172481;
        StringBuilder sb;
        String message;
        if (continuation instanceof C172481) {
            c172481 = (C172481) continuation;
            int i = c172481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172481.label = i - Integer.MIN_VALUE;
            } else {
                c172481 = new C172481(continuation);
            }
        }
        Object objOooO0O0 = c172481.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c172481.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            if (OooOOO0.OooO0O0(abstractC33200OooO0OO.OooO0o(), C32194OooOo0o.f115553OooOoOO)) {
                return C32460OooOooO.f116667OooO00o;
            }
            C32183OooO0Oo c32183OooO0Oo = C32183OooO0Oo.OooO0OO.f115526OooO0O0;
            Charset charsetForName = Charset.forName("utf-8");
            OooOOO0.OooO0o(charsetForName, "forName(\"utf-8\")");
            OooOOO0.OooO0oO(c32183OooO0Oo, "<this>");
            C32183OooO0Oo c32183OooO0OoOooO0o = c32183OooO0Oo.OooO0o(OooO00o.OooO0Oo(charsetForName));
            if (OooOOO0.OooO0O0(abstractC33200OooO0OO.OooO0o(), C32194OooOo0o.f115562Oooo0O0) && OooOOO0.OooO0O0(OooOo00.OooO00o(abstractC33200OooO0OO), c32183OooO0OoOooO0o)) {
                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("URL not found. Please verify the location used to create the `FirebaseVertexAI` object\n          | See https://cloud.google.com/vertex-ai/generative-ai/docs/learn/locations#available-regions\n          | for the list of available locations. Raw response: ");
                c172481.L$0 = sbOooO0OO;
                c172481.label = 1;
                Object objOooO0O02 = C33204OooO0oO.OooO0O0(abstractC33200OooO0OO, C33580OooO00o.f121231OooO0O0, c172481);
                if (objOooO0O02 != enumC32485OooO00o) {
                    objOooO0O0 = objOooO0O02;
                    sb = sbOooO0OO;
                    sb.append((String) objOooO0O0);
                    throw new ServerException(C33591OooOOO.OooO(sb.toString()), null, 2, null);
                }
            } else {
                c172481.label = 2;
                objOooO0O0 = C33204OooO0oO.OooO0O0(abstractC33200OooO0OO, C33580OooO00o.f121231OooO0O0, c172481);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            sb = (StringBuilder) c172481.L$0;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            sb.append((String) objOooO0O0);
            throw new ServerException(C33591OooOOO.OooO(sb.toString()), null, 2, null);
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(objOooO0O0);
        String str = (String) objOooO0O0;
        try {
            AbstractC34457OooO0OO abstractC34457OooO0OO = JSON;
            abstractC34457OooO0OO.getClass();
            GRpcErrorResponse.GRpcError error = ((GRpcErrorResponse) abstractC34457OooO0OO.OooO0O0(str, GRpcErrorResponse.INSTANCE.serializer())).getError();
            String message2 = error.getMessage();
            if (C33599OooOo0O.OooOoOO(message2, "API key not valid", false)) {
                throw new InvalidAPIKeyException(message2, null, 2, null);
            }
            if (message2.equals("User location is not supported for the API use.")) {
                throw new UnsupportedUserLocationException(null, 1, null);
            }
            if (C33599OooOo0O.OooOoOO(message2, "quota", false)) {
                throw new QuotaExceededException(message2, null, 2, null);
            }
            if (C33599OooOo0O.OooOoOO(message2, "The prompt could not be submitted", false)) {
                throw new PromptBlockedException(message2, null, 2, null);
            }
            GRpcErrorResponse.GRpcError.GRpcErrorDetails serviceDisabledErrorDetailsOrNull = getServiceDisabledErrorDetailsOrNull(error);
            if (serviceDisabledErrorDetailsOrNull == null) {
                throw new ServerException(message2, null, 2, null);
            }
            Map<String, String> metadata = serviceDisabledErrorDetailsOrNull.getMetadata();
            if (OooOOO0.OooO0O0(metadata != null ? metadata.get("service") : null, "firebasevertexai.googleapis.com")) {
                message = C33591OooOOO.OooO0oo("\n        The Vertex AI in Firebase SDK requires the Vertex AI in Firebase API\n        (`firebasevertexai.googleapis.com`) to be enabled in your Firebase project. Enable this API\n        by visiting the Firebase Console at\n        https://console.firebase.google.com/project/" + FirebaseKt.getOptions(Firebase.INSTANCE).getProjectId() + "/genai\n        and clicking \"Get started\". If you enabled this API recently, wait a few minutes for the\n        action to propagate to our systems and then retry.\n      ");
            } else {
                message = error.getMessage();
            }
            throw new ServiceDisabledException(message, null, 2, null);
        } catch (Throwable th) {
            throw new ServerException("Unexpected Response:\n" + str + ControlChar.SPACE_CHAR + th, null, 2, null);
        }
    }
}
