package o0Oo0oO0;

import Oooo0oO.C21111o0ooOoO;
import android.util.Patterns;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.p607ui.feedback.FeedbackWorker;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o00O0O0o.C24834OooO0Oo;
import o00O0O0o.EnumC24838OooOO0o;
import o00O0O0o.OooOOO0;
import o00O0OO0.C24847OooO0oO;
import o0oOoOo.C31029OooO;
import o0oOoOo.C31038OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0oO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackViewModel$submitFeedback$1", m80623f = "FeedbackViewModel.kt", m80624l = {133, 151}, m80625m = "invokeSuspend")
public final class C28300OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f100396OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100397OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28300OooOOOo(OooOOO oooOOO, Continuation<? super C28300OooOOOo> continuation) {
        super(2, continuation);
        this.f100396OooOo = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28300OooOOOo(this.f100396OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28300OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r6.emit(r14, r13) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b2, code lost:
    
        if (r6.emit(r14, r13) == r0) goto L40;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100397OooOo0o;
        if (i != 0) {
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooOOO oooOOO = this.f100396OooOo;
        C33781o00o0O c33781o00o0O = oooOOO.f100381OooOO0o;
        String string = C33599OooOo0O.Oooooo0((String) c33781o00o0O.getValue()).toString();
        boolean zMatches = Patterns.EMAIL_ADDRESS.matcher(string).matches();
        C33772OooooOo c33772OooooOo = oooOOO.f100373OooO;
        if (zMatches) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c33781o00o0O.getValue(), string)) {
                c33781o00o0O.setValue(string);
            }
            EnumC24838OooOO0o enumC24838OooOO0o = EnumC24838OooOO0o.f84258OooOo0o;
            C24834OooO0Oo c24834OooO0Oo = new C24834OooO0Oo();
            EnumC24838OooOO0o enumC24838OooOO0o2 = EnumC24838OooOO0o.f84257OooOo;
            o00O0O0o.OooO0OO oooO0OO = new o00O0O0o.OooO0OO();
            oooO0OO.f84232OooO00o = enumC24838OooOO0o;
            oooO0OO.f84236OooO0o = -1L;
            oooO0OO.f84238OooO0oO = -1L;
            new C24834OooO0Oo();
            oooO0OO.f84233OooO0O0 = false;
            oooO0OO.f84234OooO0OO = false;
            oooO0OO.f84232OooO00o = enumC24838OooOO0o2;
            oooO0OO.f84235OooO0Oo = false;
            oooO0OO.f84237OooO0o0 = false;
            oooO0OO.f84239OooO0oo = c24834OooO0Oo;
            oooO0OO.f84236OooO0o = -1L;
            oooO0OO.f84238OooO0oO = -1L;
            OooOOO0.OooO00o oooO00o = new OooOOO0.OooO00o(FeedbackWorker.class);
            oooO00o.f84274OooO0O0.f84465OooOO0 = oooO0OO;
            HashMap map = new HashMap();
            C33781o00o0O c33781o00o0O2 = oooOOO.f100380OooOO0O;
            map.put("key_feedback_content", (String) c33781o00o0O2.getValue());
            Iterator it = ((Iterable) oooOOO.f100376OooO0o0.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C31038OooOO0) next).f110815OooO0O0) {
                    break;
                }
            }
            C31038OooOO0 c31038OooOO0 = (C31038OooOO0) next;
            map.put("key_feedback_type", Integer.valueOf(c31038OooOO0 != null ? c31038OooOO0.f110814OooO00o : 4));
            Iterable iterable = (Iterable) oooOOO.f100377OooO0oO.getValue();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C31029OooO) it2.next()).f110772OooO0O0.toString());
            }
            map.put("key_image_uri_list", (String[]) arrayList.toArray(new String[0]));
            map.put("key_feedback_email", (String) c33781o00o0O.getValue());
            androidx.work.OooO0O0 oooO0O0 = new androidx.work.OooO0O0(map);
            androidx.work.OooO0O0.OooO0OO(oooO0O0);
            oooO00o.f84274OooO0O0.f84462OooO0o0 = oooO0O0;
            o00O0O0o.OooOOO0 oooOOO0OooO00o = oooO00o.OooO00o();
            byte[] bytes = ((String) c33781o00o0O2.getValue()).getBytes(C33580OooO00o.f121231OooO0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
            byte[] bArrDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(bytes);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrDigest);
            String strOooO0Oo = "";
            for (byte b : bArrDigest) {
                strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FeedbackViewModel");
            c20358OooO00o.OooO0o0("submitFeedback content: " + c33781o00o0O2.getValue() + ", uniqueWorkName: " + strOooO0Oo, new Object[0]);
            o00O0O0o.OooO0o oooO0o = o00O0O0o.OooO0o.f84243OooOo;
            o00O0OO0.OooOO0O oooOO0O = oooOOO.f100374OooO0Oo;
            oooOO0O.getClass();
            new C24847OooO0oO(oooOO0O, strOooO0Oo, oooO0o, Collections.singletonList(oooOOO0OooO00o)).Oooo();
            Integer num = new Integer(0);
            this.f100397OooOo0o = 2;
        } else {
            Integer num2 = new Integer(1);
            this.f100397OooOo0o = 1;
        }
        return enumC32485OooO00o;
    }
}
