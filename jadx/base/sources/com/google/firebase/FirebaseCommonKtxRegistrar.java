package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28037OooO0OO;
import oO0o0OO.AbstractC33630OooOooO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component componentBuild = Component.builder(Qualified.qualified(Background.class, AbstractC33630OooOooO.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC33630OooOooO create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                OooOOO0.OooO0o(obj, "get(...)");
                return C28037OooO0OO.OooO0O0((Executor) obj);
            }
        }).build();
        OooOOO0.OooO0o(componentBuild, "build(...)");
        Component componentBuild2 = Component.builder(Qualified.qualified(Lightweight.class, AbstractC33630OooOooO.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC33630OooOooO create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                OooOOO0.OooO0o(obj, "get(...)");
                return C28037OooO0OO.OooO0O0((Executor) obj);
            }
        }).build();
        OooOOO0.OooO0o(componentBuild2, "build(...)");
        Component componentBuild3 = Component.builder(Qualified.qualified(Blocking.class, AbstractC33630OooOooO.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC33630OooOooO create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                OooOOO0.OooO0o(obj, "get(...)");
                return C28037OooO0OO.OooO0O0((Executor) obj);
            }
        }).build();
        OooOOO0.OooO0o(componentBuild3, "build(...)");
        Component componentBuild4 = Component.builder(Qualified.qualified(UiThread.class, AbstractC33630OooOooO.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC33630OooOooO create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                OooOOO0.OooO0o(obj, "get(...)");
                return C28037OooO0OO.OooO0O0((Executor) obj);
            }
        }).build();
        OooOOO0.OooO0o(componentBuild4, "build(...)");
        return C34429OooOOo0.OooOO0o(componentBuild, componentBuild2, componentBuild3, componentBuild4);
    }
}
