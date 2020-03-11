package beykent.g7.scts.Repository;

import beykent.g7.scts.Model.packet;
import org.springframework.stereotype.Repository;
import scts.Repository.genericRepository;

@Repository
public interface packetRepository extends genericRepository<packet, String> {

    packet findByPacketId(String packetId);

}
