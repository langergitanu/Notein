package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGG extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\mnum", "\\mden", "\\mfName", "\\me", "\\mlim", "\\msup", "\\msub", "\\mdeg");
    private boolean zzXuC;

    public zzYGG(zzYFT zzyft) {
        super(zzyft);
        this.zzXuC = false;
    }

    private void zzW(zzZ0J zzz0j) {
        zzYiM().zzWI(new OfficeMath(this.zzXw4.getDocument(), zzz0j, new zzYEF()));
    }

    private int zzYhQ() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    private void zzp(zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 3) {
            super.zzT(zzyet);
        } else {
            zzq(zzyet);
        }
    }

    private void zzq(zzYET zzyet) throws Exception {
        if (this.zzXuC) {
            zzYiM().zzYht();
        }
        zzW(new zzZ0H(zzYEO.zzBx(zzyet.getName())));
        this.zzXuC = true;
    }

    private void zzr(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 5 || iZzTP == 6) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzs(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 5 || iZzTP == 6) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzt(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 6) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzu(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 5 || iZzTP == 6) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzv(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 7) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzw(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 5 || iZzTP == 6) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzx(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3 || iZzTP == 4) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzy(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 2 || iZzTP == 3) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    private void zzz(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0 || iZzTP == 1) {
            zzq(zzyet);
        } else {
            super.zzT(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ != 139) {
            if (iZzYhQ == 215) {
                zzw(zzyet);
                return;
            }
            if (iZzYhQ != 216) {
                switch (iZzYhQ) {
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                        break;
                    default:
                        switch (iZzYhQ) {
                            case 207:
                            case 208:
                            case 211:
                                break;
                            case 209:
                                zzz(zzyet);
                                return;
                            case 210:
                                zzy(zzyet);
                                return;
                            case 212:
                            case 213:
                                zzx(zzyet);
                                return;
                            default:
                                switch (iZzYhQ) {
                                    case 223:
                                        zzv(zzyet);
                                        break;
                                    case 224:
                                        zzu(zzyet);
                                        break;
                                    case 225:
                                        zzt(zzyet);
                                        break;
                                    case 226:
                                        zzs(zzyet);
                                        break;
                                    case 227:
                                        zzr(zzyet);
                                        break;
                                    case 228:
                                        break;
                                    default:
                                        super.zzT(zzyet);
                                        break;
                                }
                                return;
                        }
                        break;
                }
            }
        }
        zzp(zzyet);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ != 138 && iZzYhQ != 139) {
            switch (iZzYhQ) {
                case 196:
                case 197:
                case 198:
                case 199:
                    break;
                default:
                    switch (iZzYhQ) {
                        case 207:
                        case 208:
                        case 209:
                        case 210:
                        case 211:
                        case 212:
                        case 213:
                        case 214:
                        case 215:
                        case 216:
                            break;
                        default:
                            switch (iZzYhQ) {
                                case 223:
                                case 224:
                                case 225:
                                case 226:
                                case 227:
                                case 228:
                                    break;
                                default:
                                    super.zzYjb();
                                    break;
                            }
                            return;
                    }
                    break;
            }
        }
        if (this.zzXuC) {
            zzYiM().zzYht();
        }
        zzYiM().zzYht();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 138) {
            zzW(new zzZ02());
            return;
        }
        if (iZzYhQ == 139) {
            zzW(new zzZ03());
            return;
        }
        switch (iZzYhQ) {
            case 196:
                zzW(new zzZ0I());
                break;
            case 197:
                zzW(new zzZ0F());
                break;
            case 198:
                zzW(new zzZ0E());
                break;
            case 199:
                zzW(new zzZ0D());
                break;
            default:
                switch (iZzYhQ) {
                    case 207:
                        zzW(new zzZ0C());
                        break;
                    case 208:
                        zzW(new zzZ0G());
                        break;
                    case 209:
                        zzW(new zzZ0B());
                        break;
                    case 210:
                        zzW(new zzZ0A());
                        break;
                    case 211:
                        zzW(new zzZ09());
                        break;
                    case 212:
                        zzW(new zzZ08());
                        break;
                    case 213:
                        zzW(new zzYZV());
                        break;
                    case 214:
                        zzW(new zzZ07());
                        break;
                    case 215:
                        zzW(new zzZ04());
                        break;
                    case 216:
                        zzW(new zzZ01());
                        break;
                    default:
                        switch (iZzYhQ) {
                            case 223:
                                zzW(new zzYZZ());
                                break;
                            case 224:
                                zzW(new zzZ00());
                                break;
                            case 225:
                                zzW(new zzYZX());
                                break;
                            case 226:
                                zzW(new zzYZY());
                                break;
                            case 227:
                                zzW(new zzYZW());
                                break;
                            case 228:
                                zzW(new zzZ06());
                                break;
                            default:
                                super.zzZ(zzyet);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[FALL_THROUGH] */
    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        if (type != 151 && type != 156 && type != 162 && type != 175 && type != 181 && type != 193 && type != 164 && type != 165) {
            switch (type) {
                case 139:
                    return new zzYGG(this.zzXw4);
                case 140:
                case 141:
                case 142:
                    break;
                default:
                    switch (type) {
                        default:
                            switch (type) {
                                default:
                                    switch (type) {
                                        default:
                                            switch (type) {
                                                case 195:
                                                case 200:
                                                    break;
                                                case 196:
                                                case 197:
                                                case 198:
                                                case 199:
                                                    break;
                                                default:
                                                    switch (type) {
                                                        case 207:
                                                        case 208:
                                                        case 209:
                                                        case 210:
                                                        case 211:
                                                        case 212:
                                                        case 213:
                                                        case 214:
                                                        case 215:
                                                        case 216:
                                                            break;
                                                        case 217:
                                                            break;
                                                        default:
                                                            switch (type) {
                                                                case 223:
                                                                case 224:
                                                                case 225:
                                                                case 226:
                                                                case 227:
                                                                case 228:
                                                                    break;
                                                                case 229:
                                                                    break;
                                                                default:
                                                                    return super.zzZ(zzyhp);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        case 187:
                                        case 188:
                                        case 189:
                                        case 190:
                                            return new zzYGF(this.zzXw4);
                                    }
                                case 183:
                                case 184:
                                case 185:
                                    break;
                            }
                        case 168:
                        case 169:
                        case 170:
                            break;
                    }
                    break;
            }
        }
        return new zzYGF(this.zzXw4);
    }
}
