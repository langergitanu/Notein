package com.google.mlkit.p567nl.translate;

import android.content.Context;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.android.gms.internal.mlkit_translate.zzvy;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p567nl.translate.internal.TranslatorImpl;
import com.google.mlkit.p567nl.translate.internal.zzad;
import com.google.mlkit.p567nl.translate.internal.zzae;
import com.google.mlkit.p567nl.translate.internal.zzam;
import com.google.mlkit.p567nl.translate.internal.zzg;
import com.google.mlkit.p567nl.translate.internal.zzi;
import com.google.mlkit.p567nl.translate.internal.zzp;
import com.google.mlkit.p567nl.translate.internal.zzq;
import com.google.mlkit.p567nl.translate.internal.zzy;
import com.google.mlkit.p567nl.translate.internal.zzz;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class NaturalLanguageTranslateRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return zzt.zzm(Component.builder(zzam.class).add(Dependency.required((Class<?>) zzz.class)).add(Dependency.required((Class<?>) zzp.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zza
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzam((zzz) componentContainer.get(zzz.class), (zzp) componentContainer.get(zzp.class));
            }
        }).build(), Component.intoSetBuilder(RemoteModelManager.RemoteModelManagerRegistration.class).add(Dependency.requiredProvider((Class<?>) zzam.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzb
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new RemoteModelManager.RemoteModelManagerRegistration(TranslateRemoteModel.class, componentContainer.getProvider(zzam.class));
            }
        }).build(), Component.builder(zzp.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) ModelFileHelper.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzc
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                zzp zzpVar = new zzp((Context) componentContainer.get(Context.class), (ModelFileHelper) componentContainer.get(ModelFileHelper.class));
                zzpVar.start();
                return zzpVar;
            }
        }).alwaysEager().build(), Component.builder(zzi.class).add(Dependency.required((Class<?>) zzae.class)).add(Dependency.required((Class<?>) ModelFileHelper.class)).add(Dependency.required((Class<?>) zzq.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzd
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzi((zzae) componentContainer.get(zzae.class), (ModelFileHelper) componentContainer.get(ModelFileHelper.class), (zzq) componentContainer.get(zzq.class));
            }
        }).build(), Component.builder(TranslatorImpl.Factory.class).add(Dependency.requiredProvider((Class<?>) zzz.class)).add(Dependency.required((Class<?>) zzi.class)).add(Dependency.required((Class<?>) zzq.class)).add(Dependency.required((Class<?>) zzae.class)).add(Dependency.required((Class<?>) ExecutorSelector.class)).add(Dependency.required((Class<?>) zzp.class)).add(Dependency.required((Class<?>) CloseGuard.Factory.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zze
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new TranslatorImpl.Factory(componentContainer.getProvider(zzz.class), (zzi) componentContainer.get(zzi.class), (zzq) componentContainer.get(zzq.class), (zzae) componentContainer.get(zzae.class), (ExecutorSelector) componentContainer.get(ExecutorSelector.class), (zzp) componentContainer.get(zzp.class), (CloseGuard.Factory) componentContainer.get(CloseGuard.Factory.class));
            }
        }).build(), Component.builder(zzq.class).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzf
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzq();
            }
        }).build(), Component.builder(zzae.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) zzq.class)).add(Dependency.required((Class<?>) ModelFileHelper.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzg
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzae(zzvy.zze((Context) componentContainer.get(Context.class)), new zzad(zzvy.zze((Context) componentContainer.get(Context.class))), (zzq) componentContainer.get(zzq.class), (ModelFileHelper) componentContainer.get(ModelFileHelper.class));
            }
        }).build(), Component.builder(zzy.class).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzh
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzy();
            }
        }).build(), Component.builder(zzg.class).add(Dependency.required((Class<?>) MlKitContext.class)).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) zzq.class)).add(Dependency.required((Class<?>) zzae.class)).add(Dependency.required((Class<?>) ModelFileHelper.class)).add(Dependency.required((Class<?>) SharedPrefManager.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzi
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzg((MlKitContext) componentContainer.get(MlKitContext.class), (Context) componentContainer.get(Context.class), (zzq) componentContainer.get(zzq.class), (zzae) componentContainer.get(zzae.class), (ModelFileHelper) componentContainer.get(ModelFileHelper.class), (SharedPrefManager) componentContainer.get(SharedPrefManager.class));
            }
        }).build(), Component.builder(zzz.class).add(Dependency.required((Class<?>) zzg.class)).add(Dependency.required((Class<?>) zzy.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.nl.translate.zzj
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new zzz((zzy) componentContainer.get(zzy.class), (zzg) componentContainer.get(zzg.class));
            }
        }).build());
    }
}
