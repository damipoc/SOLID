package com.qa.d;

import java.util.List;

public class Project {

    private List<Developer> developers;

    public Project(List<Developer> devs) {

        this.developers = devs;

    }

    public void impl() {
        developers.forEach(d->d.develop());
    }
    
}
