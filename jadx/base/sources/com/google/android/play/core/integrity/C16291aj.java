package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractBinderC16402m;
import com.google.android.play.integrity.internal.C16365ae;
import com.google.android.play.integrity.internal.C16369ai;
import com.google.android.play.integrity.internal.C16393d;
import com.google.android.play.integrity.internal.C16408s;
import com.google.android.play.integrity.internal.InterfaceC16415z;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aj */
/* JADX INFO: loaded from: classes7.dex */
final class C16291aj {

    /* JADX INFO: renamed from: a */
    final C16365ae f51422a;

    /* JADX INFO: renamed from: b */
    private final C16408s f51423b;

    /* JADX INFO: renamed from: c */
    private final String f51424c;

    /* JADX INFO: renamed from: d */
    private final Context f51425d;

    /* JADX INFO: renamed from: e */
    private final C16301at f51426e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC16339k f51427f;

    public C16291aj(Context context, C16408s c16408s, C16301at c16301at, InterfaceC16339k interfaceC16339k) {
        this.f51424c = context.getPackageName();
        this.f51423b = c16408s;
        this.f51426e = c16301at;
        this.f51427f = interfaceC16339k;
        this.f51425d = context;
        if (C16369ai.m75018b(context)) {
            this.f51422a = new C16365ae(context, c16408s, "IntegrityService", C16292ak.f51428a, new InterfaceC16415z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.InterfaceC16415z
                /* JADX INFO: renamed from: a */
                public final Object mo74935a(IBinder iBinder) {
                    return AbstractBinderC16402m.m75056b(iBinder);
                }
            }, null);
        } else {
            c16408s.m75059b("Phonesky is not installed.", new Object[0]);
            this.f51422a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m74940a(C16291aj c16291aj, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c16291aj.f51424c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        C16393d.m75046b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C16393d.m75045a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Task m74945b(Activity activity, Bundle bundle) {
        if (this.f51422a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.f51423b.m75061d("requestAndShowDialog(%s, %s)", this.f51424c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51422a.m75012t(new C16288ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: c */
    public final Task m74946c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f51422a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (C16369ai.m75017a(this.f51425d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof C16296ao) {
            }
            this.f51423b.m75061d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f51422a.m75012t(new C16287af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
