package com.orion.penkit.models;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002 \b\u0004\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m80612d2 = {"Lcom/orion/penkit/models/DelegateAdapter;", "", "<init>", "()V", "T", "initialValue", "Lkotlin/Function1;", "LoO00ooO/OooOOO;", "LoO00ooO/OooOooO;", "onChange", "LoO0O00o0/OooO0OO;", "observable", "(Ljava/lang/Object;LoO0O000o/OooOO0o;)LoO0O00o0/OooO0OO;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DelegateAdapter {
    public static final DelegateAdapter INSTANCE = new DelegateAdapter();

    private DelegateAdapter() {
    }

    public final <T> oO0O00o0.OooO0OO<Object, T> observable(T initialValue, final InterfaceC32507OooOO0o<? super C32443OooOOO<? extends T, ? extends T>, C32460OooOooO> onChange) {
        OooOOO0.OooO0oO(onChange, "onChange");
        return new oO0O00o0.OooO00o<T>(initialValue) { // from class: com.orion.penkit.models.DelegateAdapter.observable.1
            @Override // oO0O00o0.OooO00o
            public void afterChange(InterfaceC34602OooOO0o<?> property, T oldValue, T newValue) {
                OooOOO0.OooO0oO(property, "property");
                onChange.invoke(new C32443OooOOO<>(oldValue, newValue));
            }
        };
    }
}
