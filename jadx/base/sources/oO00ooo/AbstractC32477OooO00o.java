package oO00ooo;

import com.google.firebase.messaging.Constants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.C32481OooO0o;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO00ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m80612d2 = {"LoO00ooo/OooO00o;", "Lkotlin/coroutines/Continuation;", "", "LoO00ooo/OooO0Oo;", "Ljava/io/Serializable;", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "LoO00ooO/OooOOOO;", "result", "LoO00ooO/OooOooO;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/Continuation;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "getCallerFrame", "()LoO00ooo/OooO0Oo;", "callerFrame", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractC32477OooO00o implements Continuation<Object>, InterfaceC32480OooO0Oo, Serializable {
    private final Continuation<Object> completion;

    public AbstractC32477OooO00o(Continuation<Object> continuation) {
        this.completion = continuation;
    }

    public Continuation<C32460OooOooO> create(Continuation<?> completion) {
        OooOOO0.OooO0oO(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM80622c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC32482OooO0o0 interfaceC32482OooO0o0 = (InterfaceC32482OooO0o0) getClass().getAnnotation(InterfaceC32482OooO0o0.class);
        String str = null;
        if (interfaceC32482OooO0o0 == null) {
            return null;
        }
        int iM80626v = interfaceC32482OooO0o0.m80626v();
        if (iM80626v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM80626v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC32482OooO0o0.m80624l()[iIntValue] : -1;
        C32481OooO0o.OooO00o oooO00o = C32481OooO0o.f116721OooO0O0;
        C32481OooO0o.OooO00o oooO00o2 = C32481OooO0o.f116720OooO00o;
        if (oooO00o == null) {
            try {
                C32481OooO0o.OooO00o oooO00o3 = new C32481OooO0o.OooO00o(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                C32481OooO0o.f116721OooO0O0 = oooO00o3;
                oooO00o = oooO00o3;
            } catch (Exception unused2) {
                C32481OooO0o.f116721OooO0O0 = oooO00o2;
                oooO00o = oooO00o2;
            }
        }
        if (oooO00o != oooO00o2 && (method = oooO00o.f116722OooO00o) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = oooO00o.f116723OooO0O0) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = oooO00o.f116724OooO0OO;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM80622c = interfaceC32482OooO0o0.m80622c();
        } else {
            strM80622c = str + IOUtils.DIR_SEPARATOR_UNIX + interfaceC32482OooO0o0.m80622c();
        }
        return new StackTraceElement(strM80622c, interfaceC32482OooO0o0.m80625m(), interfaceC32482OooO0o0.m80623f(), i);
    }

    public abstract Object invokeSuspend(Object result);

    public void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object result) {
        Continuation<Object> continuation = this;
        while (true) {
            AbstractC32477OooO00o abstractC32477OooO00o = (AbstractC32477OooO00o) continuation;
            Continuation<Object> continuation2 = abstractC32477OooO00o.completion;
            OooOOO0.OooO0Oo(continuation2);
            try {
                result = abstractC32477OooO00o.invokeSuspend(result);
                if (result == EnumC32485OooO00o.f116726OooOo0o) {
                    return;
                }
            } catch (Throwable th) {
                result = C32446OooOOOo.OooO00o(th);
            }
            abstractC32477OooO00o.releaseIntercepted();
            if (!(continuation2 instanceof AbstractC32477OooO00o)) {
                continuation2.resumeWith(result);
                return;
            }
            continuation = continuation2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public Continuation<C32460OooOooO> create(Object value, Continuation<?> completion) {
        OooOOO0.OooO0oO(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
