package Synchronization.AdderSubractorAtomicDatatype;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    //    int value=0; Without Synchronization /locks just use Atomic datatype as below
    AtomicInteger value = new AtomicInteger(0);
}
