package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.AbstractBinderC16397h;
import com.google.android.play.integrity.internal.C16365ae;
import com.google.android.play.integrity.internal.C16393d;
import com.google.android.play.integrity.internal.C16408s;
import com.google.android.play.integrity.internal.InterfaceC16415z;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bn */
/* JADX INFO: loaded from: classes7.dex */
final class C16322bn {

    /* JADX INFO: renamed from: a */
    final C16365ae f51484a;

    /* JADX INFO: renamed from: b */
    private final C16408s f51485b;

    /* JADX INFO: renamed from: c */
    private final String f51486c;

    /* JADX INFO: renamed from: d */
    private final TaskCompletionSource f51487d;

    /* JADX INFO: renamed from: e */
    private final C16301at f51488e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC16339k f51489f;

    public C16322bn(Context context, C16408s c16408s, C16301at c16301at, InterfaceC16339k interfaceC16339k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51487d = taskCompletionSource;
        this.f51486c = context.getPackageName();
        this.f51485b = c16408s;
        this.f51488e = c16301at;
        this.f51489f = interfaceC16339k;
        C16365ae c16365ae = new C16365ae(context, c16408s, "ExpressIntegrityService", C16323bo.f51490a, new InterfaceC16415z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.InterfaceC16415z
            /* JADX INFO: renamed from: a */
            public final Object mo74935a(IBinder iBinder) {
                return AbstractBinderC16397h.m75053b(iBinder);
            }
        }, null);
        this.f51484a = c16365ae;
        c16365ae.m75010c().post(new C16313be(this, taskCompletionSource, context));
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m74964a(C16322bn c16322bn, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c16322bn.f51486c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        C16393d.m75046b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C16393d.m75045a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m74965b(C16322bn c16322bn, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c16322bn.f51486c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        C16393d.m75046b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C16393d.m75045a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m74971k(C16322bn c16322bn, int i) {
        return c16322bn.f51487d.getTask().isSuccessful() && ((Integer) c16322bn.f51487d.getTask().getResult()).intValue() < 83420000;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m74972l(C16322bn c16322bn) {
        return c16322bn.f51487d.getTask().isSuccessful() && ((Integer) c16322bn.f51487d.getTask().getResult()).intValue() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final Task m74973c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.f51485b.m75061d("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51484a.m75012t(new C16316bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: d */
    public final Task m74974d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.f51485b.m75061d("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51484a.m75012t(new C16315bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: e */
    public final Task m74975e(long j, int i) {
        this.f51485b.m75061d("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51484a.m75012t(new C16314bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
