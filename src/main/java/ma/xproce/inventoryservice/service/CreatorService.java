package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorService implements CreatorManager{

    @Autowired
    private CreatorRepository creatorRepository;
    @Override
    public Creator addCreator(Creator creator) {
        try {
            return creatorRepository.save(creator);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Creator updateCreator(Creator creator) {
        try {
            return creatorRepository.save(creator);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteCreator(Creator creator) {
        try {
            creatorRepository.delete(creator);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public List<Creator> getAllCreators() {
        return creatorRepository.findAll();
    }
}
