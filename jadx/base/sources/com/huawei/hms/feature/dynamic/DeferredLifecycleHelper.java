package com.huawei.hms.feature.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;

    /* JADX INFO: renamed from: e */
    public static final String f53496e = "DeferredLifecycleHelper";

    /* JADX INFO: renamed from: a */
    public T f53497a;

    /* JADX INFO: renamed from: b */
    public Bundle f53498b;

    /* JADX INFO: renamed from: c */
    public LinkedList<InterfaceC17898g> f53499c;

    /* JADX INFO: renamed from: d */
    public OnDelegateCreatedListener<T> f53500d = new C17892a();

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$a */
    public class C17892a implements OnDelegateCreatedListener<T> {
        public C17892a() {
        }

        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public void onDelegateCreated(T t) {
            DeferredLifecycleHelper.this.f53497a = t;
            Iterator it = DeferredLifecycleHelper.this.f53499c.iterator();
            while (it.hasNext()) {
                ((InterfaceC17898g) it.next()).mo76918a(DeferredLifecycleHelper.this.f53497a);
            }
            DeferredLifecycleHelper.this.f53499c.clear();
            DeferredLifecycleHelper.this.f53498b = null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$b */
    public class C17893b implements InterfaceC17898g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f53502a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bundle f53503b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bundle f53504c;

        public C17893b(Activity activity, Bundle bundle, Bundle bundle2) {
            this.f53502a = activity;
            this.f53503b = bundle;
            this.f53504c = bundle2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public int mo76917a() {
            return 0;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public void mo76918a(LifecycleDelegate lifecycleDelegate) {
            DeferredLifecycleHelper.this.f53497a.onInflate(this.f53502a, this.f53503b, this.f53504c);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$c */
    public class C17894c implements InterfaceC17898g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bundle f53506a;

        public C17894c(Bundle bundle) {
            this.f53506a = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public int mo76917a() {
            return 1;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public void mo76918a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f53496e, "IDelegateLifeCycleCall onCreate:");
            lifecycleDelegate.onCreate(this.f53506a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$d */
    public class C17895d implements InterfaceC17898g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f53508a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LayoutInflater f53509b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f53510c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Bundle f53511d;

        public C17895d(FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f53508a = frameLayout;
            this.f53509b = layoutInflater;
            this.f53510c = viewGroup;
            this.f53511d = bundle;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public int mo76917a() {
            return 2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public void mo76918a(LifecycleDelegate lifecycleDelegate) {
            this.f53508a.removeAllViews();
            this.f53508a.addView(DeferredLifecycleHelper.this.f53497a.onCreateView(this.f53509b, this.f53510c, this.f53511d));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$e */
    public class C17896e implements InterfaceC17898g {
        public C17896e() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public int mo76917a() {
            return 4;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public void mo76918a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f53496e, "IDelegateLifeCycleCall onStart:");
            lifecycleDelegate.onStart();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$f */
    public class C17897f implements InterfaceC17898g {
        public C17897f() {
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public int mo76917a() {
            return 5;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.InterfaceC17898g
        /* JADX INFO: renamed from: a */
        public void mo76918a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f53496e, "IDelegateLifeCycleCall onResume:");
            lifecycleDelegate.onResume();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.DeferredLifecycleHelper$g */
    public interface InterfaceC17898g {
        /* JADX INFO: renamed from: a */
        int mo76917a();

        /* JADX INFO: renamed from: a */
        void mo76918a(LifecycleDelegate lifecycleDelegate);
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.f53497a;
    }

    public void onCreate(Bundle bundle) {
        m76915a(bundle, new C17894c(bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m76915a(bundle, new C17895d(frameLayout, layoutInflater, viewGroup, bundle));
        return frameLayout;
    }

    public void onDestroy() {
        T t = this.f53497a;
        if (t != null) {
            t.onDestroy();
        } else {
            m76914a(0);
        }
    }

    public void onDestroyView() {
        T t = this.f53497a;
        if (t != null) {
            t.onDestroyView();
        } else {
            m76914a(1);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        m76915a(bundle2, new C17893b(activity, bundle, bundle2));
    }

    public void onLowMemory() {
        T t = this.f53497a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onPause() {
        T t = this.f53497a;
        if (t != null) {
            t.onPause();
        } else {
            m76914a(5);
        }
    }

    public void onResume() {
        m76915a((Bundle) null, new C17897f());
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t = this.f53497a;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f53498b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        m76915a((Bundle) null, new C17896e());
    }

    public void onStop() {
        T t = this.f53497a;
        if (t != null) {
            t.onStop();
        } else {
            m76914a(4);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76914a(int i) {
        while (!this.f53499c.isEmpty() && this.f53499c.getLast().mo76917a() >= i) {
            this.f53499c.removeLast();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m76915a(Bundle bundle, InterfaceC17898g interfaceC17898g) {
        T t = this.f53497a;
        if (t != null) {
            interfaceC17898g.mo76918a(t);
            return;
        }
        if (this.f53499c == null) {
            this.f53499c = new LinkedList<>();
        }
        this.f53499c.add(interfaceC17898g);
        if (bundle != null) {
            Bundle bundle2 = this.f53498b;
            if (bundle2 == null) {
                this.f53498b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.f53500d);
    }
}
