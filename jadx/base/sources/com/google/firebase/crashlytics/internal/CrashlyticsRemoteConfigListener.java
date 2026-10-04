package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "userMetadata", "<init>", "(Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;)V", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsState;", "rolloutsState", "LoO00ooO/OooOooO;", "onRolloutsStateChanged", "(Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsState;)V", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "com.google.firebase-firebase-crashlytics"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        OooOOO0.OooO0oO(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void onRolloutsStateChanged(RolloutsState rolloutsState) {
        OooOOO0.OooO0oO(rolloutsState, "rolloutsState");
        UserMetadata userMetadata = this.userMetadata;
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        OooOOO0.OooO0o(rolloutAssignments, "getRolloutAssignments(...)");
        Set<RolloutAssignment> set = rolloutAssignments;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
        for (RolloutAssignment rolloutAssignment : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata.updateRolloutsState(arrayList);
        Logger.getLogger().m75275d("Updated Crashlytics Rollout State");
    }
}
