package com.aspose.slides.internal.p294n9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.orion.notein.domain.models.UserConstants;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.to */
/* JADX INFO: loaded from: classes4.dex */
public final class C6775to extends AbstractC6781v4 {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC6781v4 f18730k4 = new C6775to();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<Integer, AbstractC6747ar> f18732x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private ReentrantReadWriteLock f18731kk = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: kk */
    private static AbstractC6747ar m26827kk(int i) {
        switch (i) {
            case UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK /* 10003 */:
                return new C6755du(UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK, 20949);
            case 10008:
                return new C6755du(10008, 20936);
            case 38598:
                return new C6750bz(i, 28598);
            case 50225:
            case 52936:
                break;
            case 50227:
            case 51936:
                return new C6755du(i, 936);
            case 51932:
                return new C6789yj();
            case 51949:
                return new C6755du(i, 20949);
            case 54936:
                return new C6748b3();
            default:
                switch (i) {
                    case 50220:
                    case 50221:
                    case 50222:
                        break;
                    default:
                        switch (i) {
                            case 57002:
                            case 57003:
                            case 57004:
                            case 57005:
                            case 57006:
                            case 57007:
                            case 57008:
                            case 57009:
                            case 57010:
                            case 57011:
                                return new C6784wy(i);
                            default:
                                return null;
                        }
                }
                break;
        }
        return new C6746ak(i);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m26828x1() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6781v4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6747ar mo26829k4(int i) {
        AbstractC6747ar abstractC6747ar = null;
        if (i < 0 || i > 65535) {
            return null;
        }
        if (i == 0) {
            int iM26828x1 = m26828x1();
            if (iM26828x1 != 0) {
                return mo26829k4(iM26828x1);
            }
            return null;
        }
        this.f18731kk.readLock().lock();
        try {
            AbstractC6747ar[] abstractC6747arArr = {null};
            boolean zTryGetValue = this.f18732x1.tryGetValue(Integer.valueOf(i), abstractC6747arArr);
            AbstractC6747ar abstractC6747arM26827kk = abstractC6747arArr[0];
            if (!zTryGetValue) {
                int iM26850kk = AbstractC6785x1.m26850kk(i);
                try {
                    if (iM26850kk == 1) {
                        abstractC6747arM26827kk = new C6750bz(i);
                    } else {
                        if (iM26850kk != 2) {
                            abstractC6747arM26827kk = m26827kk(i);
                            if (abstractC6747arM26827kk != null) {
                            }
                            this.f18731kk.readLock().unlock();
                            return abstractC6747ar;
                        }
                        abstractC6747arM26827kk = new C6755du(i);
                    }
                    AbstractC6747ar[] abstractC6747arArr2 = {null};
                    boolean zTryGetValue2 = this.f18732x1.tryGetValue(Integer.valueOf(i), abstractC6747arArr2);
                    abstractC6747ar = abstractC6747arArr2[0];
                    if (zTryGetValue2) {
                        this.f18731kk.readLock().unlock();
                        return abstractC6747ar;
                    }
                    this.f18732x1.addItem(Integer.valueOf(i), abstractC6747arM26827kk);
                    this.f18731kk.readLock().lock();
                    this.f18731kk.writeLock().unlock();
                } finally {
                    this.f18731kk.readLock().lock();
                    this.f18731kk.writeLock().unlock();
                }
                this.f18731kk.readLock().unlock();
                this.f18731kk.writeLock().lock();
            }
            this.f18731kk.readLock().unlock();
            return abstractC6747arM26827kk;
        } catch (Throwable th) {
            this.f18731kk.readLock().unlock();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6781v4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6747ar mo26830k4(String str) {
        int iM26859x1 = C6788yd.m26859x1(str);
        if (iM26859x1 == 0) {
            return null;
        }
        return mo26829k4(iM26859x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6781v4 m26826k4() {
        return f18730k4;
    }
}
