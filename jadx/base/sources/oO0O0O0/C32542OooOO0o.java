package oO0O0O0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: oO0O0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32542OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Type> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32538OooO0oO<Object> f116932OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32542OooOO0o(AbstractC32538OooO0oO<Object> abstractC32538OooO0oO) {
        super(0);
        this.f116932OooOo0o = abstractC32538OooO0oO;
    }

    @Override // oO0O000o.OooO00o
    public final Type invoke() {
        Type[] lowerBounds;
        AbstractC32538OooO0oO<Object> abstractC32538OooO0oO = this.f116932OooOo0o;
        Type type = null;
        if (abstractC32538OooO0oO.isSuspend()) {
            Object objOoooOo0 = oOo000Oo.OooOo.OoooOo0(abstractC32538OooO0oO.OooOO0O().OooO00o());
            ParameterizedType parameterizedType = objOoooOo0 instanceof ParameterizedType ? (ParameterizedType) objOoooOo0 : null;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                kotlin.jvm.internal.OooOOO0.OooO0o(actualTypeArguments, "continuationType.actualTypeArguments");
                Object objOooo0o0 = oOo000Oo.OooOOO.Oooo0o0(actualTypeArguments);
                WildcardType wildcardType = objOooo0o0 instanceof WildcardType ? (WildcardType) objOooo0o0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (Type) oOo000Oo.OooOOO.OooOoo0(lowerBounds);
                }
            }
        }
        return type == null ? abstractC32538OooO0oO.OooOO0O().getReturnType() : type;
    }
}
