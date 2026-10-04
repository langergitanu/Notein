package kotlin.coroutines;

import kotlin.Metadata;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m80612d2 = {"Lkotlin/coroutines/Continuation;", "T", "", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface Continuation<T> {
    InterfaceC34415OooO0oo getContext();

    void resumeWith(Object obj);
}
