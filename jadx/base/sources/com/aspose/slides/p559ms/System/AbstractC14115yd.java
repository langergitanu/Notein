package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.MulticastNotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.yd */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14115yd {

    /* JADX INFO: renamed from: a */
    private Object f47377a;

    /* JADX INFO: renamed from: b */
    private RuntimeException f47378b;

    /* JADX INFO: renamed from: c */
    private Object[] f47379c;

    public static AbstractC14115yd combine(AbstractC14115yd abstractC14115yd, AbstractC14115yd abstractC14115yd2) {
        if (abstractC14115yd == null) {
            if (abstractC14115yd2 == null) {
                return null;
            }
            return abstractC14115yd2;
        }
        if (abstractC14115yd2 == null) {
            return abstractC14115yd;
        }
        if (C14067j2.m66727k4(abstractC14115yd) == C14067j2.m66727k4(abstractC14115yd2)) {
            return abstractC14115yd.combineImpl(abstractC14115yd2);
        }
        throw new ArgumentException(C14113y2.m67402k4("Incompatible Delegate Types. First is {0} second is {1}.", C14067j2.m66727k4(abstractC14115yd).mo48629x6(), C14067j2.m66727k4(abstractC14115yd2).mo48629x6()));
    }

    public static boolean op_Equality(AbstractC14115yd abstractC14115yd, AbstractC14115yd abstractC14115yd2) {
        if (abstractC14115yd == null) {
            return abstractC14115yd2 == null;
        }
        if (abstractC14115yd2 == null) {
            return false;
        }
        return abstractC14115yd.equals(abstractC14115yd2);
    }

    public static boolean op_Inequality(AbstractC14115yd abstractC14115yd, AbstractC14115yd abstractC14115yd2) {
        return !op_Equality(abstractC14115yd, abstractC14115yd2);
    }

    public static AbstractC14115yd remove(AbstractC14115yd abstractC14115yd, AbstractC14115yd abstractC14115yd2) {
        if (abstractC14115yd == null) {
            return null;
        }
        if (abstractC14115yd2 == null) {
            return abstractC14115yd;
        }
        if (C14067j2.m66727k4(abstractC14115yd) == C14067j2.m66727k4(abstractC14115yd2)) {
            return abstractC14115yd.removeImpl(abstractC14115yd2);
        }
        throw new ArgumentException(C14113y2.m67402k4("Incompatible Delegate Types. First is {0} second is {1}.", C14067j2.m66727k4(abstractC14115yd).mo48629x6(), C14067j2.m66727k4(abstractC14115yd2).mo48629x6()));
    }

    public static AbstractC14115yd removeAll(AbstractC14115yd abstractC14115yd, AbstractC14115yd abstractC14115yd2) {
        while (true) {
            AbstractC14115yd abstractC14115ydRemove = remove(abstractC14115yd, abstractC14115yd2);
            if (!op_Inequality(abstractC14115ydRemove, abstractC14115yd)) {
                return abstractC14115yd;
            }
            abstractC14115yd = abstractC14115ydRemove;
        }
    }

    public AbstractC14115yd combineImpl(AbstractC14115yd abstractC14115yd) {
        throw new MulticastNotSupportedException(C14113y2.f47374k4);
    }

    public AbstractC14115yd[] getInvocationList() {
        return new AbstractC14115yd[]{this};
    }

    public Object peekOutRefParam(int i) {
        return this.f47379c[i];
    }

    public Object peekResult() {
        return this.f47377a;
    }

    public void pushOutRefParams(Object... objArr) {
        this.f47379c = objArr;
    }

    public void pushResult(Object obj) {
        this.f47377a = obj;
    }

    public AbstractC14115yd removeImpl(AbstractC14115yd abstractC14115yd) {
        if (equals(abstractC14115yd)) {
            return null;
        }
        return this;
    }

    public void setException(RuntimeException runtimeException) {
        this.f47378b = runtimeException;
    }

    public void throwException() {
        RuntimeException runtimeException = this.f47378b;
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public static AbstractC14115yd combine(AbstractC14115yd... abstractC14115ydArr) {
        AbstractC14115yd abstractC14115ydCombine = null;
        if (abstractC14115ydArr == null) {
            return null;
        }
        for (AbstractC14115yd abstractC14115yd : abstractC14115ydArr) {
            abstractC14115ydCombine = combine(abstractC14115ydCombine, abstractC14115yd);
        }
        return abstractC14115ydCombine;
    }
}
