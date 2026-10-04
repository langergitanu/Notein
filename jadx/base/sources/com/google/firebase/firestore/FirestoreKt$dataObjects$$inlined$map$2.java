package com.google.firebase.firestore;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LoO0o0Oo/OooO0o;", "LoO0o0Oo/OooO0oO;", "collector", "LoO00ooO/OooOooO;", "collect", "(LoO0o0Oo/OooO0oO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 176)
public final class FirestoreKt$dataObjects$$inlined$map$2<T> implements InterfaceC33721OooO0o<T> {
    final /* synthetic */ InterfaceC33721OooO0o $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2 */
    @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 176)
    public static final class C170422<T> implements InterfaceC33723OooO0oO {
        final /* synthetic */ InterfaceC33723OooO0oO $this_unsafeFlow;

        /* JADX INFO: renamed from: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2$1, reason: invalid class name */
        @Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 176)
        @InterfaceC32482OooO0o0(m80622c = "com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2$2", m80623f = "Firestore.kt", m80624l = {50}, m80625m = "emit")
        public static final class AnonymousClass1 extends AbstractC32479OooO0OO {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C170422.this.emit(null, this);
            }
        }

        public C170422(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.$this_unsafeFlow = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            }
            Object obj2 = anonymousClass1.result;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = anonymousClass1.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj2);
            kotlin.jvm.internal.OooOOO0.OooOOO();
            throw null;
        }

        public final Object emit$$forInline(Object obj, Continuation continuation) {
            new AnonymousClass1(continuation);
            kotlin.jvm.internal.OooOOO0.OooOOO();
            throw null;
        }
    }

    public FirestoreKt$dataObjects$$inlined$map$2(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.$this_unsafeTransform$inlined = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }

    public Object collect$$forInline(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        new AbstractC32479OooO0OO(continuation) { // from class: com.google.firebase.firestore.FirestoreKt$dataObjects$$inlined$map$2.1
            int label;
            /* synthetic */ Object result;

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FirestoreKt$dataObjects$$inlined$map$2.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.OooOOO0.OooOOO();
        throw null;
    }
}
